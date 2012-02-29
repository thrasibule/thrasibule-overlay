# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

inherit eutils findlib

DESCRIPTION="A libary to build xml trees typechecked by OCaml"
HOMEPAGE="http://ocsigen.org/tyxml/"
SRC_URI="http://www.ocsigen.org/download/${P}.tar.gz"

LICENSE="LGPL-2.1"
SLOT="0"
KEYWORDS="~x86"
IUSE="doc ocamlduce +ocamlopt"

DEPEND="dev-ml/findlib
dev-lang/ocaml[ocamlopt?]
dev-ml/ocamlnet
ocamlduce? ( dev-ml/ocamlduce )"
RDEPEND="${DEPEND}"

use_yes() {
	if use $1; then
		echo "YES"
	else
		echo "NO"
	fi
}

src_prepare() {
	myopts="OCAMLDUCE=$(use_yes ocamlduce)"
}

src_compile() {
	if use ocamlopt; then
		emake "$myopts"
	else
		emake "$myopts" byte
	fi
	use doc && emake doc "$myopts"
}

src_install() {
	findlib_src_preinst
	if use ocamlopt; then
		emake DESTIR="${D}" OCAMLDUCE="$myopts" install
	else
		emake DESTIR="${D}" OCAMLDUCE="$myopts" install-byte
	fi
	dodoc CHANGES README
	use doc && dohtml -r doc/api-html
}
