# Copyright 1999-2016 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Id$

EAPI=6

inherit eutils git-r3 multilib

DESCRIPTION="A SIP stack in C, with an object oriented API"
HOMEPAGE="http://www.linphone.org/technical-corner/belle-sip"
EGIT_REPO_URI="http://github.com/BelledonneCommunications/${PN}.git"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS=""
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
		ANTLR="/usr/bin/antlr3"
}

src_test() {
	cd tester||die
	./belle_sip_tester||die
}

src_install() {
	default
	prune_libtool_files
}
