# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

JAVA_PKG_OPT_USE="gui"
VIRTUALX_REQUIRED="manual"

inherit eutils autotools check-reqs eutils fdo-mime flag-o-matic \
	java-pkg-opt-2 fortran-2 flag-o-matic toolchain-funcs virtualx

DESCRIPTION="Scientific software package for numerical computations"
LICENSE="CeCILL-2"
HOMEPAGE="http://www.scilab.org/"
SRC_URI="http://www.scilab.org/download/${PV}-alpha-1/${P}.tar.gz"

SLOT="0"
IUSE="bash-completion debug doc fftw +gui +matio nls openmp
	static-libs test tk +umfpack xcos"
REQUIRED_USE="xcos? ( gui ) doc? ( gui )"

# ALL_LINGUAS variable defined in configure.ac
LINGUAS="fr_FR zh_CN zh_TW ca_ES es_ES pt_BR"
for l in ${LINGUAS}; do
	IUSE="${IUSE} linguas_${l}"
done
LINGUASLONG="de_DE ja_JP it_IT uk_UA pl_PL ru_RU"
for l in ${LINGUASLONG}; do
	IUSE="${IUSE} linguas_${l%_*}"
done

KEYWORDS="~amd64 ~x86"

CDEPEND="dev-libs/libpcre
	dev-libs/libxml2:2
	sys-devel/gettext
	sys-libs/ncurses
	sys-libs/readline
	virtual/lapack
	dev-java/hdf-java
	fftw? ( sci-libs/fftw:3.0 )
	gui? (
		dev-java/avalon-framework:4.2
		dev-java/batik:1.7
		dev-java/commons-io:1
		dev-java/flexdock:0
		dev-java/fop:0
		dev-java/gluegen:2
		dev-java/javahelp:0
		dev-java/jeuclid-core:0
		dev-java/jgoodies-looks:2.0
		>=dev-java/jlatexmath-0.9.4:0
		dev-java/jogl:2
		>=dev-java/jrosetta-1.0.4:0
		dev-java/scirenderer:0
		dev-java/skinlf:0
		dev-java/xmlgraphics-commons:1.3
		virtual/opengl
		doc? ( dev-java/saxon:6.5 )
		xcos? ( dev-java/jgraphx:1.8 ) )
	matio? ( <sci-libs/matio-1.5 )
	tk? ( dev-lang/tk )
	umfpack? ( sci-libs/umfpack )"

DEPEND="${CDEPEND}
	virtual/fortran
	virtual/pkgconfig
	debug? ( dev-util/lcov )
	gui? (
		>=virtual/jdk-1.5
		doc? ( app-text/docbook-xsl-stylesheets
			   >=dev-java/jlatexmath-fop-0.9.4
			   dev-java/xml-commons-external )
		xcos? ( dev-lang/ocaml ) )
	test? ( gui? ( ${VIRTUALX_DEPEND} ) )"

S="${WORKDIR}/${PN}"
DOCS=( "ACKNOWLEDGEMENTS" "READE_UNIX" "Readme_Visual.txt" )

pkg_pretend() {
	use doc && CHECKREQS_MEMORY="512M" check-reqs_pkg_pretend
}

pkg_setup() {
	if use openmp; then
		if [[ $(tc-getCC) == *gcc* ]] && ! tc-has-openmp; then
			ewarn "You are using a gcc without OpenMP capabilities"
			die "Need an OpenMP capable compiler"
		fi
		FORTRAN_NEED_OPENMP=1
	fi
	FORTRAN_STANDARD="77 90"
	fortran-2_pkg_setup
	java-pkg-opt-2_pkg_setup
	ALL_LINGUAS=
	for l in ${LINGUAS}; do
		use linguas_${l} && ALL_LINGUAS="${ALL_LINGUAS} ${l}"
	done
	for l in ${LINGUASLONG}; do
		use linguas_${l%_*} && ALL_LINGUAS="${ALL_LINGUAS} ${l}"
	done
	export ALL_LINGUAS
}

