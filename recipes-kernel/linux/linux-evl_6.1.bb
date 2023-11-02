SUMMARY = "Linux EVL"
SECTION = "kernel"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

COMPATIBLE_MACHINE = "^rpi$"

PROVIDES += "virtual/kernel"

inherit siteinfo
require recipes-kernel/linux/linux-yocto.inc

LINUX_VERSION = "6.1"
LINUX_SUBVERSION = "54"
LINUX_TARNAME = "linux-${LINUX_VERSION}.${LINUX_SUBVERSION}"
SRC_URI = "git://source.denx.de/Xenomai/xenomai4/linux-evl.git;protocol=https;branch=v6.1.y-evl-rebase"
SRCREV = "ed440021010574bfd59d6c535576b9de66dd8570"
SRC_URI[sha256sum] = "7f4968aef95a64b2edb91153a5795c9b1fa6f778b8c7869d5b195fd6877d01da"

KCONFIG_MODE = "--alldefconfig"
KBUILD_DEFCONFIG:raspberrypi0-wifi ?= "bcmrpi_defconfig"
KBUILD_DEFCONFIG:raspberrypi ?= "bcmrpi_defconfig"
KBUILD_DEFCONFIG:raspberrypi-cm3 ?= "bcm2709_defconfig"
KBUILD_DEFCONFIG:raspberrypi2 ?= "bcm2709_defconfig"
KBUILD_DEFCONFIG:raspberrypi3 ?= "bcm2709_defconfig"
KBUILD_DEFCONFIG:raspberrypi3-64 ?= "bcmrpi3_defconfig"

KBUILD_DEFCONFIG:raspberrypi4 ?= "bcm2835_defconfig"    

KBUILD_DEFCONFIG:raspberrypi4-64 ?= "bcm2711_defconfig"

MACHINE_EXTRA_RRECOMMENDS += "kernel-modules udev-rules-rpi kernel-module-usbhid"

KERNEL_DTC_FLAGS += "-@ -H epapr"

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

UBOOT_ENTRYPOINT =       "0x00008000"
UBOOT_LOADADDRESS =      "0x00008000"
