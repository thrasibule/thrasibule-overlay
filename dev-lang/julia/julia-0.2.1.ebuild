# Copyright 1999-2014 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

inherit git-r3 elisp-common eutils multilib pax-utils

DESCRIPTION="High-performance programming language for technical computing"
HOMEPAGE="http://julialang.org/"
EGIT_REPO_URI="git://github.com/JuliaLang/julia.git"
EGIT_COMMIT="v0.2.1"

LICENSE="MIT"
SLOT="0"
KEYWORDS=""
IUSE="doc emacs"

RDEPEND="
	dev-libs/double-conversion
	dev-libs/gmp
	dev-libs/libpcre
	dev-libs/utf8proc
	dev-util/patchelf
	sci-libs/arpack
	sci-libs/fftw
	sci-libs/openlibm
	>=sci-libs/suitesparse-4.0
	sci-mathematics/glpk
	>=sys-devel/llvm-3.0
	>=sys-libs/libunwind-1.1
	sys-libs/readline
	sys-libs/zlib
	virtual/blas
	virtual/lapack
	emacs? ( !app-emacs/ess )"
DEPEND="${RDEPEND}
	virtual/pkgconfig"

src_prepare() {
	# /usr/include/suitesparse is for debian only
	# respect prefix, flags
	sed -i \
		-e 's|^\(SUITESPARSE_INC\s*=\).*||g' \
		-e 's|/usr/bin/||g' \
		-e "s|/usr/include|${EROOT%/}/usr/include|g" \
		deps/Makefile || die

	# mangle Make.inc for system libraries
	# do not set the RPATH
	local blasname=$($(tc-getPKG_CONFIG) --libs blas | \
		sed -e "s/-l\([a-z0-9]*\).*/lib\1/")
	local lapackname=$($(tc-getPKG_CONFIG) --libs lapack | \
		sed -e "s/-l\([a-z0-9]*\).*/lib\1/")

	echo -e "USE_SYSTEM_LLVM=1
USE_SYSTEM_LLVM=1
USE_SYSTEM_LIBUNWIND=1
USE_SYSTEM_READLINE=1
USE_SYSTEM_PCRE=1
USE_SYSTEM_BLAS=1
USE_SYSTEM_LAPACK=1
USE_SYSTEM_FFTW=1
USE_SYSTEM_GRISU=1
USE_SYSTEM_GMP=1
USE_SYSTEM_ARPACK=1
USE_SYSTEM_SUITESPARSE=1
USE_SYSTEM_RMATH=1
USE_SYSTEM_MPFR=1
USE_SYSTEM_ZLIB=1
USE_SYSTEM_UTFPROC=1
USE_BLAS64=0
LIBBLASNAME=${blasname}
LIBBLAS=$($(tc_getPKG_CONFIG) --libs blas)
LIBLAPACKNAME=${lapackname}
LIBLAPACK=$($(tc_getPKG_CONFIG) --libs lapack)" > Make.user

}

src_compile() {
	emake cleanall
	emake julia-release prefix="${EPREFIX}/usr" libdir="${EPREFIX}/usr/$(get_libdir)"
	pax-mark m usr/bin/julia-readline
	pax-mark m usr/bin/julia-basic
	emake
	use doc && emake -C doc html
	use emacs && elisp-compile contrib/julia-mode.el
}

src_test() {
	emake test
}

src_install() {
	emake install prefix="${D}/usr"
	cat > 99julia <<-EOF
		LDPATH=${EROOT%/}/usr/$(get_libdir)/julia
	EOF
	doenvd 99julia

	if use emacs; then
		elisp-install "${PN}" contrib/julia-mode.el
		elisp-site-file-install "${FILESDIR}"/63julia-gentoo.el
	fi
	use doc && dohtml -r doc/_build/html/*
	dodoc README.md
}

pkg_postinst() {
	use emacs && elisp-site-regen
}

pkg_postrm() {
	use emacs && elisp-site-regen
}
