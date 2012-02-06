# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

inherit findlib

DESCRIPTION="A cross-platform library for manipulating the terminal"
HOMEPAGE="http://forge.ocamlcore.org/projects/lambda-term/"
SRC_URI="https://forge.ocamlcore.org/frs/download.php/673/${P}.tar.gz"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"
IUSE="doc"

DEPEND="dev-lang/ocaml[ocamlopt]
dev-ml/lwt[react]
dev-ml/zed"
RDEPEND="${DEPEND}"

src_configure() {
	./configure --destdir "${ED}" \
		--docdir "/usr/share/doc/${PF}/html/" \
		--prefix "/usr/"
}

src_compile() {
	emake
	use doc && emake doc
}

src_test() {
	emake test
}

src_install() {
	findlib_src_install
	dodoc CHANGES
}
