# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Id$

EAPI=5

inherit cmake-utils

DESCRIPTION="Conflict-driven nogood learning answer set solver"
HOMEPAGE="http://potassco.sourceforge.net"
SRC_URI="http://downloads.sourceforge.net/project/potassco/${PN}/${PV}/${P}-source.tar.gz"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~x86"

src_install() {
	dobin "${BUILD_DIR}"/bin/clasp
}
