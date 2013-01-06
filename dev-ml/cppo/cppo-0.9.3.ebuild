# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

DESCRIPTION="A C preprocessor for OCaml "
HOMEPAGE="http://mjambon.com/cppo.html"
SRC_URI="http://mjambon.com/releases/${PN}/${P}.tar.gz"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"
IUSE=""

DEPEND="dev-lang/ocaml"
RDEPEND="${DEPEND}"

src_install() {
	dobin cppo
	dodoc README Changes
}
