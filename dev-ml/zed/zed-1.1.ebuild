# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

inherit findlib

DESCRIPTION="Zed is an abstract engine for text edition"
HOMEPAGE="http://forge.ocamlcore.org/projects/zed/"
SRC_URI="http://forge.ocamlcore.org/frs/download.php/672/${P}.tar.gz"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"
IUSE="doc"

DEPEND="dev-lang/ocaml[ocamlopt]
dev-ml/camomile
dev-ml/react"
RDEPEND="${DEPEND}"

src_prepare() {
	#bug 1105 upstream
	sed -i "s/<code>/(code)/" src/zed_edit.mli
}

src_configure() {
	./configure --docdir "/usr/share/doc/${PF}/html" \
		--destdir "${ED}"
}

src_compile() {
	emake
	use doc && emake doc
}

src_install() {
	findlib_src_install
	dodoc CHANGES
}
