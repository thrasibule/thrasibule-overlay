# Copyright 1999-2013 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: /var/cvsroot/gentoo-x86/net-voip/sflphone/sflphone-1.0.1.ebuild,v 1.3 2012/03/02 14:58:32 elvanor Exp $

EAPI=5

inherit git-2 kde4-base

DESCRIPTION="A kde client for sflphone"
HOMEPAGE="https://projects.kde.org/projects/playground/network/sflphone-kde"
EGIT_REPO_URI="git://anongit.kde.org/sflphone-kde"
LICENSE="GPL-3"
SLOT="0"
KEYWORDS="~amd64 ~x86"
IUSE=""

RDEPEND="=net-voip/sflphone-${PV}
		 dev-qt/qtgui
		 app-office/akonadi-server[sqlite]"

DEPEND="${RDEPEND}"

PATCHES=( "${FILESDIR}/${P}-include.patch" )
