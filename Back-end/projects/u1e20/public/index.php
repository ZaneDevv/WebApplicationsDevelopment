<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
        <title>Predefined variables method</title>
    </head>

    <body>
        <?php
            $variable1 = null;
            $variable2;
            $variable3 = 1;
        ?>

        <p>Is variable0 set? <?= isset($variable0) ?></p>
        <p>Is variable1 null? <?= is_null($variable1) ?></p>
        <p>Is variable2 empty? <?= empty($variable2) ?></p>
        <p>Is variable3 an integer? <?= is_int($variable3) ?></p>
    </body>
</html>