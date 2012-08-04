# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

OASIS_BUILD_DOCS=1
inherit oasis elisp-common

DESCRIPTION="A new toplevel for OCaml with completion and colorization"
HOMEPAGE="http://forge.ocamlcore.org/projects/utop/"
SRC_URI="http://forge.ocamlcore.org/frs/download.php/951/${P}.tar.gz"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"
IUSE="emacs"

DEPEND="dev-ml/lwt[react]
	>=dev-ml/lambda-term-1.2
	>=dev-ml/zed-1.2
	emacs? ( virtual/emacs )"
RDEPEND="${DEPEND}"

DOCS=( "CHANGES" "README" )
SITEFILE="50${PN}-gentoo.el"

src_prepare() {
	sed -i "s/(\"utop.el.*)//" setup.ml || die
}

src_compile() {
	oasis_src_compile
	if use emacs; then
		elisp-compile src/top/*.el
	fi
}

src_install() {
	oasis_src_install
	if use emacs; then
		elisp-install "${PN}" src/top/*.{el,elc} || die
		elisp-site-file-install "${FILESDIR}/${SITEFILE}" || die
	fi
}

pkg_postinst() {
	use emacs && elisp-site-regen
}

pkg_postrm() {
	use emacs && elisp-site-regen
}
