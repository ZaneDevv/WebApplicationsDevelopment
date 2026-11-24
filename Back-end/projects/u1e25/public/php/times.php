<?php

declare(strict_types = 1);

function getTimeFrance() : string
{
    date_default_timezone_set('Europe/Paris');
    return date('l, Y-F-d', time());
}