src_prepare() {
	epatch \
		"${FILESDIR}"/${P}-fortran-link.patch \
		# "${FILESDIR}"/${P}-no-lhpi.patch
	#epatch "${FILESDIR}/${PN}-fastconfigure.patch"
	# Increases java heap to 512M when available, when building docs
	use doc && epatch "${FILESDIR}/java-heap-5.3.3.patch"
	# fix scilib path
	#epatch "${FILESDIR}/scilab-5.3.3-scilib-fix.patch"
	# bug 9268 reported upstream http://bugzilla.scilab.org/show_bug.cgi?id=9268
	#epatch "${FILESDIR}"/bug_9268.diff
	#bug 9883 upstream
	#epatch "${FILESDIR}/disablebuildhelp.patch"
	#bug 10244 upstream
	#mv  modules/call_scilab/examples/call_scilab/NET/VB.NET/My\ Project/ \
	#modules/call_scilab/examples/call_scilab/NET/VB.NET/My_Project||die
	#bug 9824 upstream
	sed -i "/BLAS_LIBS=$/d" m4/libsmath.m4
	sed -i "s|/jhdf5|/hdf-java|g" m4/hdf5.m4
	sed -i -e "s|/usr/lib/jogl|/usr/lib/jogl-2|" \
		   -e "s|/usr/lib64/jogl|/usr/lib64/jogl-2|" configure.ac
	sed -i -e "s|/usr/lib/gluegen|/usr/lib/gluegen-2|" \
		   -e "s|/usr/lib64/gluegen|/usr/lib64/gluegen-2|" \
		   -e "s|AC_CHECK_LIB(\[gluegen2-rt|AC_CHECK_LIB([gluegen-rt|" \
	configure.ac

	#epatch "${FILESDIR}/scilab-5.3.3-allow-hdf-1.8.7.patch"


	#sed -i "s|-L\$SCI_SRCDIR/bin/|-L\$SCI_SRCDIR/bin/ \
	#	-L$(java-config -i gluegen-2) \
	#	-L$(java-config -i jogl-2)|" \
	#	configure.ac || die

	sed -i -e "s/jogl/jogl-2/" -e "s/gluegen/gluegen-2/" -e "s/jhdf5/hdf-java/" \
		etc/librarypath.xml || die
	mkdir jar; cd jar
	java-pkg_jar-from jgraphx-1.8,jlatexmath,hdf-java,flexdock,skinlf
	java-pkg_jar-from jgoodies-looks-2.0,jrosetta,scirenderer
	java-pkg_jar-from jogl-2 jogl.all.jar jogl2.jar
	java-pkg_jar-from gluegen-2 gluegen-rt.jar gluegen2-rt.jar
	cd ..

	java-pkg-opt-2_src_prepare
	eautoreconf
}

src_configure() {
	if use gui; then
		export JAVA_HOME="$(java-config -O)"
	else
		unset JAVAC
	fi

	export BLAS_LIBS="$(pkg-config --libs blas)"
	export LAPACK_LIBS="$(pkg-config --libs lapack)"
	export F77_LDFLAGS="${LDFLAGS}"
	# gentoo bug #302621
	has_version sci-libs/hdf5[mpi] && \
		export CXX=mpicxx CC=mpicc FC=mpif77 F77=mpif77

	econf \
		--enable-relocatable \
		--disable-rpath \
		-with-docbook="${EPREFIX}/usr/share/sgml/docbook/xsl-stylesheets" \
		$(use_enable debug) \
		$(use_enable debug code-coverage) \
		$(use_enable debug debug-C) \
		$(use_enable debug debug-CXX) \
		$(use_enable debug debug-fortran) \
		$(use_enable debug debug-java) \
		$(use_enable debug debug-linker) \
		$(use_enable doc build-help) \
		$(use_enable nls) \
		$(use_enable nls build-localization) \
		$(use_enable static-libs static) \
		$(use_enable test compilation-tests) \
		$(use_with fftw) \
		$(use_with gui) \
		$(use_with gui javasci) \
		$(use_with matio) \
		$(use_with openmp) \
		$(use_with tk) \
		$(use_with umfpack) \
		$(use_with xcos) \
		$(use_with xcos modelica)
}

src_compile() {
	emake || die "emake failed"
	if use doc; then
		emake doc || die "emake failed"
	fi
}

src_install() {
	base_src_install
	#find "${ED}" -name '*.la' -delete || die
	prune_libtool_files --all
	insinto /usr/share/mime/packages
	doins "${FILESDIR}/${PN}.xml"
}

pkg_postinst() {
	fdo-mime_mime_database_update
}
