# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Id$

EAPI=5

inherit eutils

DESCRIPTION="ZRTP key exchange protocol (RFC6189)"
HOMEPAGE="http://www.linphone.org/"
SRC_URI="http://linphone.org/releases/sources/${PN}/${P}.tar.gz"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~x86"
IUSE="debug doc test"

DEPEND="net-libs/polarssl
	dev-libs/libxml2"
RDEPEND="${DEPEND}"

src_test() {
	cd test && ./bzrtpTest
}
