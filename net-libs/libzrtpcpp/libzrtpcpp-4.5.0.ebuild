# Copyright 1999-2016 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Id$

EAPI=5

inherit cmake-utils

DESCRIPTION="GNU RTP stack for the zrtp protocol developed by Phil Zimmermann"
HOMEPAGE="http://www.gnutelephony.org/index.php/GNU_ZRTP"
# https://github.com/wernerd/ZRTPCPP/releases
SRC_URI="http://github.com/wernerd/ZRTPCPP/archive/tags/V${PV}.tar.gz -> ${P}.tar.gz"

KEYWORDS="~amd64 ~x86"
LICENSE="GPL-3"
IUSE="sqlcipher sqlite"
SLOT="0/4"

RDEPEND="
	dev-libs/openssl:0=
	sqlite? ( dev-db/sqlite:3= )
	sqlcipher? ( dev-db/sqlcipher )"

DEPEND="${RDEPEND}
	virtual/pkgconfig"

REQUIRED_USE="sqlite? ( !sqlcipher )"

DOCS=( AUTHORS README.md )

S="${WORKDIR}/ZRTPCPP-tags-V${PV}"

src_configure() {
	# note: building only core since that's what ortp wants

	local mycmakeargs=(
		-DCORE_LIB=yes
		-DCRYPTO_STANDALONE=no
		-DSDES=no
		-DSQLITE=$(usex sqlite)
		-DSQLCIPHER=$(usex sqlcipher)
	)

	cmake-utils_src_configure
}
