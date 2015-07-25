# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

inherit git-r3

DESCRIPTION="RFC3261 compliant SIP User-Agent library"
HOMEPAGE="http://sofia-sip.sourceforge.net/"
EGIT_REPO_URI="https://github.com/BelledonneCommunications/${PN}.git"

LICENSE="LGPL-2.1+ BSD public-domain" # See COPYRIGHT
SLOT="0"
KEYWORDS="~amd64 ~x86"
IUSE="ssl static-libs"

RDEPEND="dev-libs/glib:2
	ssl? ( dev-libs/openssl:0 )"
DEPEND="${RDEPEND}
	virtual/pkgconfig"

# tests are broken, see bugs 304607 and 330261
RESTRICT="test"

DOCS=( AUTHORS ChangeLog README README.developers RELEASE TODO )

src_prepare() {
	./autogen.sh
}

src_configure() {
	econf \
		$(use_enable static-libs static) \
		$(use_with ssl openssl)
}

src_install() {
	default
	rm -f "${ED}"usr/lib*/lib${PN}*.la
}
