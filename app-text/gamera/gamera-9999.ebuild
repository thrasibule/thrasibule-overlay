# Copyright 1999-2014 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5
PYTHON_COMPAT=( python{2_6,2_7} )

inherit distutils-r1 subversion

DESCRIPTION="Djvu encoder with foreground/background separation"
ESVN_REPO_URI="svn://svn.code.sf.net/p/gamera/code/trunk/gamera"
HOMEPAGE="http://gamera.informatik.hsnr.de"
KEYWORDS="~x86"
SLOT="0"
LICENSE="GPL-3"
IUSE=""

DEPEND="dev-python/numpy
	dev-python/wxpython
	media-libs/tiff
	media-libs/libpng"
RDEPEND="${DEPEND}"

python_configure_all() {
	mydistutilsargs=( --nowx )
}
