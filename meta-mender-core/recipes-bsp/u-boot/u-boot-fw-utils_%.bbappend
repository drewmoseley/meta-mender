# Keep this separately from the rest of the .bb file in case that .bb file is
# overridden from another layer.
include ${@mender_feature_is_enabled("mender-uboot","u-boot-fw-utils-mender.inc","",d)}
include ${@mender_feature_is_enabled("mender-grub","u-boot-fw-utils-mender.inc","",d)}
