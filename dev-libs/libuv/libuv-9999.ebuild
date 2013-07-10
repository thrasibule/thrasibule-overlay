# Copyright 1999-2013 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

inherit autotools flag-o-matic git-2 toolchain-funcs eutils

DESCRIPTION="A new platform layer for Node"
HOMEPAGE="http://github.com/joyent/libuv"
EGIT_REPO_URI="git://github.com/JuliaLang/libuv.git"
#EGIT_REPO_URI="git://github.com/joyent/libuv.git"

LICENSE="MIT"
SLOT="0"
KEYWORDS="~amd64 ~x86"
IUSE=""

EGIT_BRANCH="julia0.3"

#src_prepare() {
#	eautoreconf
#}

src_compile() {
	tc-export CC AR
	emake libuv.so
	emake libuv.a
}

src_install() {
	insinto /usr/include
	doins -r include/*
	dolib.a libuv.a
	dolib.so libuv.so
}
