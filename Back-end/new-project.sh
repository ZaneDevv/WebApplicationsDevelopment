#!/usr/bin/env bash
set -euo pipefail

# Uso: ./new-project.sh nombre-del-proyecto
if [ $# -ne 1 ]; then
    echo "Uso: $0 <nombre-del-proyecto>"
    exit 1
fi

NOMBRE="$1"
BASE_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
RUTA="$BASE_DIR/projects/$NOMBRE"

if [ -d "$RUTA" ]; then
    echo -e "\e[31mEl proyecto '$NOMBRE' ya existe en $RUTA\e[0m"
    exit 1
fi

# --- Estructura de carpetas (separando lo público de lo privado) ---
mkdir -p "$RUTA/public"
mkdir -p "$RUTA/src"
mkdir -p "$RUTA/tests"

# --- index.php de entrada en public/ ---
cat > "$RUTA/public/index.php" <<PHP
<?php
require_once __DIR__ . '/../vendor/autoload.php';
echo '<h1>Proyecto: $NOMBRE</h1>';
echo '<p>PHP ' . phpversion() . '</p>';
PHP

# --- .htaccess en public/ con mod_rewrite ya activo (front controller) ---
cat > "$RUTA/public/.htaccess" <<'HTACCESS'
RewriteEngine On
RewriteCond %{REQUEST_FILENAME} !-f
RewriteCond %{REQUEST_FILENAME} !-d
RewriteRule ^ index.php [QSA,L]
HTACCESS

# --- composer.json en la raíz del proyecto (ejemplo comentado) ---
cat > "$RUTA/composer.json" <<JSON
{
    "name": "clase/$NOMBRE",
    "type": "project",
    "require": {},
    "require-dev": {
        "phpunit/phpunit": "^11.0"
    },
    "autoload": {
        "psr-4": { "App\\\\": "src/" }
    }
}
JSON

# --- Git dentro del contenedor ---
# docker compose -f "$BASE_DIR/docker-compose.yml" exec -w "/var/www/projects/$NOMBRE" web git init -q
# docker compose -f "$BASE_DIR/docker-compose.yml" exec -w "/var/www/projects/$NOMBRE" web composer install -q

echo -e "\e[32mProyecto '$NOMBRE' creado correctamente.\e[0m"
echo "HTTP:  http://$NOMBRE.localhost/"
echo "HTTPS: https://$NOMBRE.localhost/"
