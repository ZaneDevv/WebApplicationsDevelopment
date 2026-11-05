<?php

// -------------------------------------------------------------
// METHODS
// -------------------------------------------------------------

function read_directory(string $directory) : void
{
    $iterator = new DirectoryIterator($directory);
    
    foreach ($iterator as $file_data)
    {
        if ($file_data->isDot())
            continue;

        echo '<p>' . $file_data->getFilename() . '</p>';
    }
}

// -------------------------------------------------------------
// LOGIC
// -------------------------------------------------------------

$directory = __DIR__ . '/assets';

if (!is_dir($directory))
    mkdir($directory);

read_directory($directory);

?>