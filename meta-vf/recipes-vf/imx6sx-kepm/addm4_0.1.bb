#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "Add M4 application to image"
SECTION = "M4"
LICENSE = "CLOSED"

SRC_URI = "file://M4 \
           file://rpmsg \
           file://rndis \
           file://M4ERPC_RCV_newDM_MRS.bin \
           file://M4ERPC_RCV_newDM_MURS.bin \
           file://M4ERPC_TRN_new_UM.bin \
           file://M4ERPC_TRN_old_UM.bin \
           file://M4ERPC.bin"

S = "${WORKDIR}"

do_install() {
	     install -d ${D}/mnt
	     install -d ${D}/mnt/mmcboot
	     install -d ${D}/mnt/usb
             install -d 777 ${D}/kepm
	     install -m 777 M4ERPC.bin ${D}/kepm/
	     install -m 777 M4ERPC_TRN_new_UM.bin ${D}/kepm/
	     install -m 777 M4ERPC_TRN_old_UM.bin ${D}/kepm/
	     install -m 777 M4ERPC_RCV_newDM_MRS.bin ${D}/kepm/
	     install -m 777 M4ERPC_RCV_newDM_MURS.bin ${D}/kepm/
	     install -m 777 M4 ${D}/kepm/
	     install -m 777 rndis ${D}/kepm/
	     install -m 777 rpmsg ${D}/kepm/
}

FILES_${PN} += "/mnt"
FILES_${PN} += "/mnt/mmcboot"
FILES_${PN} += "/mnt/usb"
FILES_${PN} += "/kepm"
