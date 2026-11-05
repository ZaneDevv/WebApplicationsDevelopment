<?php

declare(strict_types = 1);

// ----------------------------------------------------------------
// METHODS
// ----------------------------------------------------------------

/**
 * In case the file is readable, just opens it
 *
 * @param string $file
 * @return array
 */
function open_file_if_it_is_readable(string $file) : array
{
    if (is_dir($file))
        return [
            'status' => false,
            'data' => 'The given path points to a directory'
        ];

    if (!is_readable($file))
        return [
            'status' => false,
            'data' => 'Cannot read this file'
        ];

    return [
        'status' => true,
        'data' => fopen($file, 'r')
    ];
}

/**
 * Shows the given and opened file's data
 *
 * @param array $data_found
 * @return void
 */
function show_file_data(array $data_found) : void
{
    if (!$data_found['status'])
    {
        echo '<p>' . $data_found['data'] . '</p>';
        return;
    }
    
    $opened_file = $data_found['data'];
    
    echo '<p>Opened file: ';
    while (($buffer = fgetc($opened_file)))
        echo $buffer;
    echo '</p>';
}

// ----------------------------------------------------------------
// LOGIC
// ----------------------------------------------------------------

$file0_name = __DIR__ . '/src/test.txt';
$file1_name = __DIR__ . '/src/test2.txt';

if (!file_exists($file0_name))
    file_put_contents($file0_name, 'Hey there, Delailah. How is it like in New York city? I\'m a thousand miles away, but girl tonight you look so pretty, yes you do');

if (!file_exists($file1_name))
    file_put_contents($file1_name, 'I\'m trying to open several files in php');

$data_found0 = open_file_if_it_is_readable($file0_name);
$data_found1 = open_file_if_it_is_readable($file1_name);

show_file_data($data_found0);
show_file_data($data_found1);

?>