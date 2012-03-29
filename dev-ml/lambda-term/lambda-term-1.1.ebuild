# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4
OASIS_BUILD_DOCS=1
inherit oasis

DESCRIPTION="A cross-platform library for manipulating the terminal"
HOMEPAGE="http://forge.ocamlcore.org/projects/lambda-term/"
SRC_URI="http://forge.ocamlcore.org/frs/download.php/673/${P}.tar.gz"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"
IUSE="test"

DEPEND="dev-ml/lwt[react]
dev-ml/zed"
RDEPEND="${DEPEND}"

DOCS=( "CHANGES" )
