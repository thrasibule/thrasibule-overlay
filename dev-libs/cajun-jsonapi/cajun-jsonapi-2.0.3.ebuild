# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

DESCRIPTION="A json API implement in C++ headers"
HOMEPAGE="http://github.com/cajun-jsonapi/cajun-jsonapi"
SRC_URI="https://github.com/cajun-jsonapi/${PN}/archive/${PV}.tar.gz"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"
IUSE=""

DEPEND=""
RDEPEND=""

src_install() {
	dodir /usr/include/cajun/json
	insinto /usr/include/cajun/json
	doins json/*
}
