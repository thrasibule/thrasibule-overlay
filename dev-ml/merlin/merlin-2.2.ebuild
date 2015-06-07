# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

inherit elisp-common

DESCRIPTION="Context sensitive completion for Ocaml"
HOMEPAGE="http://github.com/the-lambda-church/merlin/"
SRC_URI="http://github.com/the-lambda-church/merlin/archive/v${PV}.tar.gz"

LICENSE="MIT"
SLOT="0"
KEYWORDS="~amd64"
IUSE="emacs vim"

DEPEND="dev-lang/ocaml:=
		dev-ml/findlib
		dev-ml/yojson:="
RDEPEND="${DEPEND}
	vim? ( app-editors/vim[python] )"
SITEFILE="50${PN}-gentoo.el"

src_prepare() {
	sed -i -e "s|site-lisp|site-lisp/merlin|" Makefile
}

src_configure() {
	econf --prefix "/usr" \
	--vimdir "/usr/share/vim/vimfiles"
}

src_compile() {
	if ! use emacs; then
		emake ocamlmerlin.native
	else
		emake all
	fi
}

src_install() {
	default
	use emacs && elisp-site-file-install "${FILESDIR}/${SITEFILE}" || die
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
