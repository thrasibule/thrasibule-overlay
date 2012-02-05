# Copyright 1999-2011 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: /var/cvsroot/gentoo-x86/dev-ml/ocamlgsl/ocamlgsl-0.6.0.ebuild,v 1.5 2011/02/12 16:02:42 xarthisius Exp $

EAPI=4

inherit base findlib

DESCRIPTION="OCaml bindings for the GSL library"
HOMEPAGE="http://www.ocaml.info/home/ocaml_sources.html"
SRC_URI="http://hg.ocaml.info/release/${PN}/archive/release-${PV}.tar.bz2 ->
${P}.tar.bz2"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="amd64 ~ppc x86"
IUSE="doc examples +ocamlopt test"

RDEPEND=">=dev-lang/ocaml-3.10[ocamlopt?]
sci-libs/gsl"
DEPEND="${RDEPEND}
test? ( dev-ml/fort )"
S="${WORKDIR}/${PN}-release-${PV}"

src_prepare() {
	epatch "${FILESDIR}/${P}-ocaml311.patch"
	epatch "${FILESDIR}/${P}-bytecode.patch"
}

src_compile() {
	if use ocamlopt; then
		emake all CFLAGS="${CFLAGS}"
	else
		emake all-byte CFLAGS="${CFLAGS}"
	fi
	emake info
	if use doc; then
		emake doc
	fi
}

src_install() {
	findlib_src_preinst
	if use ocamlopt; then
		emake install
	else
		emake install-byte
	fi
	dodoc README.txt NEWS NOTES
	doinfo *.info*
	use doc && dohtml doc/*
	if use examples; then
		insinto /usr/share/doc/${PF}
		doins -r examples
	fi
}
