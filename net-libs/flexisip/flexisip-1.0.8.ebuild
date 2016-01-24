# Copyright 1999-2016 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Id$

EAPI=6

inherit autotools flag-o-matic

DESCRIPTION="A general purpose SIP proxy with media capabilities"
HOMEPAGE="http://flexisip.org"
SRC_URI="https://github.com/BelledonneCommunications/${PN}/archive/${PV}.tar.gz"

LICENSE="AGPL-3"
SLOT="0"
KEYWORDS="~x86"
IUSE="doc odbc presence protobuf redis transcoder"

DEPEND=">=net-libs/sofia-sip-1.13.3
	net-libs/ortp
	doc? ( virtual/latex-base )
	redis? ( dev-libs/hiredis )
	transcoder? ( media-libs/mediastreamer )
	odbc? ( dev-db/unixODBC )
	presence? ( >=net-libs/belle-sip-1.2.4
		        >=dev-cpp/xsd-4.0 )
	protobuf? ( dev-libs/protobuf )"
RDEPEND="${DEPEND}"

src_prepare() {
	default
	epatch "${FILESDIR}/${P}-fixdoc.patch"
	append-cxxflags -fpermissive
	eautoreconf
}

src_configure() {
	econf $(use_enable doc) \
		$(use_enable transcoder) \
		$(use_enable odbc) \
		$(use_enable redis) \
		$(use_enable protobuf) \
		--enable-xsd \
		--enable-presence
}
