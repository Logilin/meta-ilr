

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "${@bb.utils.contains('PREEMPTION_MODEL', 'n', 'file://not-preemptible-fragment.cfg', '', d)}"

SRC_URI += "${@bb.utils.contains('PREEMPTION_MODEL', 'y', 'file://preemptible-fragment.cfg', '', d)}"

SRC_URI += "${@bb.utils.contains('PREEMPTION_MODEL', 'rt', 'file://preempt-rt-fragment.cfg', '', d)}"
SRC_URI += "${@bb.utils.contains('PREEMPTION_MODEL', 'rt', 'https://mirrors.edge.kernel.org/pub/linux/kernel/projects/rt/5.15/older/patch-5.15.34-rt40.patch.xz', '', d)}"
SRC_URI[sha256sum] = "${@bb.utils.contains('PREEMPTION_MODEL', 'rt', 'f26f1bb0d7df5fec29d5338590e40006bf9b3843afc354878a8078b2fae8c11d', '', d)}"
