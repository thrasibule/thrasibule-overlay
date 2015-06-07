# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

inherit findlib

DESCRIPTION="A Camlp4 extension to beautify monadic expressions"
HOMEPAGE="http://www.cas.mcmaster.ca/~carette/pa_monad/"
SRC_URI="http://www.cas.mcmaster.ca/~carette/pa_monad/${PN}.tar.gz"

LICENSE="LGPL-2.1-with-linking-exception"
SLOT="0"
KEYWORDS="~x86 ~amd64"
IUSE="doc"

DEPEND="dev-lang/ocaml"
RDEPEND="${DEPEND}"
S="${WORKDIR}"

src_compile(){
	use doc && emake doc
}
src_install() {
	findlib_src_preinst
	make DESTDIR="${D}" findlib-install||die
	use doc && dohtml -r html-doc/
	dodoc README ChangeLog
}
