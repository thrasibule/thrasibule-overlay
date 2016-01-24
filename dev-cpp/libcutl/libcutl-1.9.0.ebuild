# Copyright 1999-2016 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Id$

EAPI=6

inherit eutils versionator

DESCRIPTION="Library of C++ utilities -- meta-programming tests, smart pointers, containers"
HOMEPAGE="http://codesynthesis.com/projects/libcutl/"
SRC_URI="http://codesynthesis.com/download/${PN}/$(get_version_component_range 1-2)/${P}.tar.bz2"

LICENSE="MIT"
SLOT="0"
KEYWORDS="~amd64 ~x86"
IUSE="static-libs"

RDEPEND="dev-libs/boost
	dev-libs/expat"
DEPEND="${RDEPEND}"

src_configure() {
	econf --with-external-boost \
		--with-external-expat
}

src_install() {
	prune_libtool_files --all
	default
}
