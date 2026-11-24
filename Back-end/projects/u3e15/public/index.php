<?php

declare(strict_types=1);

$views = (int)($_COOKIE['views'] ?? 0) + 1;

setcookie('views', (string) $views, [
    'expires' => time() + 60 * 60 * 24 * 365,
    'path' => '/',
    'httponly' => true,
    'samesite' => 'Lax',
]);

echo "Has visitado esta página $views veces.";