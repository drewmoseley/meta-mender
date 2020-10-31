include ${@mender_feature_is_enabled("mender-grub","u-boot-fw-utils-mender-auto-provided_impl.inc","",d)}
include ${@mender_feature_is_enabled("mender-uboot","u-boot-fw-utils-mender-auto-provided_impl.inc","",d)}

LICENSE = "GPL-2.0"
# Specifying a dummy file here is slightly evil, but the problem is that since
# this is a special recipe which uses source code coming from any odd U-Boot
# version imaginable, it is not possible to use a stable checksum pointing to a
# file from within that source. It is pretty unlikely that U-Boot will change
# license, so use this for now.
LIC_FILES_CHKSUM = "file://dummy-license.txt;md5=f02e326f800ee26f04df7961adbf7c0a"
