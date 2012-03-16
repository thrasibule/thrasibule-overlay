# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

inherit elisp-common

DESCRIPTION="An OCaml development environment for emacs"
HOMEPAGE="http://www.typerex.org
https://github.com/OCamlPro/typerex"
SRC_URI="http://www.typerex.org/pub/${P}.tar.gz"

LICENSE="LGPL-2.1-linking-exception GPL-3 LGPL-3 QPL"
SLOT="0"
KEYWORDS="~x86"

IUSE="doc"
DEPEND="=app-emacs/auto-complete-9999
	>=dev-lang/ocaml-3.11.2"
RDEPEND="${DEPEND}"
SITEFILE="50${PN}-gentoo.el"

src_prepare() {
	sed -i "s/auto-complete-mode/auto-complete/g" configure || die
}

src_configure() {
	econf --disable-auto-complete\
	--with-lispdir="${SITELISP}"
}

src_install() {
	emake BINDIR="${D}/usr/bin" install-binaries
	use doc && dodoc -r docs/user-manual
	dodoc README Changelog.txt emacs.append
	elisp-install ${PN} tools/ocp-typerex-ide/emacs/typerex.{el,elc} || die
	elisp-site-file-install "${FILESDIR}/${SITEFILE}" || die
}

pkg_postinst() {
	elisp-site-regen
	einfo "If you want to use the auto-complete feature, you need to set the"
	einfo "ocp-auto-complete variable by adding (setq ocp-auto-complete t)"
	einfo "to your .emacs. You can find other useful settings in"
	einfo "/usr/share/doc/${PF}/emacs.append"
}

pkg_postrm() {
	elisp-site-regen
}
