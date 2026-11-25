<?php

// ---------------------------
// CONSTANTS
// ---------------------------

define('MINIMUM_DATE_FILTER', strtotime('1 January 1990'));

// ---------------------------
// VARIABLES
// ---------------------------

$teachers = [
    [
        'registerNumber' => 500,
        'name' => 'John',
        'lastName' => 'Doe',
        'phone' => 123456789,
        'birthDate' => '12 April 2000'
    ],
    [
        'registerNumber' => 670,
        'name' => 'Jane',
        'lastName' => 'Doe',
        'phone' => 987654321,
        'birthDate' => '24 February 1985'
    ],
    [
        'registerNumber' => 856,
        'name' => 'John',
        'lastName' => 'Doe 2',
        'phone' => 567894321,
        'birthDate' => '23 January 2001'
    ],
    [
        'registerNumber' => 967,
        'name' => 'Jane',
        'lastName' => 'Doe 2',
        'phone' => 123498765,
        'birthDate' => '30 November 1994'
    ]
];

// ---------------------------
// METHODS
// ---------------------------

/*
function displayAllPersonalRegisterNumbers()
{
    global $teachers;

    $allNumbers = [];
    foreach ($teachers as $teacherData)
    {
        $allNumbers[] = $teacherData['registerNumber'];
    }

    echo implode(' ', $allNumbers);
}

displayAllPersonalRegisterNumbers();
*/

echo implode(' ', array_map(
    fn ($teacher) => $teacher['registerNumber'],
    $teachers
));

echo '<br>';

print_r(array_filter(
    $teachers,
    fn ($teacher) => strtotime($teacher['birthDate']) >= MINIMUM_DATE_FILTER
));