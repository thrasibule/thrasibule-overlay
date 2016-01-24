# Copyright 1999-2016 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Id$

EAPI=6

inherit autotools eutils git-r3

if [[ ${PV} == "9999" ]]; then
	KEYWORKDS=""
else
	KEYWORDS="~amd64 ~x86"
	EGIT_COMMIT="e8521c"
fi

EGIT_REPO_URI="https://github.com/BelledonneCommunications/${PN}.git"

DESCRIPTION="RFC3261 compliant SIP User-Agent library"
HOMEPAGE="http://sofia-sip.sourceforge.net/"

LICENSE="LGPL-2.1+ BSD public-domain" # See COPYRIGHT
SLOT="0"
IUSE="ssl static-libs"

RDEPEND="dev-libs/glib:2
	ssl? ( dev-libs/openssl:0 )"
DEPEND="${RDEPEND}
	virtual/pkgconfig"

# tests are broken, see bugs 304607 and 330261
RESTRICT="test"

DOCS=( AUTHORS ChangeLog README README.developers RELEASE TODO )
EGIT_BRANCH="bc"

src_prepare() {
	default
	eautoreconf
}

src_configure() {
	econf \
		$(use_enable static-libs static) \
		$(use_with ssl openssl)
}

src_install() {
	prune_libtool_files --all
	default
}
