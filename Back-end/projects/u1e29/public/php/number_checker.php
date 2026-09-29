<?php

declare(strict_types = 1);

define('NUMBER_PATTERN', '/^\d{4}[A-Z]{3}$/');
define('VALID_MESSAGE', 'The given number is a <span id="valid">valid</span> number plate');
define('INVALID_MESSAGE', 'The given number is an <span id="invalid">invalid</span> number plate');

$givenNumber = $_GET['plate-number'] ?? '';
$printingText = '';

if (!empty($givenNumber))
{
    $doesMatch = preg_match(NUMBER_PATTERN, $givenNumber);
    $printingText = $doesMatch ? VALID_MESSAGE : INVALID_MESSAGE;
}