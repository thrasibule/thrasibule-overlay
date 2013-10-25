# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI="4"

inherit eutils findlib multilib

DESCRIPTION="A package manager for OCaml"
HOMEPAGE="http://opam.ocamlpro.com/"
SRC_URI="http://github.com/OCamlPro/opam/archive/${PV}.tar.gz"

LICENSE="LGPL-2.1-with-linking-exception"
SLOT="0"
KEYWORDS="~amd64 ~x86"
IUSE="debug doc +ocamlopt"

DEPEND=">=dev-lang/ocaml-3.12.1[ocamlopt?]"

RDEPEND="${DEPEND}"

