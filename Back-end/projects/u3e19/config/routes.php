<?php

declare(strict_types=1);

use Controllers\HomeController;
use Core\Router;

Router::add('get', '/', [HomeController::class, 'show']);