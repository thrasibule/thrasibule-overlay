# Copyright 1999-2014 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI="5"

PYTHON_COMPAT=( python2_5 python2_6 python2_7 )

inherit python-single-r1

DESCRIPTION="Highly efficient file backup system based on the git packfile format"
HOMEPAGE="https://github.com/bup/bup"
SRC_URI="https://github.com/bup/${PN}/archive/${PV/_/-}.tar.gz -> ${P}.tar.gz"
KEYWORDS="~amd64 ~x86"

LICENSE="LGPL-2"
SLOT="0"
IUSE="acl attr +fuse parity tornado"

DEPEND="${PYTHON_DEPS}"
RDEPEND="${DEPEND}
	attr? ( dev-python/pyxattr )
	acl? ( dev-python/pylibacl )
	fuse? ( dev-python/fuse-python )
	parity? ( app-arch/par2cmdline )
	tornado? ( www-servers/tornado  )"

S="${WORKDIR}/${P/_/-}"

src_configure() {
	true
}

src_install() {
	emake install DESTDIR="${D}"
	python_fix_shebang "${ED}"usr/bin

	dodoc README.md DESIGN CODINGSTYLE
}
