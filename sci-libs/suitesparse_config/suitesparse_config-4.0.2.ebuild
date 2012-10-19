# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: /var/cvsroot/gentoo-x86/sci-libs/ufconfig/ufconfig-3.7.1.ebuild,v 1.2 2012/10/15 21:14:59 naota Exp $

EAPI=4
inherit multilib toolchain-funcs

MY_PN=SuiteSparse_config
DESCRIPTION="Common configuration scripts for the SuiteSparse libraries"
HOMEPAGE="http://www.cise.ufl.edu/research/sparse/UFconfig"
SRC_URI="http://www.cise.ufl.edu/research/sparse/${MY_PN}/${MY_PN}-${PV}.tar.gz"

LICENSE="LGPL-2.1"
SLOT="0"
KEYWORDS="~alpha ~amd64 ~arm ~hppa ~ppc ~ppc64 ~sparc ~x86 ~amd64-fbsd ~x86-fbsd ~amd64-linux ~x86-linux ~x64-macos ~x86-macos"
IUSE="static-libs"
DEPEND=""

S="${WORKDIR}/${MY_PN}"

src_compile() {
	echo  "$(tc-getCC) ${CFLAGS} -fPIC -c SuiteSparse_config.c -o \  
SuiteSparse_config.lo"
	$(tc-getCC) ${CFLAGS} -fPIC -c SuiteSparse_config.c -o SuiteSparse_config.lo || die
	local sharedlink="-shared -Wl,-soname,libsuitesparseconfig$(get_libname ${PV})"
	[[ ${CHOST} == *-darwin* ]] && \
		sharedlink="-dynamiclib -install_name ${EPREFIX}/usr/$(get_libdir)/libufconfig$(get_libname ${PV})"
	echo "$(tc-getCC) ${LDFLAGS} ${sharedlink} -o \
libsuitesparseconfig$(get_libname ${PV}) SuiteSparse_config.lo"
	$(tc-getCC) ${LDFLAGS} ${sharedlink} -o libsuitesparseconfig$(get_libname ${PV}) \
		SuiteSparse_config.lo || die
	if use static-libs; then
		echo "$(tc-getCC) ${CFLAGS} -c SuiteSparse_config.c -o SuiteSparse_config.o"
		$(tc-getCC) ${CFLAGS} -c SuiteSparse_config.c -o SuiteSparse_config.o || die
		echo "$(tc-getAR) libsuitesparseconfig.a SuiteSparse_config.o"
		$(tc-getAR) cr libsuitesparseconfig.a libsuitesparconfig.o
	fi
}

src_install() {
	dolib.so libsuitesparseconfig$(get_libname ${PV})
	dosym libsuitesparseconfig$(get_libname ${PV}) \
	/usr/$(get_libdir)/libsuitesparseconfig$(get_libname)
	use static-libs && dolib.a libsuitespaseconfig.a
	insinto /usr/include
	doins SuiteSparse_config.h
	dodoc README.txt
}
