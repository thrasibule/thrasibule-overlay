# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI="5"

inherit eutils multilib

DESCRIPTION="A SIP stack in C, with an object oriented API"
HOMEPAGE="http://www.linphone.org/technical-corner/belle-sip"
SRC_URI="https://github.com/BelledonneCommunications/${PN}/archive/${PV}.tar.gz -> ${P}.tar.gz"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~amd64 ~x86"
IUSE="ssl test"

RDEPEND=">=dev-libs/antlr-c-3.4
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
	cd tester||die
	./belle_sip_tester||die
}
