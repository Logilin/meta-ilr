

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "${@bb.utils.contains('PREEMPTION_MODEL', 'n', 'file://not-preemptible-fragment.cfg', '', d)}"

SRC_URI += "${@bb.utils.contains('PREEMPTION_MODEL', 'y', 'file://preemptible-fragment.cfg', '', d)}"

SRC_URI += "${@bb.utils.contains('PREEMPTION_MODEL', 'rt', 'file://preempt-rt-fragment.cfg', '', d)}"


SRC_URI += "${@bb.utils.contains('PREEMPTION_MODEL', 'rt', 'https://mirrors.edge.kernel.org/pub/linux/kernel/projects/rt/5.15/older/patch-5.15.92-rt57.patch.gz', '', d)}"

SRC_URI[sha256sum] = "${@bb.utils.contains('PREEMPTION_MODEL', 'rt', 'aced5f7dd70cf582a4f575360c698a35fff520ee664391dd5595c9ef3a805d39', '', d)}"
