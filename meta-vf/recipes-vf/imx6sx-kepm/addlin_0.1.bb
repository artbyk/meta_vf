
SUMMARY = "Add A9 application to file system"
SECTION = "A9 kepm"
LICENSE = "CLOSED"

SRC_URI = "file://LIN \
           file://LIN_RX \
           file://LIN_TX \
           file://spidev \
           file://network1 \
           file://network_usb \
           file://network2"

S = "${WORKDIR}"

do_install() {
	     install -d 777 ${D}/kepm
	     install -m 777 LIN ${D}/kepm/
	     install -m 777 LIN_RX ${D}/kepm/
	     install -m 777 LIN_TX ${D}/kepm/
	     install -m 777 spidev ${D}/kepm/
	     install -m 0644 ${WORKDIR}/network1 ${D}/kepm/wired.network
	     install -m 0644 ${WORKDIR}/network2 ${D}/kepm/second_wired.network
             install -d ${D}/etc/systemd/network
             install -m 0644 ${WORKDIR}/network_usb ${D}/etc/systemd/network/usb.network
}

FILES_${PN} += "/kepm"
