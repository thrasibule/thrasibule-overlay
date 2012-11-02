# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

EGIT_REPO_URI="git://github.com/JuliaLang/julia.git"

inherit git-2 elisp-common eutils multilib

DESCRIPTION="The Julia Language: a fresh approach to technical computing"
HOMEPAGE="http://julialang.org/"
SRC_URI=""

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~amd64 ~x86"
IUSE="atlas doc emacs notebook"

RDEPEND=">=sys-devel/llvm-3.0
	sys-libs/readline
	emacs? ( !app-emacs/ess )
	atlas? ( sci-libs/atlas )
	!atlas? (
		sci-libs/openblas
		sci-libs/lapack-reference
		)
	>=sci-libs/suitesparse-4.0
	sci-libs/arpack
	sci-libs/fftw
	dev-libs/gmp
	sys-libs/libunwind
	dev-libs/libpcre
	sci-mathematics/glpk
	sys-libs/zlib
	notebook? ( www-servers/lighttpd )"

DEPEND="sys-devel/make
	dev-vcs/git
	dev-lang/perl
	sys-devel/m4
	${RDEPEND}"

src_prepare() {
	epatch "${FILESDIR}/julia-ld.patch" \
		"${FILESDIR}/julia-pcre-version.patch"

	# Folder /usr/include/suitesparse does not exists, everything should be in /usr/include
	sed -e "s|SUITESPARSE_INC = -I /usr/include/suitesparse|SUITESPARSE_INC = |g" \
	-i deps/Makefile

	export USE_DEBIAN=1
	# do not set the RPATH	
	sed -e "/RPATH = /d" -e "/RPATH_ORIGIN = /d" -i Make.inc
	# do not overwrite the BLAS and LAPACK variables
	sed -e "/LIBBLAS =/d" -e "/LIBLAPACK =/d" \
		-e "/LIBBLASNAME =/d" -e "/LIBLAPACKNAME =/d" -i Make.inc
	export LIBBLAS=$(pkg-config --libs blas)
	export LIBLAPACK=$(pkg-config --libs lapack)
	if use atlas; then
		export LIBBLASNAME=libf77blas
		export LIBLAPACKNAME=libatllapack
	else
		export LIBBLASNAME=libopenblas
		export LIBLAPACKNAME=libreflapack
	fi
}

src_compile() {
	emake -j1
	use doc && emake -C doc html
	use emacs && elisp-compile contrib/julia-mode.el
}

src_install() {
	emake test/unicode
	dobin usr/bin/julia-release-{basic,readline}
	dosym "${D}"/usr/bin/julia-release-readline /usr/bin/julia
	mkdir -p "${D}/usr/$(get_libdir)/" || die
	cp -R -L usr/lib/julia "${D}/usr/$(get_libdir)/"
	if use notebook; then
		dobin usr/bin/julia-release-webserver
		sed -e "s|etc|lib/julia/etc|" -i usr/bin/launch-julia-webserver
		dobin usr/bin/launch-julia-webserver
		insinto "/usr/$(get_libdir)/julia/etc"
		doins usr/etc/lighttpd.conf
	fi
	insinto "/usr/$(get_libdir)/julia/lib"
	# we copy the native libraries inside this directory because julia ships
	# its own version of Rmath.so which would collide with dev-lang/R
	insopts -m 0755
	doins usr/lib/*.so
	cat > 99julia <<-EOF
		LDPATH=/usr/$(get_libdir)/julia/lib
	EOF
	doenvd 99julia
	use doc && dodoc -r doc/_build/html/
	dodoc README.md
	if use emacs; then
		elisp-install "${PN}" contrib/julia-mode.el
		elisp-site-file-install "${FILESDIR}"/63julia-gentoo.el
	fi
}

pkg_postinst() {
	use emacs && elisp-site-regen
}

pkg_postrm() {
	use emacs && elisp-site-regen
}
src_test() {
	emake -C test LD_LIBRARY_PATH=usr/lib || die "Running tests failed"
}
