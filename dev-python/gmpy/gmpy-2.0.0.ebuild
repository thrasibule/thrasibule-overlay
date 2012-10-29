# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: /var/cvsroot/gentoo-x86/dev-python/gmpy/gmpy-1.14.ebuild,v 1.5 2012/02/20 15:03:17 patrick Exp $

EAPI="3"
SUPPORT_PYTHON_ABIS="1"
RESTRICT_PYTHON_ABIS="*-jython 2.7-pypy-*"

inherit distutils eutils

DESCRIPTION="Python bindings for GMP library"
HOMEPAGE="http://www.aleax.it/gmpy.html http://code.google.com/p/gmpy/ http://pypi.python.org/pypi/gmpy"
SRC_URI="http://gmpy.googlecode.com/files/gmpy2-2.0.0b2.zip"

LICENSE="LGPL-2.1"
SLOT="2"
KEYWORDS="~x86"
IUSE=""

RDEPEND="dev-libs/gmp"
DEPEND="${RDEPEND}
	app-arch/unzip"

PYTHON_CFLAGS=("2.* + -fno-strict-aliasing")

DOCS="doc/gmpydoc.txt"
S="${WORKDIR}/gmpy2-2.0.0b2"

src_prepare() {
	epatch "${FILESDIR}"/gmpy2-findlib.patch
}

src_compile() {
	distutils_src_compile build_ext -Ddir=/usr
}

src_test() {
	testing() {
		pushd test > /dev/null
		PYTHONPATH="$(ls -d ../build-${PYTHON_ABI}/lib.*)" "$(PYTHON)" runtests.py || return 1
		popd > /dev/null
	}
	python_execute_function testing
}

src_install() {
	distutils_src_install build_ext -DDIR=/usr
	dohtml doc/index.html || die "dohtml failed"
}
