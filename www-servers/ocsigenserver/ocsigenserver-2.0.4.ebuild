# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

inherit eutils findlib

DESCRIPTION="Ocaml-powered webserver and framework for dynamic web programming"
HOMEPAGE="http://www.ocsigen.org"
SRC_URI="http://www.ocsigen.org/download/${P}.tar.gz"

LICENSE="LGPL-2.1"
SLOT="0"
KEYWORDS="~amd64 ~x86"
IUSE="debug doc dbm +ocamlopt sqlite zlib"
RESTRICT="strip installsources"

DEPEND=">=dev-ml/lwt-2.3.0[react,ssl]
		zlib? ( >=dev-ml/camlzip-1.03-r1 )
		dev-ml/cryptokit
		>=dev-ml/ocamlnet-2.2.9
		>=dev-ml/pcre-ocaml-6.0.1
		>=dev-ml/tyxml-2.0.1
		>=dev-lang/ocaml-3.12[ocamlopt?]
		!sqlite? ( !dbm? ( >=dev-lang/ocaml-3.10.2[gdbm] ) )
		!dbm? ( dev-ml/ocaml-sqlite3 )
		sqlite? ( dev-ml/ocaml-sqlite3 )"
RDEPEND="${DEPEND}"

pkg_setup() {
	enewgroup ocsigenserver
	enewuser ocsigenserver -1 -1 /var/www ocsigenserver

	use !dbm && use !sqlite \
		&& ewarn "Neither dbm nor sqlite are in useflags, will enable sqlite as default"

	use sqlite && use dbm \
		&& ewarn "sqlite and dbm are both in useflags, will use only sqlite"
}

use_with_default() {
	if use $2; then
		if use $1; then
			echo "--with-$2  --with-$1"
		else
			echo "--with-$2  --without-$1"
		fi
	else
		echo "--without-$2  --with-$1"
	fi
}

src_prepare() {
	epatch "${FILESDIR}/${PN}-makefile.patch"
}

src_configure() {
	sh configure \
		--prefix /usr \
		--temproot "${D}" \
		--bindir /usr/bin \
		--docdir /usr/share/doc/${PF} \
		--mandir /usr/share/man/man1 \
		--libdir /usr/$(get_libdir)/ocaml \
		$(use_enable debug) \
		$(use_with zlib camlzip) \
		$(use_with_default sqlite dbm) \
		--ocsigen-group ocsigenserver \
		--ocsigen-user ocsigenserver  \
		--name ocsigenserver \
		|| die "Error : configure failed!"
}

src_compile() {
	if use ocamlopt; then
		emake
	else
		emake byte
	fi
	use doc && emake doc
}

src_install() {
	findlib_src_preinst
	if use ocamlopt; then
		emake install
	else
		emake install.byte
	fi
	if use doc ; then
		emake install.doc
	fi
	emake logrotate

	newinitd "${FILESDIR}"/ocsigenserver.initd ocsigenserver || die
	newconfd "${FILESDIR}"/ocsigenserver.confd ocsigenserver || die

	dodoc README
}