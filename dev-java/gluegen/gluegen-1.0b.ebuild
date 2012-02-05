# Copyright 1999-2010 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI="3"
WANT_ANT_TASKS="ant-antlr"

inherit java-pkg-2 java-ant-2

DESCRIPTION="GlueGen is a tool which automatically generates the Java and JNI
code necessary to call C libraries"
HOMEPAGE="http://www.jogamp.org/gluegen/www"
SRC_URI="http://github.com/sgothel/${PN}/zipball/${PV}06a -> gluegen-1.0b.zip"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86 ~amd64"
IUSE=""

RDEPEND=">=virtual/jre-1.4"

DEPEND=">=virtual/jdk-1.4
	dev-java/ant-core:0
	dev-java/antlr:0
	dev-java/cpptasks:0"

S="${WORKDIR}/sgothel-${PN}-09a903e"

src_prepare() {
	rm make/lib/{cdc_fp,cpptasks}.jar || die
	java-pkg_jar-from --build-only --into make/lib cpptasks
	sed -i -e 's/suncc/sunc89/g' make/${PN}-cpptasks.xml
	java-ant_rewrite-classpath "make/build.xml"
	sed -i -e 's/\(<target name="generate.c[^"]*" \)/\1 depends="init"/g' \
	        make/build.xml || die
}

src_compile() {
	cd make || die "Unable to enter make directory"
	local antflags="-Dantlr.jar=$(java-pkg_getjars antlr)"
	local gcp="$(java-pkg_getjars ant-core):$(java-config --tools)"

	eant ${antflags} -Dgentoo.classpath="${gcp}" all
}

src_install() {
	cd build || die "Unable to enter build directory"

	#build copies system antlr.jar here.  
	#So we just need to replace it.
	java-pkg_jar-from antlr
	rm "${PN}-rt-natives"*.jar
	java-pkg_dojar *.jar
	java-pkg_doso obj/*.so

	#If we are going to install the source
	#use source && java-pkg_dosrc src
}
