# Copyright 1999-2014 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

OASIS_BUILD_DOCS=1
inherit oasis

DESCRIPTION="BLAS/LAPACK interface for OCaml"
HOMEPAGE="http://mmottl.github.io/lacaml"
SRC_URI="http://github.com/mmottl/lacaml/releases/download/v${PV}/${P}.tar.gz"

LICENSE="LGPL-2.1-with-linking-exception"
SLOT="0"
KEYWORDS="~x86"
IUSE=""

RDEPEND="virtual/blas
	virtual/lapack"
DEPEND="${DEPEND}
	virtual/pkgconfig"

DOCS=( "README.md" "CHANGES.txt" "TODO.md" )

src_configure() {
	oasis_configure_opts_arr=( --override conf_cclib "$(pkg-config --libs blas lapack)" )
	oasis_src_configure
}
