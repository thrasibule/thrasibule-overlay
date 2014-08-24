# Copyright 1999-2014 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

OASIS_BUILD_DOCS=1
OASIS_BUILD_TESTS=1
inherit oasis

DESCRIPTION="Pure OCaml regular expressions"
HOMEPAGE="http://github.com/ocaml/ocaml-re"
SRC_URI="http://github.com/ocaml/${PN}/archive/${P}.tar.gz"

LICENSE="LGPL-2.1-with-linking-exception"
SLOT="0"
KEYWORDS="~x86"
IUSE=""

RDEPEND=""
DEPEND="${DEPEND}"

DOCS=( README.md CHANGES TODO.txt )

S="${WORKDIR}/${PN}-${P}"
