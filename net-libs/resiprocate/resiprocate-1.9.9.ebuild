# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

PYTHON_COMPAT=( python2_7 )
AUTOTOOLS_AUTORECONF=1
AUTOTOOLS_IN_SOURCE_BUILD=1

inherit autotools-utils python-single-r1

DESCRIPTION="Proxy SIP server"
HOMEPAGE="https://www.resiprocate.org"
SRC_URI="https://github.com/resiprocate/${PN}/archive/${P}.tar.gz"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"
IUSE="python"

DEPEND="dev-db/mysql
	dev-libs/popt
	dev-libs/openssl:0
	dev-cpp/asio
	dev-cpp/cajun-jsonapi
	net-dns/c-ares
	python? ( dev-python/pycxx )"
RDEPEND="${DEPEND}"

PATCHES=( "${FILESDIR}/${P}-berkdb.patch" )

S="${WORKDIR}/${PN}-${P}"

src_configure() {
	econf --with-repro \
		--with-ssl \
		--with-popt \
		--enable-dtls \
		--with-mysql \
		--with-c-ares \
		$(use_with python)
}
