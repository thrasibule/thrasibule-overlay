# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

DESCRIPTION="Autohinting system for web fonts"
HOMEPAGE="http://www.freetype.org/ttfautohint/"
SRC_URI="http://download.savannah.gnu.org/releases/freetype/${P}.tar.gz"

KEYWORDS="~amd64 ~x86"
LICENSE="FTL GPL-2"
SLOT="0"
IUSE="gui"

DEPEND=">=media-libs/freetype-2.4.5
	>=media-libs/harfbuzz-0.9.19
	gui? ( dev-qt/qtgui:4 )"

DOCS=( AUTHORS ChangeLog NEWS README TODO)

src_configure() {
	econf --with-qt=$(usex gui "yes" "no")
}
