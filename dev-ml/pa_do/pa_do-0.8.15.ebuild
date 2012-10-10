# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

OASIS_BUILD_DOCS=1
OASIS_BUILD_TESTS=1

inherit oasis

DESCRIPTION="A syntax extension to ease the writing of efficient arithmetic
expressions in OCaml"
HOMEPAGE="http://pa-do.forge.ocamlcore.org"
SRC_URI="http://forge.ocamlcore.org/frs/download.php/1018/${P}.tar.gz"

LICENSE="LGPL-2.1-with-linking-exception"
SLOT="0"
KEYWORDS="~x86"
IUSE="test"

DEPEND="dev-lang/ocaml"
RDEPEND="${DEPEND}"

DOCS=( "README.md" )
