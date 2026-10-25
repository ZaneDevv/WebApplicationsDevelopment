<?php

spl_autoload_register(function (string $class): void
{
    $file = __DIR__ . '/src/' . str_replace('\\', '/', $class) . '.php';

    if (is_file($file))
        require_once $file;
});
