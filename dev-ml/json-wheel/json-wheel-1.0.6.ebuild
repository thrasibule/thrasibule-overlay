# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

inherit findlib

DESCRIPTION="A JSON library for OCaml"
HOMEPAGE="http://mjambon.com/json-wheel.html"
SRC_URI="http://mjambon.com/${P}.tar.gz"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"
IUSE="doc"

DEPEND="dev-lang/ocaml
	dev-ml/ocamlnet"
RDEPEND="${DEPEND}"

src_compile() {
	emake -j1 bcl ncl
	use doc && make html
}

src_install() {
	findlib_src_install
	use doc && dohtml -r html/
}
