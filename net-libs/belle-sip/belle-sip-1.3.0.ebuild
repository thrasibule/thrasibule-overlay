# Copyright 1999-2014 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: /var/cvsroot/gentoo-x86/net-libs/pjsip/pjsip-2.1-r2.ebuild,v 1.3 2014/03/09 13:07:51 aballier Exp $

EAPI="5"

inherit eutils java-pkg-opt-2 multilib

DESCRIPTION="A SIP stack in C, with an object oriented API"
HOMEPAGE="http://www.linphone.org/technical-corner/belle-sip"
SRC_URI="http://download.savannah.gnu.org/releases/linphone/${PN}/${P}.tar.gz"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~amd64 ~x86"
IUSE="ssl static test"

RDEPEND="=dev-libs/antlr-c-3.4
	ssl? ( net-libs/polarssl )"
DEPEND="${RDEPEND}
	>=dev-java/antlr-3.3:3
	test? ( dev-util/cunit )"

src_prepare() {
	epatch "${FILESDIR}/${P}-gccpragma.patch"
}

src_configure() {
	econf $(use_enable ssl tls) \
		$(use_enable test tests) \
		$(use_enable static) \
		ANTLR="java -cp $(java-config -p antlr-3)"
}

src_install() {
	prune_libtool_files
	default
}

src_test() {
	emake test
}
