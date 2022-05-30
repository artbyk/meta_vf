
SUMMARY = "Add script for autostartup A9 application"
SECTION = "SCRIPTS"
LICENSE = "CLOSED"

SRC_URI = "file://A9USB \
           file://a9usb.service"
inherit systemd
SYSTEMD_SERVICE_${PN} = "a9usb.service"

S = "${WORKDIR}"
INITSCRIPT_NAME = "a9usb.service"

INSANE_SKIP_${PN} = "ldflags"

do_install() {
	     install -d 777 ${D}/kepm
             install -m 777 A9USB ${D}/kepm/
             install -d ${D}${systemd_unitdir}/system
             install -m 0644 ${WORKDIR}/${INITSCRIPT_NAME} ${D}${systemd_unitdir}/system
}

FILES_${PN} += "/kepm"
