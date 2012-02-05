# Copyright 1999-2011 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI="2"

inherit autotools base

DESCRIPTION="A C library for image processing and analysis"
HOMEPAGE="http://www.leptonica.com/"
SRC_URI="http://www.leptonica.com/source/${P}.tar.gz"
LICENSE="Apache-2.0"
SLOT="0"
KEYWORDS="~amd64 ~x86"
IUSE="gif jpeg png static-libs tiff utils zlib"

DEPEND="gif? ( media-libs/giflib )
	jpeg? ( media-libs/jpeg )
	png? ( media-libs/libpng )
	tiff? ( media-libs/tiff )
	zlib? ( sys-libs/zlib )"

RDEPEND="${DEPEND}"

DOCS=( README version-notes )

src_prepare() {
	epatch "${FILESDIR}/zlib-include.patch"
	eautoreconf

	# unhtmlize docs (they're just one big <pre/>s)
	local docf
	for _docf in ${DOCS[@]}; do
		awk '/<\/pre>/{s--} {if (s) print $0} /<pre>/{s++}' \
			${_docf}.html > ${_docf} || die 'awk failed.'
	done
}

src_configure() {
	econf \
		$(use_with gif giflib) \
		$(use_with jpeg) \
		$(use_with png libpng) \
		$(use_with tiff libtiff) \
		$(use_with zlib) \
		$(use_enable utils programs) \
		$(use_enable static-libs static) \
		|| die
}
