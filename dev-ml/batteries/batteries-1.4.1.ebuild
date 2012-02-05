# Copyright 1999-2011 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

inherit findlib eutils

DESCRIPTION="The community-maintained foundation library for your OCaml projects"
HOMEPAGE="http://batteries.forge.ocamlcore.org/"
SRC_URI="http://forge.ocamlcore.org/frs/download.php/684/${P}.tar.gz"

LICENSE="LGPL-2.1-linking-exception"
SLOT="0"
KEYWORDS="~amd64 ~x86"
IUSE="doc test +ocamlopt"

DEPEND=">=dev-lang/ocaml-3.11[ocamlopt?]
	dev-ml/camomile"
RDEPEND="${DEPEND}
	dev-ml/ounit"

src_prepare() {
	if ! use ocamlopt; then
		export BATTERIES_NATIVE=false
		export BATTERIES_NATIVE_SHLIB=false
	fi
}

src_compile() {
	emake
	if use doc; then
		emake doc
	fi
}

src_test() {
	make test
}

src_install() {
	findlib_src_preinst
	make install
	if use doc;then
		make DOCROOT=${D}/usr/share/doc/${PF} install-doc || "make install-doc failed"
		dodoc README.md ChangeLog
	fi
}
