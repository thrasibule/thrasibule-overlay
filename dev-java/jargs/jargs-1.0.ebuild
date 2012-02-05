# Copyright 1999-2011 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=3

JAVA_PKG_IUSE="doc source examples"

inherit java-pkg-2 java-ant-2

DESCRIPTION="Command line option parsing suite for Java"
HOMEPAGE="http://jargs.sourceforge.net/"
SRC_URI="http://sourceforge.net/projects/jargs/files/jargs/1.0/${P}.zip/download
-> ${P}.zip"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"

IUSE="test"

COMMON_DEP=""

RDEPEND=">=virtual/jre-1.4
	${COMMON_DEP}"
DEPEND=">=virtual/jdk-1.4
	app-arch/unzip
	test? ( dev-java/junit )
	${COMMON_DEP}"

EANT_BUILD_TARGET="runtimejar"
EANT_DOC_TARGET="javadoc"

src_prepare() {
	rm "${S}"/lib/*.jar ||die
}

src_install() {
	java-pkg_dojar "lib/${PN}.jar"
	use doc && java-pkg_dojavadoc doc/api
	use source && java-pkg_dosrc src
	use examples && java-pkg_doexamples src/jargs/examples
}

src_test() {
	ANT_TASKS="junit"
	eant test||die
}
