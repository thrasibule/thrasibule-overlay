# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

PYTHON_COMPAT=(python3_4)
inherit distutils-r1

DESCRIPTION="Creates djvu files with positional ocr, metadata, and bookmarks."
SRC_URI="https://github.com/strider1551/${PN}/archive/v${PV}.tar.gz -> ${P}.tar.gz"
HOMEPAGE="https://github.com/strider1551/${PN}"
KEYWORDS=""
SLOT="0"
LICENSE="GPL-3"
IUSE="cuneiform minidjvu"

RDEPEND="app-text/djvu
	app-text/tesseract
	media-gfx/imagemagick
	cuneiform? ( app-text/cuneiform )
	minidjvu? ( app-text/minidjvu )"
