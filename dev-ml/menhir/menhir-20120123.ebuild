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
KEYWORDS="~x86 ~amd64"
IUSE="+ocamlopt"

DEPEND=">=dev-lang/ocaml-3.09[ocamlopt?]"
RDEPEND="${DEPEND}"

src_prepare() {
	export PREFIX="${D}/usr"
	sed -i 's,echo "let libdir = \\"${libdir}\\"" > src/installation.ml,echo "let libdir = \\"/usr/share/menhir\\"" > src/installation.ml,' Makefile
	if ! use ocamlopt ; then
		export TARGET=byte
	fi
}

src_compile() {
	emake -j1
}

src_install() {
	findlib_src_install
}
