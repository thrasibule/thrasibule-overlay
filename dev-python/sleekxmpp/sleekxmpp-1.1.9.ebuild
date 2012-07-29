# Copyright 1999-2012 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

EAPI=4

PYTHON_DEPEND="2:2.7 3:3.2"
SUPPORT_PYTHON_ABIS="1"

inherit distutils eutils

DESCRIPTION="An XMPP library for Python"
HOMEPAGE="https://github.com/fritzy/SleekXMPP"
SRC_URI="http://github.com/fritzy/SleekXMPP/zipball/1.1.9 -> ${P}.zip"

LICENSE="MIT"
SLOT="0"
KEYWORDS="~x86"
IUSE="doc"

RDEPEND="dev-python/dnspython"
DEPEND="${RDEPEND}"

DOCS="README.rst"
S="${WORKDIR}/fritzy-SleekXMPP-b566465"

src_test() {
	testing() {
		PYTHONPATH="../../build-${PYTHON_ABI}/lib" "$(PYTHON)" testall.py
	}
	python_execute_function testing
}

src_compile() {
	default
	if use doc; then
		cd docs; make dirhtml
	fi
}

src_install() {
	distutils_src_install
	if use doc; then
		dohtml -r docs/_build/dirhtml
	fi
}
