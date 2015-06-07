# Copyright 1999-2015 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=5

inherit oasis

OASIS_BUILD_DOCS=1
DESCRIPTION="FUSE filesystem over Google Drive"
HOMEPAGE="http://forge.ocamlcore.org/projects/gdfuse"
SRC_URI="http://forge.ocamlcore.org/frs/download.php/1316/${P}-src.tar.gz"

LICENSE="MIT"
SLOT="0"
KEYWORDS="~amd64"
IUSE="doc test"

RDEPEND=">=dev-ml/ocaml-sqlite3-1.6.1:=
	>=dev-ml/gapi-ocaml-0.2.1:=
	>=dev-ml/ocamlfuse-2.7.1:="
DEPEND="${RDEPEND}
	test? ( >=dev-ml/ounit-1.1.0
			>=dev-ml/pa_monad-6.0 )"
DOCS=( "README.md" )
