<?php

declare(strict_types=1);

use Core\Router;
use Controllers\ProductController;

Router::add("GET", "/", [ProductController::class, 'send_to_buy']);
Router::add("POST", "/cart", [ProductController::class, 'send_to_cart']);