# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

inherit oasis

DESCRIPTION="OCaml binding for fuse"
HOMEPAGE="http://sourceforge.net/apps/mediawiki/ocamlfuse"
SRC_URI="https://github.com/astrada/ocamlfuse/archive/v2.7.1_cvs2.tar.gz -> ${P}.tar.gz"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~x86 ~amd64"
IUSE=""

DEPEND=">=dev-ml/camlidl-0.9.5
	dev-lang/ocaml"
RDEPEND="${DEPEND}"
S="${WORKDIR}/${P}_cvs2"

DOCS=( "README.md" )
