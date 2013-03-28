# Copyright 1999-2013 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

JAVA_PKG_IUSE="doc examples source"

inherit java-pkg-2 java-ant-2

DESCRIPTION="A Java API to render LaTeX"
SRC_URI="http://forge.scilab.org/index.php/p/${PN}/downloads/get/${PN}-src-all-${PV}.zip"
HOMEPAGE="http://forge.scilab.org/index.php/p/jlatexmath"

IUSE="fop"
DEPEND=">=virtual/jdk-1.5
		app-arch/unzip
		fop? ( dev-java/fop:0 )"
RDEPEND=">=virtual/jre-1.5
		fop? ( dev-java/xmlgraphics-commons:1.5
		       dev-java/batik:1.7
			   dev-java/avalon-framework:4.2
			   dev-java/commons-io:1
			   dev-java/xml-commons-external:1.3 )"

LICENSE="GPL-2"
SLOT="1"
KEYWORDS="~amd64 ~x86"

EANT_BUILD_TARGET="buildJar"
EANT_DOC_TARGET="doc"

src_configure() {
	if use fop; then
		EANT_BUILD_TARGET="${EANT_BUILD_TARGET} fop"
		sed -i \
			-e "s:/usr/share/java/fop.jar:$(java-pkg_getjar fop fop.jar):g" \
			-e "s:/usr/share/java/xmlgraphics-commons.jar:$(java-pkg_getjar \
			xmlgraphics-commons-1.5 xmlgraphics-commons.jar):g" \
			-e "s:/usr/share/java/batik.jar:$(java-pkg_getjar batik-1.7 batik-all.jar):g" \
			-e "s:/usr/share/java/avalon-framework.jar:$(java-pkg_getjar avalon-framework-4.2 avalon-framework.jar):g" \
			-e "s:/usr/share/java/commons-io.jar:$(java-pkg_getjar commons-io-1 commons-io.jar):g" \
			-e "s:/usr/share/java/commons-logging.jar:$(java-pkg_getjar commons-logging commons-logging.jar):g" \
			-e "s:/usr/share/java/xml-apis-ext.jar:$(java-pkg_getjar xml-commons-external-1.3 xml-apis-ext.jar):g" \
			fop.properties || die
	fi
}

src_install() {
	java-pkg_newjar dist/"${P}.jar" "${PN}.jar"
	use fop && java-pkg_newjar plugin/fop/dist/"${PN}-fop-${PV}.jar" \
		"${PN}-fop.jar"
	use doc && java-pkg_dojavadoc doc
	use source && java-pkg_dosrc src/org
	use examples && java-pkg_doexamples examples
}
