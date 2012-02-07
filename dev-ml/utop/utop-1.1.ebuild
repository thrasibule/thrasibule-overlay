# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

inherit findlib elisp-common

DESCRIPTION="A new toplevel for OCaml with completion and colorization"
HOMEPAGE="http://forge.ocamlcore.org/projects/utop/"
SRC_URI="http://forge.ocamlcore.org/frs/download.php/674/${P}.tar.gz"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"
IUSE="doc"

DEPEND="dev-lang/ocaml[ocamlopt]
dev-ml/lwt[react]
dev-ml/lambda-term
dev-ml/zed"
RDEPEND="${DEPEND}
virtual/emacs"

DOCS="CHANGES README"
SITEFILE="50${PN}-gentoo.el"

src_prepare() {
	sed -i "s/(\"utop.el.*)//" setup.ml
}

src_configure() {
	./configure --destdir "${ED}" \
		--prefix "/usr" \
		--docdir "/usr/share/${PF}/doc"
}

src_compile() {
	emake
	use doc && emake doc
	elisp-compile src/*.el || die
}

src_install() {
	findlib_src_install
	elisp-install "${PN}" src/*.el src/*.elc || die
	elisp-site-file-install "${FILESDIR}/${SITEFILE}" || die
}

pkg_postinst() {
	elisp-site-regen
}

pkg_postrm() {
	elisp-site-regen
}
