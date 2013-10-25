# Copyright 1999-2013 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

inherit elisp-common

DESCRIPTION="Context sensitive completion for Ocaml"
HOMEPAGE="http://github.com/def-lkb/merlin/"
SRC_URI="http://github.com/def-lkb/merlin/archive/v${PV}.tar.gz"

LICENSE="MIT"
SLOT="0"
KEYWORDS="~x86"
IUSE="emacs vim"

DEPEND="dev-lang/ocaml
		dev-ml/menhir
		dev-ml/sexplib
		dev-ml/yojson"
RDEPEND="${DEPEND}"
SITEFILE="50${PN}-gentoo.el"

src_install() {
	newbin ocamlmerlin.native ocamlmerlin
	dobin omake-merlin jenga-merlin
	dodoc README.md TODO CHANGELOG PROTOCOL.md
	if use emacs; then 
		elisp-compile emacs/merlin.el ||die
		elisp-install "${PN}" emacs/merlin.{el,elc} ||die
		elisp-site-file-install "${FILESDIR}/${SITEFILE}" || die
	fi
}
src_test() {
	./test.sh ||die
}

pkg_postinst() {
	elisp-site-regen
	einfo "To use merlin, add (require 'merlin) to your init.el"
	einfo "and type M-x merlin-mode to enable merlin in a buffer"
	einfo "You might want to add a hook to tuareg to load it automatically"
	einfo "(add-hook 'tuareg-mode-hook 'merlin-mode)"
	einfo "To use autocomplete add (setq merlin-use-auto-complete-mode t)" 
}

pkg_postrm() {
	elisp-site-regen
}
