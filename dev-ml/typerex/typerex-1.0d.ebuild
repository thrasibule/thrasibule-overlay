# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

inherit elisp-common

DESCRIPTION="An OCaml development environment for emacs"
HOMEPAGE="http://www.ocamlpro.com/typerex/doc/"
SRC_URI="http://www.ocamlpro.com/typerex/files/${P}.tar.bz2"

LICENSE="LGPL-2.1-linking-exception GPL-3 LGPL-3"
SLOT="0"
KEYWORDS="~x86"
IUSE="auto-complete"

DEPEND="auto-complete? ( app-emacs/auto-complete )
	>=dev-lang/ocaml-3.11.2"
RDEPEND="${DEPEND}"

src_prepare() {
	sed -i "s/auto-complete-mode/auto-complete/g" configure||die
}

src_configure() {
	local myconf="--with-lispdir=${SITELISP}"
	econf \
		$(use_enable auto-complete)
		"${myconf}"
}

src_install() {
	emake BINDIR="${D}/usr/bin" install-binaries
}
