FROM php:8.5-apache
# --- Paquetes del sistema: git, zip/unzip, librerías para extensiones ---
# --- Paquetes del sistema: git, zip/unzip, librerías para extensiones ---
RUN apt-get update && apt-get install -y \
    git \
    zip \
    unzip \
    libzip-dev \
    libpng-dev \
    libjpeg62-turbo-dev \
    libfreetype6-dev \
    libonig-dev \
    libxml2-dev \
    zlib1g-dev \
    default-mysql-client \
    curl \
    && rm -rf /var/lib/apt/lists/*
# --- Extensiones PHP: GD de forma independiente ---
RUN docker-php-ext-configure gd --with-freetype --with-jpeg \
&& docker-php-ext-install gd
# --- Resto de extensiones PHP ---
# --- Extensiones PHP ---
RUN docker-php-ext-configure gd --with-freetype --with-jpeg && docker-php-ext-install gd
RUN docker-php-ext-install pdo_mysql
RUN docker-php-ext-install mysqli
RUN docker-php-ext-install zip
RUN docker-php-ext-install mbstring
RUN docker-php-ext-install exif
# --- Xdebug (para PhpStorm y VS Code) ---
RUN pecl install xdebug
# --- Módulos de Apache: reescritura, SSL, headers y subdominios dinámicos ---
RUN a2enmod rewrite ssl headers vhost_alias
# --- Composer: última versión, copiada de la imagen oficial ---
COPY --from=composer:latest /usr/bin/composer /usr/bin/composer
# --- Configuración de Apache (paso 4) ---
COPY apache/000-default.conf /etc/apache2/sites-available/000-default.conf
COPY apache/default-ssl.conf /etc/apache2/sites-available/default-ssl.conf
RUN a2ensite default-ssl
# --- Página de aviso para https://localhost/ (sin subdominio de proyecto) ---
COPY apache/default-index.html /var/www/default/index.html
# --- Configuración de PHP para desarrollo ---
COPY apache/php.ini-development-overrides.ini /usr/local/etc/php/conf.d/zz-dev-overrides.ini
# --- Xdebug: configuración común para cualquier editor ---
COPY apache/xdebug.ini /usr/local/etc/php/conf.d/xdebug.ini
# --- PHPUnit disponible globalmente dentro del contenedor ---
RUN composer global require phpunit/phpunit --no-interaction \
&& ln -s /root/.composer/vendor/bin/phpunit /usr/local/bin/phpunit
WORKDIR /var/www/projects
EXPOSE 80 443