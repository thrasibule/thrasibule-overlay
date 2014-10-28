# Copyright 1999-2014 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

inherit findlib

DESCRIPTION="Non-blocking streaming Unicode codec for OCaml"
HOMEPAGE="http://erratique.ch/software/uutf"
SRC_URI="http://erratique.ch/software/${PN}/releases/${P}.tbz"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"
IUSE="doc"

DEPEND="dev-lang/ocaml:=[ocamlopt]"
RDEPEND="${DEPEND}"

DOCS=( README.md TODO.md CHANGES.md )

src_compile() {
	./pkg/build true 
}

src_install() {
	findlib_src_preinst
	ocamlfind install uutf _build/pkg/META _build/src/uutf.a \
		_build/src/uutf.mli _build/src/uutf.cm{a,i,x,xa,xs}
	newbin utftrip.native utftrip
	use doc && dohtml -r doc/
}
