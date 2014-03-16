# Copyright 1999-2014 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5
PYTHON_COMPAT=( python{2_6,2_7} )

inherit distutils-r1

DESCRIPTION="Djvu encoder with foreground/background separation"
SRC_URI="http://didjvu.googlecode.com/files/${P}.tar.gz"
HOMEPAGE="http://code.google.com/p/didjvu"
KEYWORDS="~x86"
SLOT="0"
LICENSE="GPL-3"
IUSE=""

RDEPEND="app-text/djvu
	app-text/gamera"
