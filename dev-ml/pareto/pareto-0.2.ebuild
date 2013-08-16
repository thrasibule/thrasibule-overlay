# Copyright 1999-2013 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

inherit oasis

OASIS_BUILD_DOCS=1
OASIS_BUILD_TESTS=1

DESCRIPTION="GSL powered OCaml statistics library"
HOMEPAGE="http://github.com/superbobry/pareto"
SRC_URI="http://github.com/superbobry/pareto/archive/${PV}.tar.gz"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"
IUSE="doc examples test"

DEPEND="dev-ml/gsl-ocaml"
RDEPEND="${DEPEND}"

src_prepare() {
	oasis_configure_opts="$(use_enable examples)"
}
