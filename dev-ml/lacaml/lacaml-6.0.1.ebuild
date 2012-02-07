# Copyright 1999-2011 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

inherit eutils findlib

DESCRIPTION="BLAS/LAPACK interface for OCaml"
HOMEPAGE="http://forge.ocamlcore.org/projects/lacaml"
SRC_URI="http://forge.ocamlcore.org/frs/download.php/775/${P}.tar.gz"

LICENSE="LGPL-2.1-linking-exception"
SLOT="0"
KEYWORDS="~x86"
IUSE="doc"

DEPEND="dev-lang/ocaml[ocamlopt]
	virtual/blas
	virtual/lapack"
RDEPEND="${DEPEND}"

src_prepare() {
	sed -i "s/cclib = \[\]/cclib = [\"$(pkg-config --libs blas)\"\; \
 \"$(pkg-config --libs lapack)\"]/" setup.conf ||die
}

src_install() {
	findlib_src_install
	dodoc README.txt Changelog
}
