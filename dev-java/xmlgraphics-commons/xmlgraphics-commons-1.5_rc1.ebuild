# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: /var/cvsroot/gentoo-x86/dev-java/xmlgraphics-commons/xmlgraphics-commons-1.3.1.ebuild,v 1.7 2011/12/31 16:46:14 sera Exp $

EAPI=4
JAVA_PKG_IUSE="doc examples source test"
VIRTUALX_REQUIRED="manual"
VIRTUALX_COMMAND="eant"

inherit java-pkg-2 java-ant-2 virtualx

MY_P=${P/_/}
DESCRIPTION="A library of several reusable components used by Apache Batik and Apache FOP."
HOMEPAGE="http://xmlgraphics.apache.org/commons/index.html"
SRC_URI="mirror://apache/xmlgraphics/commons/source/${MY_P}-src.tar.gz"

LICENSE="Apache-2.0"
SLOT="1.5"
KEYWORDS="amd64 ppc ppc64 x86 ~amd64-linux ~x86-linux ~ppc-macos ~x86-macos ~sparc-solaris ~x86-solaris"
IUSE="jpeg"

RESTRICT="test"
CDEPEND="dev-java/commons-io:1
	 >=dev-java/commons-logging-1:0"
DEPEND=">=virtual/jdk-1.5
		test? (
			dev-java/ant-junit4
			)
		${CDEPEND}"
# test also depends on dev-java/mockito, need to package it
RDEPEND=">=virtual/jre-1.5
		${CDEPEND}"

S="${WORKDIR}/${MY_P}"

# TODO investigate producing .net libraries
# strategies for non sun jdk's/jre's

JAVA_ANT_IGNORE_SYSTEM_CLASSES="true"
JAVA_ANT_REWRITE_CLASSPATH="true"

src_unpack() {
	unpack ${A}
	cd "${S}"

	rm -v "${S}"/lib/*.jar || die
}

src_prepare() {
	mkdir lib/build || die
}

EANT_GENTOO_CLASSPATH="commons-io-1,commons-logging"
EANT_EXTRA_ARGS="-Djdk15.present=true"
EANT_BUILD_TARGET="jar-main"
EANT_DOC_TARGET="javadocs"

src_compile() {
	java-pkg-2_src_compile $( !(use jpeg) && echo -Dinternal-codecs.disabled=true)
}

src_test() {
	java-pkg_jarfrom --into lib junit-4,commons-io-1
	ANT_TASKS="ant-junit4" virtualmake -Djdk15.present=true junit
}

src_install(){
	java-pkg_newjar build/${MY_P}.jar
	use source && java-pkg_dosrc src/java/org
	use doc && java-pkg_dojavadoc build/javadocs
}
