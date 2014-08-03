# Copyright 2014 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

PYTHON_COMPAT=( python{2_6,2_7,3_3,3_4} pypy)

inherit distutils-r1

DESCRIPTION="MySQL Connector/Python, Python Driver for MySQL."
HOMEPAGE="http://dev.mysql.com/downloads/connector/python/"
SRC_URI="mirror://mysql/Downloads/Connector-Python/${P}.tar.gz"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~x86"
IUSE="test"

RDEPEND=""
DEPEND="${RDEPEND}
	dev-python/setuptools[${PYTHON_USEDEP}]"

DOCS=( CHANGES.txt README.txt )
