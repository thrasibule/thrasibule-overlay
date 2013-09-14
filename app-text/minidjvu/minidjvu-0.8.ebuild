# Copyright 1999-2013 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

DESCRIPTION="A command line utility for bitonal djvu encoding"
HOMEPAGE="http://minidjvu.sourceforge.net/"
SRC_URI="http://sourceforge.net/projects/${PN}/files/${PN}/${PV}/${P}.tar.gz"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~x86"
IUSE=""

DEPEND="media-libs/tiff"
RDEPEND="${DEPEND}"

src_prepare() {
	sed -i -e "/install-doc$/d" Makefile.in||die
}

src_compile() {
	emake -j1
}

src_install() {
	default
	doman doc/minidjvu.1
}
