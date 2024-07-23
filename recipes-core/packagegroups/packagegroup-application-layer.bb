SUMMARY = "Custom package group for application layer"
PACKAGE_ARCH = "${APP_LAYER_ARCH}"

LICENSE = "MIT"

inherit packagegroup

##Change the version number for each release.
PV = "2.1"

RDEPENDS_packagegroup-application-layer = " \
                                           residentui \
                                           rdkresident-app \
                                         "
