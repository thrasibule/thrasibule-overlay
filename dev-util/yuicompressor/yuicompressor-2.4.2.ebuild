# Copyright 1999-2011 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=3

JAVA_PKG_IUSE="doc source"

inherit java-pkg-2 java-ant-2

DESCRIPTION=""
HOMEPAGE="http://developer.yahoo.com/yui/compressor/"
SRC_URI="http://yuilibrary.com/downloads/yuicompressor/${P}.zip"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"

IUSE=""

COMMON_DEP=""

RDEPEND=">=virtual/jre-1.4
	${COMMON_DEP}"
DEPEND=">=virtual/jdk-1.4
	app-arch/unzip
	${COMMON_DEP}"

EANT_BUILD_TARGET="build.jar"
EANT_DOC_TARGET=""

src_prepare() {
	cd "${S}/lib"
	rm -v *.jar || die
	java-pkg_jar-from jargs
	java-pkg_jar-from rhino js.jar rhino-1.6R7.jar
}

src_install() {
	java-pkg_dojar "${PN}.jar"
	use doc && java-pkg_dojavadoc build/javadoc
	use source && java-pkg_dosrc src
}

