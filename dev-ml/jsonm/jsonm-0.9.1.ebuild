# Copyright 1999-2014 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

inherit oasis

DESCRIPTION="Non-blocking streaming JSON codec for OCaml"
HOMEPAGE="http://erratique.ch/software/jsonm"
SRC_URI="http://erratique.ch/software/${PN}/releases/${P}.tbz"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"
IUSE="doc"

DEPEND="dev-lang/ocaml:=[ocamlopt]
	dev-ml/uutf"
RDEPEND="${DEPEND}"

DOCS=( README CHANGES )

