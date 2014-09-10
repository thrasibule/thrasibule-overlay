# Copyright 1999-2014 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

inherit eutils findlib

DESCRIPTION="A library to manipulate CUDF documents"
HOMEPAGE="http://gforge.inria.fr/projects/dose"
SRC_URI="https://gforge.inria.fr/frs/download.php/file/33677/${P}.tar.gz"

LICENSE="BSD"
SLOT="3"
KEYWORDS="~x86"
IUSE="doc zip bzip2 rpm4 rpm5 test"

RDEPEND="dev-lang/ocaml
	dev-ml/extlib
	dev-ml/cudf[ocamlopt]
	dev-ml/ocaml-re
	>=dev-ml/ocamlgraph-1.8.5"

DEPEND="${RDEPEND}
	test? ( dev-ml/ounit )"

DOCS=( README.architecture TODO CHANGES )

src_prepare() {
	epatch "${FILESDIR}"/*.patch
}

src_configure() {
	econf $(use rpm5 && echo "--with-rpm4") \
		$(use rpm4 && echo "--with-rpm5") \
		$(use bzip2 && echo "--with-bz2") \
		--with-ocamlgraph
}

src_compile() {
	emake -j1
}
