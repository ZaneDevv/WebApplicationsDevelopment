<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>String functions</title>
    </head>

    <body>
        <?php
            define('STRING_TO_ALTER', 'Hello, world. How are you feeling today');
        ?>

        <p>String: <?= STRING_TO_ALTER ?></p>
        <p>Length: <?= strlen(STRING_TO_ALTER) ?></p>
        <p>First 12 characters: <?= substr(STRING_TO_ALTER, 0, 12) ?></p>
        <p>"World"'s position: <?= strpos(STRING_TO_ALTER, 'world') ?></p>
        <p>Capital case: <?= strtoupper(STRING_TO_ALTER) ?></p>
        <p>Lower case: <?= strtolower(STRING_TO_ALTER) ?></p>
        <p>From first dot: <?= substr(STRING_TO_ALTER, strpos(STRING_TO_ALTER, '.')) ?></p>
    </body>
</html>