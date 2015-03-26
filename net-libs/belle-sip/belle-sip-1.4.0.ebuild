# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: /var/cvsroot/gentoo-x86/net-libs/pjsip/pjsip-2.1-r2.ebuild,v 1.3 2014/03/09 13:07:51 aballier Exp $

EAPI="5"

inherit eutils java-pkg-opt-2 multilib

DESCRIPTION="A SIP stack in C, with an object oriented API"
HOMEPAGE="http://www.linphone.org/technical-corner/belle-sip"
SRC_URI="https://github.com/BelledonneCommunications/${PN}/archive/${PV}.tar.gz -> ${P}.tar.gz"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~amd64 ~x86"
IUSE="ssl test"

RDEPEND="=dev-libs/antlr-c-3.4
	ssl? ( net-libs/polarssl )"
DEPEND="${RDEPEND}
	>=dev-java/antlr-3.3:3
	test? ( dev-util/cunit )"

src_configure (){
	./autogen.sh
	econf $(use_enable ssl tls) \
		$(use_enable test tests) \
		ANTLR="java -cp $(java-config -p antlr-3)"
}

src_test() {
	make test
}
