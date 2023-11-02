

DESCRIPTION = "Example files for Logilin ILR training courses"
LICENSE="GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"


SRCREV="d804aa497640c1792259146e006a9bd25429e5e3"
SRC_URI = "git://github.com/logilin/ilr.git;protocol=https;branch=master"

do_install() {
	install -d ${D}/home/root/ilr/chapitre-01
	install -m 644 ${WORKDIR}/git/chapitre-01/Makefile         ${D}/home/root/ilr/chapitre-01
	install -m 644 ${WORKDIR}/git/chapitre-01/exemple-I-01.c   ${D}/home/root/ilr/chapitre-01
	install -m 644 ${WORKDIR}/git/chapitre-01/exemple-I-02.c   ${D}/home/root/ilr/chapitre-01
	install -m 644 ${WORKDIR}/git/chapitre-01/exemple-I-03.c   ${D}/home/root/ilr/chapitre-01
	install -m 644 ${WORKDIR}/git/chapitre-01/exemple-I-04.c   ${D}/home/root/ilr/chapitre-01
	install -m 644 ${WORKDIR}/git/chapitre-01/exemple-I-05.c   ${D}/home/root/ilr/chapitre-01
	install -m 644 ${WORKDIR}/git/chapitre-01/exemple-I-06.c   ${D}/home/root/ilr/chapitre-01
	install -m 644 ${WORKDIR}/git/chapitre-01/exemple-I-07.c   ${D}/home/root/ilr/chapitre-01
	install -m 644 ${WORKDIR}/git/chapitre-01/exemple-I-08.c   ${D}/home/root/ilr/chapitre-01
	install -m 644 ${WORKDIR}/git/chapitre-01/exemple-I-09.c   ${D}/home/root/ilr/chapitre-01
	install -m 644 ${WORKDIR}/git/chapitre-01/exemple-I-10.c   ${D}/home/root/ilr/chapitre-01
	install -m 644 ${WORKDIR}/git/chapitre-01/exemple-I-11.c   ${D}/home/root/ilr/chapitre-01
	install -m 644 ${WORKDIR}/git/chapitre-01/exemple-I-12.c   ${D}/home/root/ilr/chapitre-01
	install -d ${D}/home/root/ilr/chapitre-02
	install -m 644 ${WORKDIR}/git/chapitre-02/Makefile         ${D}/home/root/ilr/chapitre-02
	install -m 644 ${WORKDIR}/git/chapitre-02/exemple-II-01.c  ${D}/home/root/ilr/chapitre-02
	install -d ${D}/home/root/ilr/chapitre-03
	install -m 644 ${WORKDIR}/git/chapitre-03/Makefile         ${D}/home/root/ilr/chapitre-03
	install -m 644 ${WORKDIR}/git/chapitre-03/exemple-III-01.c ${D}/home/root/ilr/chapitre-03
	install -m 644 ${WORKDIR}/git/chapitre-03/exemple-III-02.c ${D}/home/root/ilr/chapitre-03
	install -m 644 ${WORKDIR}/git/chapitre-03/exemple-III-03.c ${D}/home/root/ilr/chapitre-03
	install -m 644 ${WORKDIR}/git/chapitre-03/exemple-III-04.c ${D}/home/root/ilr/chapitre-03
	install -m 644 ${WORKDIR}/git/chapitre-03/exemple-III-05.c ${D}/home/root/ilr/chapitre-03
	install -m 644 ${WORKDIR}/git/chapitre-03/exemple-III-06.c ${D}/home/root/ilr/chapitre-03
	install -m 644 ${WORKDIR}/git/chapitre-03/exemple-III-07.c ${D}/home/root/ilr/chapitre-03
	install -m 644 ${WORKDIR}/git/chapitre-03/exemple-III-08.c ${D}/home/root/ilr/chapitre-03
	install -m 644 ${WORKDIR}/git/chapitre-03/exemple-III-09.c ${D}/home/root/ilr/chapitre-03
	install -m 644 ${WORKDIR}/git/chapitre-03/exemple-III-10.c ${D}/home/root/ilr/chapitre-03
	install -m 644 ${WORKDIR}/git/chapitre-03/exemple-III-11.c ${D}/home/root/ilr/chapitre-03
	install -m 644 ${WORKDIR}/git/chapitre-03/exemple-III-12.c ${D}/home/root/ilr/chapitre-03
	install -m 644 ${WORKDIR}/git/chapitre-03/exemple-III-13.c ${D}/home/root/ilr/chapitre-03
}

FILES:${PN} += "                                \
  /home/root/ilr/chapitre-01/Makefile           \
  /home/root/ilr/chapitre-01/exemple-I-01.c     \
  /home/root/ilr/chapitre-01/exemple-I-02.c     \
  /home/root/ilr/chapitre-01/exemple-I-03.c     \
  /home/root/ilr/chapitre-01/exemple-I-04.c     \
  /home/root/ilr/chapitre-01/exemple-I-05.c     \
  /home/root/ilr/chapitre-01/exemple-I-06.c     \
  /home/root/ilr/chapitre-01/exemple-I-07.c     \
  /home/root/ilr/chapitre-01/exemple-I-08.c     \
  /home/root/ilr/chapitre-01/exemple-I-09.c     \
  /home/root/ilr/chapitre-01/exemple-I-10.c     \
  /home/root/ilr/chapitre-01/exemple-I-11.c     \
  /home/root/ilr/chapitre-01/exemple-I-12.c     \
  /home/root/ilr/chapitre-02/Makefile           \
  /home/root/ilr/chapitre-02/exemple-II-01.c    \
  /home/root/ilr/chapitre-03/Makefile           \
  /home/root/ilr/chapitre-03/exemple-III-01.c   \
  /home/root/ilr/chapitre-03/exemple-III-02.c   \
  /home/root/ilr/chapitre-03/exemple-III-03.c   \
  /home/root/ilr/chapitre-03/exemple-III-04.c   \
  /home/root/ilr/chapitre-03/exemple-III-05.c   \
  /home/root/ilr/chapitre-03/exemple-III-06.c   \
  /home/root/ilr/chapitre-03/exemple-III-07.c   \
  /home/root/ilr/chapitre-03/exemple-III-08.c   \
  /home/root/ilr/chapitre-03/exemple-III-09.c   \
  /home/root/ilr/chapitre-03/exemple-III-10.c   \
  /home/root/ilr/chapitre-03/exemple-III-11.c   \
  /home/root/ilr/chapitre-03/exemple-III-12.c   \
  /home/root/ilr/chapitre-03/exemple-III-13.c   \
"
