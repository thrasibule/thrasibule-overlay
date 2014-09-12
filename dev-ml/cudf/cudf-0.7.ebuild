# Copyright 1999-2014 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

inherit findlib

DESCRIPTION="A library to manipulate CUDF documents"
HOMEPAGE="http://www.mancoosi.org/cudf"
SRC_URI="https://gforge.inria.fr/frs/download.php/file/33593/${P}.tar.gz"

LICENSE="LGPL-3-with-linking-exception"
SLOT="0"
KEYWORDS="~x86"
IUSE="doc ocamlopt test"

RDEPEND="dev-lang/ocaml:=[ocamlopt?]
	dev-ml/extlib"

DEPEND="${RDEPEND}
	test? ( dev-ml/ounit )"

DOCS=( README TODO ChangeLog )

src_compile() {
	emake -j1 all
	use ocamlopt && emake -j1 opt
	use doc && emake -j1 doc
}

src_install() {
	default
	doman doc/cudf-check.1
	use doc && dohtml -r cudf.docdir/
}

src_test() {
	emake test
}
