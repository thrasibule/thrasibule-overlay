# Copyright 1999-2011 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: /var/cvsroot/gentoo-x86/www-servers/ocsigen/ocsigen-1.3.4.ebuild,v 1.2 2011/02/15 21:20:59 tomka Exp $

EAPI=2

inherit eutils findlib multilib

DESCRIPTION="Ocaml-powered webserver and framework for dynamic web programming"
HOMEPAGE="http://www.ocsigen.org"
SRC_URI="http://www.ocsigen.org/download/${PN}server-${PV}.tar.gz"

LICENSE="LGPL-2.1"
SLOT="0"
KEYWORDS="~amd64 ~x86"
IUSE="debug doc dbm +ocamlopt sqlite zlib"
RESTRICT="strip installsources"

DEPEND="dev-ml/findlib
		>=dev-ml/lwt-2.3.0[react,ssl]
		zlib? ( >=dev-ml/camlzip-1.03-r1 )
		dev-ml/cryptokit
		>=dev-ml/ocamlnet-2.2.9
		dev-ml/ocaml-text
		>=dev-ml/pcre-ocaml-6.0.1
		>=dev-lang/ocaml-3.12[ocamlopt?]
		!sqlite? ( !dbm? ( >=dev-lang/ocaml-3.10.2[gdbm] ) )
		!dbm? ( dev-ml/ocaml-sqlite3 )
		sqlite? ( dev-ml/ocaml-sqlite3 )"
RDEPEND="${DEPEND}"

S="${WORKDIR}/${PN}server-2.0.3"

pkg_setup() {
	enewgroup ocsigen
	enewuser ocsigen -1 -1 /var/www ocsigen

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

src_configure() {
	echo "$(use_with_default sqlite dbm)"
	chmod +x configure
	./configure \
		--prefix /usr \
		--temproot "${D}" \
		--bindir /usr/bin \
		--docdir /usr/share/doc \
		--mandir /usr/share/man/man1 \
		--libdir /usr/$(get_libdir) \
		$(use_enable debug) \
		$(use_with zlib camlzip) \
		$(use_with_default sqlite dbm) \
		--ocsigen-group ocsigen \
		--ocsigen-user ocsigen  \
		--name ocsigenserver \
		|| die "Error : configure failed!"
}

src_compile() {
	if use ocamlopt; then
		emake opt
	else
		emake byte
	fi
	use doc && emake doc
}

src_install() {
	findlib_src_preinst
	if use ocamlopt; then
		emake install.opt
	else
		emake install.byte
	fi
	if use doc ; then
		emake install.doc
	fi
	emake logrotate

	newinitd "${FILESDIR}"/ocsigen.initd ocsigen || die
	newconfd "${FILESDIR}"/ocsigen.confd ocsigen || die

	dodoc README
}
