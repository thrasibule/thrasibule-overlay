# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

inherit findlib

DESCRIPTION="LR(1) parser generator for the OCaml language"
HOMEPAGE="http://gallium.inria.fr/~fpottier/menhir/"
SRC_URI="http://gallium.inria.fr/~fpottier/menhir/${P}.tar.gz"

LICENSE="QPL-1.0 LGPL-2"
SLOT="0"
KEYWORDS="~x86"
IUSE="ocamlopt"

DEPEND=">=dev-lang/ocaml-3.09[ocamlopt?]"
RDEPEND="${DEPEND}"

src_compile() {
	if use ocamlopt; then
		emake PREFIX="/usr"
	else
		emake TARGET=byte all PREFIX="/usr"
	fi
}

src_install() {
	export PREFIX="${D}/usr"
	findlib_src_install
}
