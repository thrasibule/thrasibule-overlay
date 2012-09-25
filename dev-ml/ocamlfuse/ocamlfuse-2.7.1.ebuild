# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

inherit oasis
DESCRIPTION="OCaml binding for fuse"
HOMEPAGE="http://sourceforge.net/apps/mediawiki/ocamlfuse"
SRC_URI="https://github.com/downloads/astrada/${PN}/${P}-cvs~oasis1.tar.gz"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~x86"
IUSE=""

DEPEND=">=dev-ml/camlidl-0.9.5
	dev-lang/ocaml"
RDEPEND="${DEPEND}"
S="${WORKDIR}/${P}-cvs~oasis1"
DOCS=( "README.md" )
