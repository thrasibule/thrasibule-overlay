# Copyright 1999-2013 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: /var/cvsroot/gentoo-x86/net-libs/pjsip/pjsip-1.12.ebuild,v 1.3 2012/03/02 15:10:00 elvanor Exp $

EAPI=5

inherit eutils
DESCRIPTION="Multimedia communication libraries for building VoIP applications"
HOMEPAGE="http://www.pjsip.org/"
SRC_URI="http://www.pjsip.org/release/${PV}/pjproject-${PV}.tar.bz2"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~amd64 ~x86"
IUSE="alsa cli doc examples ext-sound g711 g722 g7221 gsm ilbc ipp libsamplerate l16
oss python speex video"

DEPEND="alsa? ( media-libs/alsa-lib )
	gsm? ( media-sound/gsm )
	ilbc? ( media-libs/libilbc )
	ipp? ( sci-libs/ipp )
	speex? ( media-libs/speex )
	media-libs/portaudio[alsa?]
	gsm? ( media-sound/gsm )
	libsamplerate? ( media-libs/libsamplerate )
	video? ( virtual/ffmpeg )
	ipp? ( sci-libs/ipp )"
RDEPEND="${DEPEND}"

S="${WORKDIR}/pjproject-${PV}.0"

src_prepare() {
	epatch "${FILESDIR}/${P}-libav.patch" \
		   "${FILESDIR}/libsamplerate.patch" \
		   "${FILESDIR}/${P}-srtp.patch" \
		   "${FILESDIR}/disable-samples.patch"
	# Remove target name from lib names
	sed -i -e 's/-$(TARGET_NAME)//g' \
		-e 's/= $(TARGET_NAME).a/= .a/g' \
		-e 's/-$(LIB_SUFFIX)/$(LIB_SUFFIX)/g' \
		$(find . -name '*.mak*' -o -name Makefile) || die "sed failed."

	# Fix hardcoded prefix and flags
	sed -i \
		-e 's/poll@/poll@\nexport PREFIX := @prefix@\n/g' \
		-e 's!prefix = /usr/local!prefix = $(PREFIX)!' \
		-e '/PJLIB_CFLAGS/ s/(_CFLAGS)/(_CFLAGS) -fPIC/g' \
		-e '/PJLIB_UTIL_CFLAGS/ s/(_CFLAGS)/(_CFLAGS) -fPIC/g' \
		Makefile \
		build.mak.in || die "sed failed."

	sed -i -e "s|@PREFIX@|${EPREFIX}/usr|" libpjproject.pc.in

	if use libsamplerate; then
		echo  "#define PJMEDIA_RESAMPLE_IMP PJMEDIA_RESAMPLE_LIBSAMPLERATE" \
			>> pjlib/include/pj/config_site.h
	fi
	
	sed -i -e "s/DIRS = .*$/DIRS = milenage/" third_party/build/Makefile

	pushd third_party
	rm -rf portaudio gsm ilbc resample speex srtp
	popd
}

src_configure() {
	# Disable through portage available codecs
	econf \
		--disable-ilbc-codec \
		$(use_enable alsa sound) \
		$(use_enable oss) \
		$(use_enable ext-sound) \
		$(use_enable g711 g711-codec) \
		$(use_enable l16 l16-codec) \
		$(use_enable g722 g722-codec) \
		$(use_enable g7221 g7221-codec) \
		$(use_enable ilbc ilbc-codec) \
		$(use_enable ipp) \
		$(use_enable video) \
		$(use_enable libsamplerate) \
		--with-external-gsm \
		--with-external-pa \
		--with-external-speex
		#$(use_enable small-filter) \
		#$(use_enable large-filter) \
		#$(use_enable ssl) \ #broken? sflphone doesn't compile if enabled or disabled
}

src_compile() {
	emake dep
	emake -j1
}

src_install() {
	DESTDIR="${D}" emake install

	if use cli; then
		dobin pjsip-apps/bin/pjsua
	fi

	if use python; then
		pushd pjsip-apps/src/python
		python setup.py install --prefix="${D}/usr/"
		popd
	fi

	if use doc; then
		dodoc README.txt README-RTEMS
	fi

	if use examples; then
		insinto "/usr/share/doc/${P}/examples"
		doins "${S}/pjsip-apps/src/samples/"*
	fi
}
