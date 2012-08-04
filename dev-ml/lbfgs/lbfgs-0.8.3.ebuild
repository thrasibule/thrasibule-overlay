# Copyright 1999-2011 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4
inherit oasis

DESCRIPTION="OCaml bindings to the L-BFGS-B algorithm"
HOMEPAGE="https://forge.ocamlcore.org/projects/lbfgs/"
SRC_URI="http://forge.ocamlcore.org/frs/download.php/778/${P}.tar.gz"

LICENSE="BSD GPL-3"
SLOT="0"
KEYWORDS="~x86 ~amd64"
IUSE="debug doc +ocamlopt"

DEPEND=">=dev-lang/ocaml-3.12[ocamlopt?]
		virtual/fortran"
RDEPEND="${DEPEND}"
