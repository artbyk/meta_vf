
SUMMARY = "Add script for autostartup A9 application"
SECTION = "SCRIPTS"
LICENSE = "CLOSED"

SRC_URI = "file://rndis.service"
inherit systemd
SYSTEMD_SERVICE_${PN} = "rndis.service"

S = "${WORKDIR}"
INITSCRIPT_NAME = "rndis.service"

do_install() {
             install -d ${D}${systemd_unitdir}/system
             install -m 0644 ${WORKDIR}/${INITSCRIPT_NAME} ${D}${systemd_unitdir}/system
}
