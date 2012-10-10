# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header:  $

EAPI=4

OASIS_BUILD_DOCS=1
OASIS_BUILD_TESTS=1

inherit oasis base

DESCRIPTION="Jane Street's monadic concurrency library"
HOMEPAGE="http://www.janestreet.com/ocaml"
SRC_URI="http://ocaml.janestreet.com/ocaml-core/${PV}/individual/${P}.tar.gz"

LICENSE="LGPL-2.1-with-linking-exception"
SLOT="0"
KEYWORDS="~x86 ~amd64"
IUSE="test"

RDEPEND=">=dev-ml/core-108.07.01
	>=dev-ml/sexplib-108.07.01
	>=dev-ml/bin-prot-108.07.01
	>=dev-ml/fieldslib-108.07.01
	>=dev-ml/pa_ounit-108.07.01"
DEPEND="${RDEPEND}
	test? ( >=dev-ml/ounit-1.1.2 )"
