# Copyright 1999-2014 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

inherit findlib

DESCRIPTION="Declarative definition of command line interfaces for OCaml"
HOMEPAGE="http://erratique.ch/software/cmdliner"
SRC_URI="http://erratique.ch/software/${PN}/releases/${P}.tbz"

LICENSE="BSD3"
SLOT="0"
KEYWORDS="~x86"
IUSE="doc"

DEPEND=""
RDEPEND="${DEPEND}"

src_compile() {
	ocaml pkg/build.ml native=true native-dynlink=true
}

src_install() {
	findlib_src_preinst
	ocamlfind install cmdliner _build/pkg/META _build/src/cmdliner.a \
		_build/src/cmdliner.mli _build/src/cmdliner.cm{a,i,x,xa,xs}
	use doc && dohtml -r doc/
}
