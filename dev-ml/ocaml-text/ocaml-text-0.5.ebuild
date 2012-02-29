# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

inherit findlib

DESCRIPTION="A library for dealing with sequence of unicode characters \
in a convenient way"
HOMEPAGE="http://forge.ocamlcore.org/projects/ocaml-text/"
SRC_URI="http://forge.ocamlcore.org/frs/download.php/641/${P}.tar.gz"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"
IUSE="doc pcre"

DEPEND="dev-lang/ocaml[ocamlopt]
pcre? ( dev-ml/pcre-ocaml )"
RDEPEND="${DEPEND}"

src_configure() {
	./configure --destdir "${ED}" \
		--prefix "/usr" \
		--docdir "/usr/share/${PF}/doc" \
		$(use_enable pcre)
}

src_compile() {
	emake
	use doc && emake doc
}

src_install() {
	findlib_src_install
}
