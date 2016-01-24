# Copyright 1999-2016 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Id$

EAPI=6
PYTHON_COMPAT=( python{2_6,2_7} )

inherit distutils-r1

DESCRIPTION="Djvu encoder with foreground/background separation"
SRC_URI="mirror://sourceforge/${PN}/${P}.tar.gz"
HOMEPAGE="http://gamera.informatik.hsnr.de"
KEYWORDS="~x86"
SLOT="0"
LICENSE="GPL-3"
IUSE=""

DEPEND="dev-python/numpy
	dev-python/wxpython:3.0
	media-libs/tiff:0
	media-libs/libpng:0"
RDEPEND="${DEPEND}"
