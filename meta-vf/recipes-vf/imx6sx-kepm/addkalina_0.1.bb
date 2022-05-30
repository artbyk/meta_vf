
SUMMARY = "Add A9 application to file system"
SECTION = "A9 kepm"
LICENSE = "CLOSED"

SRC_URI = "file://KALINA.CID"

S = "${WORKDIR}"

do_install() {
	     install -d 777 ${D}/files_61850
	     install -m 777 KALINA.CID ${D}/files_61850/
}

FILES_${PN} += "/files_61850"
