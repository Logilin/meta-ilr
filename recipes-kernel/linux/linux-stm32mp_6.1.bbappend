

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "${@bb.utils.contains('PREEMPTION_MODEL', 'n', 'file://not-preemptible-fragment.cfg;subdir=fragments', '', d)}"
KERNEL_CONFIG_FRAGMENTS += "${@bb.utils.contains('PREEMPTION_MODEL', 'n', '${B}/../fragments/not-preemptible-fragment.cfg', '', d)}"

SRC_URI += "${@bb.utils.contains('PREEMPTION_MODEL', 'y', 'file://preemptible-fragment.cfg;subdir=fragments', '', d)}"
KERNEL_CONFIG_FRAGMENTS += "${@bb.utils.contains('PREEMPTION_MODEL', 'y', '${B}/../fragments/preemptible-fragment.cfg', '', d)}"

SRC_URI += "${@bb.utils.contains('PREEMPTION_MODEL', 'rt', 'file://fragment-20-enable-ftrace.config;subdir=linux-6.1.28/arch/arm/configs/', '', d)}"
KERNEL_CONFIG_FRAGMENTS += "${@bb.utils.contains('PREEMPTION_MODEL', 'rt', '${B}/../linux-6.1.28/arch/arm/configs/fragment-20-enable-ftrace.config', '', d)}"

