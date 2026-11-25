<?php

declare(strict_types=1);

use Controllers\HomeController;
use Core\Router;

Router::add('get', '/', [HomeController::class, 'show']);
Router::add('post', '/cookie', [HomeController::class, 'set_cookie']);