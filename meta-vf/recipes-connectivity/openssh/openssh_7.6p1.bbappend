FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

do_install_append() {
    install -d ${D}${sysconfdir}/ssh
    install -m 0644 ${WORKDIR}/sshd_config ${D}${sysconfdir}/ssh/sshd_config
}
