
SUMMARY = "Add A9 application to file system"
SECTION = "A9 kepm"
LICENSE = "CLOSED"

SRC_URI = "file://settings.kprm61850 \
           file://settings.kprd61850"

S = "${WORKDIR}"

do_install() {
	     install -d 777 ${D}/kepm
	     install -m 777 settings.kprm61850 ${D}/kepm/
             install -m 777 settings.kprd61850 ${D}/kepm/
}

FILES_${PN} += "/kepm"
