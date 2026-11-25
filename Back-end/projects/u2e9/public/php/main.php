<?php

declare(strict_types = 1);

require_once __DIR__ . '/Circle.php';
require_once __DIR__ . '/Rectangle.php';

// --------------------------------------------------------------- \\

define('RECTANGLE_BASE', 10);
define('RECTANGLE_HEIGHT', 20);
define('CIRCLE_RADIUS', 15);

// --------------------------------------------------------------- \\

try
{
    $rectangle = new Rectangle(RECTANGLE_BASE, RECTANGLE_HEIGHT, "MyRectangle");
    $circle = new Circle(CIRCLE_RADIUS, "MyCircle");
    
    $rectangle->displayName();
    echo "<p>Area: {$rectangle->computeArea()}</p>";
    
    $circle->displayName();
    echo "<p>Area: {$circle->computeArea()}</p>";
}
catch (Exception $exception)
{
    echo 'Unable to run the program. You might have set a negative length somewhere, check the arguments.';
}