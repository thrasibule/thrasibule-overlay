# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: /var/cvsroot/gentoo-x86/net-voip/linphone/linphone-3.6.1.ebuild,v 1.1 2013/10/09 18:58:15 hasufell Exp $

EAPI=5

inherit autotools eutils multilib pax-utils

DESCRIPTION="Video softphone based on the SIP protocol"
HOMEPAGE="http://www.linphone.org/"
SRC_URI="http://github.com/BelledonneCommunications/${PN}/archive/${PV}.tar.gz -> ${P}.tar.gz"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~amd64 ~x86"
# TODO: run-time test for ipv6: does it need mediastreamer[ipv6]?
IUSE="assistant doc gsm-nonstandard gtk ipv6 libnotify ncurses nls speex sqlite srtp ssl test tools upnp video zrtp"

RDEPEND="
	>=media-libs/mediastreamer-2.11.0[video?,srtp?,zrtp?]
	=net-libs/belle-sip-1.4.0[ssl?]
	>=net-libs/ortp-0.24.0
	virtual/udev
	gtk? (
		dev-libs/glib:2
		>=gnome-base/libglade-2.4.0:2.0
		>=x11-libs/gtk+-2.4.0:2
		assistant? ( >=net-libs/libsoup-2.26 )
		libnotify? ( x11-libs/libnotify )
	)
	gsm-nonstandard? ( media-libs/mediastreamer[gsm] )
	ncurses? (
		sys-libs/readline:0
		sys-libs/ncurses
	)
	sqlite? ( dev-db/sqlite:3 )
	tools? ( dev-libs/libxml2 )
	upnp? ( net-libs/libupnp )"
DEPEND="${RDEPEND}
	virtual/pkgconfig
	doc? ( app-text/sgmltools-lite )
	nls? ( dev-util/intltool )"

IUSE_LINGUAS=" fr it de he ja es pl cs nl sr sv pt_BR hu ru zh_CN"
IUSE="${IUSE}${IUSE_LINGUAS// / linguas_}"

pkg_setup() {
	if ! use gtk && ! use ncurses ; then
		ewarn "gtk and ncurses are disabled."
		ewarn "At least one of these use flags are needed to get a front-end."
		ewarn "Only liblinphone is going to be installed."
	fi

	strip-linguas ${IUSE_LINGUAS}
}

src_prepare() {
	# variable causes "command not found" warning and is not
	# needed anyway
	sed -i \
		-e 's/$(ACLOCAL_MACOS_FLAGS)//' Makefile.am || die

	# fix path to use lib64
	sed -i \
		-e "s:lib\(/liblinphone\):$(get_libdir)\1:" configure.ac \
		|| die "patching configure.ac failed"

	# removing bundled libs dir prevent them to be reconf
	rm -r mediastreamer2 oRTP || die

	eautoreconf
}

src_configure() {
	local myeconfargs=(
		$(use_enable doc manual)
		$(use_enable nls)
		--disable-static
		$(use_enable ncurses console_ui)
		$(use_enable tools)
		$(use_enable upnp)
		$(use_enable gtk gtk_ui)
		$(use_enable libnotify notify)
		$(use_enable ipv6)
		--disable-truespeech
		$(use_enable gsm-nonstandard nonstandard-gsm)
		$(use_enable speex)
		# seems not used, TODO: ask in ml
		$(use_enable test tests)
		$(use_enable video)
		$(use_enable zrtp)
		$(usex gtk "$(use_enable assistant)" "--disable-assistant")
		# we don't want -Werror
		--disable-strict
		# don't bundle libs
		--enable-external-mediastreamer
		$(use_enable sqlite msg-storage)
		--enable-external-ortp
	)

	econf "${myeconfargs[@]}"
}

src_install() {
	emake DESTDIR="${D}" pkgdocdir="/usr/share/doc/${PF}" install # 415161
	dodoc AUTHORS BUGS ChangeLog NEWS README README.arm TODO
	pax-mark m "${ED%/}/usr/bin/linphone"
}

src_test() {
	cd tester ||die
	./liblinphone_tester
}