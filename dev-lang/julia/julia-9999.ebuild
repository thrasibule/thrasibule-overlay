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
		"${FILESDIR}/julia-pcre-version.patch" \
		"${FILESDIR}/julia-libdir.patch"

	# Folder /usr/include/suitesparse does not exists, everything should be in /usr/include
	sed -e "s|SUITESPARSE_INC = -I /usr/include/suitesparse|SUITESPARSE_INC = |g" \
	-i deps/Makefile

	export USE_DEBIAN=1
	# do not set the RPATH	
	sed -e "/^RPATH = /d" -e "/^RPATH_ORIGIN = /d" -i Make.inc
	# do not overwrite the BLAS and LAPACK variables
	sed -e "/^LIBBLAS =/d" -e "/^LIBLAPACK =/d" \
		-e "/^LIBBLASNAME =/d" -e "/^LIBLAPACKNAME =/d" -i Make.inc
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
	emake
	use doc && emake -C doc html
	if use notebook; then
		emake -C ui/webserver
		sed -e "s|etc|/share/julia/etc|" \
		-i usr/bin/launch-julia-webserver ||die
	fi
	use emacs && elisp-compile contrib/julia-mode.el
}

src_install() {
	emake -j1 install PREFIX="${D}/usr"
	cat > 99julia <<-EOF
		LDPATH=/usr/$(get_libdir)/julia
	EOF
	doenvd 99julia
	if use notebook; then
		cp -R ui/website "${D}/usr/share/julia"
		insinto /usr/share/julia/etc
		doins deps/lighttpd.conf
	fi
	if use emacs; then
		elisp-install "${PN}" contrib/julia-mode.el
		elisp-site-file-install "${FILESDIR}"/63-julia-gentoo.el
	fi
	use doc && dodoc -r doc/_build/html
	dodoc README.md
}

pkg_postinst() {
	use emacs && elisp-site-regen
}

pkg_postrm() {
	use emacs && elisp-site-regen
}

src_test() {
	emake -C test LD_LIBRARY_PATH=usr/lib:usr/lib/julia || die "Running tests failed"
}
