# To support layered ipk generation
APP_LAYER_ARCH = "${MACHINE}-apps"

PACKAGE_EXTRA_ARCHS_append = " ${APP_LAYER_ARCH}"

IPK_FEED_URIS += " "

require package_revisions.inc
