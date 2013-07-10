# Copyright 1999-2013 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

OASIS_BUILD_DOCS=1
inherit oasis elisp-common

DESCRIPTION="A new toplevel for OCaml with completion and colorization"
HOMEPAGE="http://forge.ocamlcore.org/projects/utop/"
SRC_URI="http://github.com/diml/utop/archive/${PV}.tar.gz"

LICENSE="BSD"
SLOT="0"
KEYWORDS="~x86"
IUSE="emacs"

DEPEND="dev-ml/lwt[react]
	>=dev-ml/lambda-term-1.2
	>=dev-ml/zed-1.2
	emacs? ( virtual/emacs )"
RDEPEND="${DEPEND}"

DOCS=( "CHANGES.md" "README.md" )
SITEFILE="50${PN}-gentoo.el"

src_prepare() {
	sed -i "s/(\"utop.el.*)//" setup.ml || die
}

src_compile() {
	oasis_src_compile
}

src_install() {
	oasis_src_install
	doman man/*
	if use emacs; then
		elisp-install "${PN}" src/top/*.el || die
		elisp-site-file-install "${FILESDIR}/${SITEFILE}" || die
	fi
	use doc && dohtml -r _build/utop-api.docdir
}

pkg_postinst() {
	use emacs && elisp-site-regen
}

pkg_postrm() {
	use emacs && elisp-site-regen
}
