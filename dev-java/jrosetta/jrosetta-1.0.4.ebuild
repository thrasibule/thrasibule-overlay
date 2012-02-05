# Copyright 1999-2011 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

JAVA_MAVEN_BOOTSTRAP=Y
EANT_BUILD_TARGET="compile package"

inherit java-maven-2

DESCRIPTION="Provides a common base for graphical component to build a graphical console."
HOMEPAGE="http://dev.artenum.com/projects/jrosetta"
SRC_URI="http://guillaume.horel.free.fr/${P}.tar.bz2"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~x86 ~amd64"
IUSE="source"

DEPEND=">=virtual/jdk-1.5
	app-arch/unzip
	${COMMON_DEPEND}"

RDEPEND=">=virtual/jre-1.5
	${COMMON_DEPEND}"
JAVA_MAVEN_PROJECTS="modules/jrosetta-api
	modules/jrosetta-engine"
