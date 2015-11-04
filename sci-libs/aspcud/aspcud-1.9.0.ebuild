# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Id$

EAPI=5

inherit cmake-utils

DESCRIPTION="CUDF solver based on Answer Set Programming"
HOMEPAGE="http://potassco.sourceforge.net"
SRC_URI="http://downloads.sourceforge.net/project/potassco/${PN}/${PV}/${P}-source.tar.gz"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~x86"
IUSE=""

DEPEND="dev-libs/boost
	dev-util/re2c"
RDEPEND="sci-libs/clasp
	sci-libs/gringo"

S="${WORKDIR}/${P}-source"
