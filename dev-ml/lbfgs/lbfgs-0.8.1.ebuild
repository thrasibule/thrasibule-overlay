# Copyright 1999-2011 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4
inherit eutils findlib

DESCRIPTION="OCaml bindings to the L-BFGS-B algorithm"
HOMEPAGE="https://forge.ocamlcore.org/projects/lbfgs/"
SRC_URI="http://forge.ocamlcore.org/frs/download.php/701/${P}.tar.gz"

LICENSE="BSD GPL-3"
SLOT="0"
KEYWORDS="~x86 ~amd64"
IUSE="debug doc +ocamlopt"

DEPEND=">=dev-lang/ocaml-3.12[ocamlopt?]
		virtual/fortran"
RDEPEND="${DEPEND}"

oasis_use_enable() {
	echo "--override $2 `use $1 && echo \"true\" || echo \"false\"`"
}

src_configure() {
	ocaml setup.ml -configure --prefix usr \
	--libdir /usr/$(get_libdir) \
	--docdir /usr/share/doc/${PF}/html \
	--destdir "${D}" \
	$(oasis_use_enable debug debug) \
	$(oasis_use_enable ocamlopt is_native) \
	|| die
}
src_compile() {
	ocaml setup.ml -build
	use doc && ocaml setup.ml -doc
}

src_install() {
	findlib_src_install
	#ocaml setup.ml -install
}
