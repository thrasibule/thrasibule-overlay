# Copyright 1999-2014 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: /var/cvsroot/gentoo-x86/media-sound/pithos/pithos-20130808.ebuild,v 1.1 2013/08/08 21:24:48 chutzpah Exp $

EAPI=5

DISTUTILS_SINGLE_IMPL=1

PYTHON_COMPAT=( python3_3 python3_4)
inherit eutils distutils-r1

if [[ ${PV} == 99999999 ]]; then
	inherit git-r3
	EGIT_REPO_URI="git://github.com/kevinmehall/pithos.git
					https://github.com/kevinmehall/pithos.git"
else
	SRC_URI="https://github.com/${PN}/${PN}/archive/${PV}.tar.gz -> ${P}.tar.gz"
	S="${WORKDIR}/${P}"
fi

DESCRIPTION="A Pandora Radio (pandora.com) player for the GNOME Desktop"
HOMEPAGE="http://pithos.github.io/"

LICENSE="GPL-3"
SLOT="0"
KEYWORDS="~amd64 ~x86"
IUSE="gnome"

DEPEND="dev-python/setuptools[${PYTHON_USEDEP}]"

RDEPEND="dev-python/pyxdg[${PYTHON_USEDEP}]
	dev-python/pygobject:3[${PYTHON_USEDEP}]
	dev-python/gst-python:1.0[${PYTHON_USEDEP}]
	dev-python/dbus-python[${PYTHON_USEDEP}]
	dev-python/pylast[${PYTHON_USEDEP}]
	media-plugins/gst-plugins-meta:1.0[aac,http,mp3]
	gnome? ( gnome-base/gnome-settings-daemon )
	!gnome? ( dev-libs/keybinder:3 )"
