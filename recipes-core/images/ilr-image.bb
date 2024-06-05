

LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES += 'ssh-server-dropbear'
IMAGE_FEATURES += 'tools-sdk'

inherit extrausers

# "root/root" and "ilr/ilr" accounts.
EXTRA_USERS_PARAMS += "usermod -p '\$5\$WOot5KQLJhXEohOI\$UrrdwQoxi/IQftxelDt7.BemQakeK6SaO/hYK070wC.' root; "
EXTRA_USERS_PARAMS += "useradd -p '\$5\$sZNqHICX8o12cEoZ\$2NvY4ja7le0sVnRTgF0.5sqxJhmQp1XNeRhMB2U5j7C'  ilr; "

IMAGE_INSTALL:append = ' git'
IMAGE_INSTALL:append = ' htop'
IMAGE_INSTALL:append = ' nano'
IMAGE_INSTALL:append = ' rt-tests'
IMAGE_INSTALL:append = ' trace-cmd'

IMAGE_INSTALL:append = ' ilr-examples'

PREFERRED_VERSION_linux-raspberrypi = "5.15%"
