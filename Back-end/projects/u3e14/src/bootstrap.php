<?php

declare(strict_types = 1);

// ----------------------------------------------------------
// SET CODE UP
// ----------------------------------------------------------

define('BASE_PATH', dirname(__DIR__));

require_once BASE_PATH . '/config/config.php';
require_once BASE_PATH . '/autoloader.php';

Controllers\FrontController::main();