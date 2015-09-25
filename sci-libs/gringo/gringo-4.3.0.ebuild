# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Id$

EAPI=5

PYTHON_COMPAT=( python2_{6,7} )
inherit python-single-r1 scons-utils toolchain-funcs

DESCRIPTION="Grounding tools for (disjunctive) logic programs"
HOMEPAGE="http://potassco.sourceforge.net"
SRC_URI="http://downloads.sourceforge.net/project/potassco/${PN}/${PV}/${P}-source.tar.gz"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~x86"
IUSE="python"

DEPEND="dev-util/re2c
	sys-devel/bison"

S="${WORKDIR}/${P}-source"

src_configure() {
	myesconsargs=(
		CXX="$(tc-getCXX) --std=c++11"
		CXXFLAGS="${CXXFLAGS}"
		WITH_PYTHON="${EPYTHON}"
		CPPPATH="$(python_get_includedir)"
		)
}

src_compile() {
	escons clingo gringo
}

src_install() {
	dobin build/release/{gringo,clingo}
}
