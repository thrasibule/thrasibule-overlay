# Copyright 1999-2010 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI="3"
PYTHON_DEPEND="2"
SUPPORT_PYTHON_ABIS="1"
RESTRICT_PYTHON_ABIS="3.*"

inherit distutils eutils

DESCRIPTION="Toolkit for safe and simple cryptography"
HOMEPAGE="http://www.keyczar.org"
SRC_URI="http://keyczar.googlecode.com/files/python-${P}.061709.tar.gz
-> ${P}.tar.gz"

LICENSE="Apache-2.0"
SLOT="0"
KEYWORDS="~x86"
IUSE="doc"

RDEPEND="dev-python/pycrypto
		 dev-python/pyasn1"
DEPEND="${RDEPEND}"

# Some tests fail with some limit of inlining of functions.
# Avoid warnings about breaking strict-aliasing rules.
#PYTHON_CFLAGS=("2.* + -fno-inline-functions -fno-strict-aliasing")

DOCS="README"
PYTHON_MODNAME="keyczar"
S="${WORKDIR}/python-${P}"

src_prepare() {
	#patch for the test suite. It is reported upstream at
	#http://code.google.com/p/keyczar/issues/detail?id=61
	epatch "${FILESDIR}/keyczar_rsakeysize.patch"
}
src_test() {
	testing() {
		PYTHONPATH="../../build-${PYTHON_ABI}/lib" "$(PYTHON)" alltests.py
	}
	cd "${S}/tests/keyczar"
	python_execute_function testing
}

src_install() {
	distutils_src_install
}
