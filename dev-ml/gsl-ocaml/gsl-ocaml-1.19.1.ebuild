# Copyright 1999-2016 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Id$

EAPI=5

OASIS_BUILD_DOCS=1
OASIS_BUILD_TESTS=1

inherit oasis

DESCRIPTION="OCaml bindings for the GSL library"
HOMEPAGE="http:///mmottl.github.io/gsl-ocaml"
SRC_URI="http://github.com/mmottl/${PN}/releases/download/v${PV}/${P}.tar.gz"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~x86"
IUSE="examples test"

DEPEND=">=sci-libs/gsl-1.10"
RDEPEND="${DEPEND}"

DOCS=( "CHANGES.txt" "README.md" "NOTES.md" "TODO.md" )

src_prepare() {
	oasis_configure_opts="$(use_enable examples)"
}
