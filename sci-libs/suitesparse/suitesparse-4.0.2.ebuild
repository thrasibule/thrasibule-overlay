# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: /var/cvsroot/gentoo-x86/sci-libs/suitesparse/suitesparse-3.7.0.ebuild,v 1.1 2012/01/20 06:01:39 bicatali Exp $

EAPI=4

DESCRIPTION="Meta package for a suite of sparse matrix tools"
HOMEPAGE="http://www.cise.ufl.edu/research/sparse/SuiteSparse/"

LICENSE="LGPL-2.1 GPL-2"
SLOT="0"

KEYWORDS="~amd64 ~x86"
IUSE="metis doc"
DEPEND=""
RDEPEND=">=sci-libs/suitesparse_config-${PV}
	>=sci-libs/amd-2.3.1[doc?]
	>=sci-libs/btf-1.2.0
	>=sci-libs/camd-2.3.1[doc?]
	>=sci-libs/ccolamd-2.8.0
	>=sci-libs/cholmod-2.0.1[doc?,metis?]
	>=sci-libs/colamd-2.8.0
	>=sci-libs/cxsparse-3.1.1
	>=sci-libs/klu-1.2.0[doc?]
	>=sci-libs/ldl-2.1.0[doc?]
	>=sci-libs/spqr-1.3.1[doc?,metis?]
	>=sci-libs/umfpack-5.6.1[doc?,metis?]"
