<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
        <title>Document</title>
    </head>

    <body>
        <?php
            $variable1 = 100;
            $variable2 = &$variable1; // Value by reference
            $variable3 = $variable1; // Value by copy

            echo '<pre>';

            echo 'Variable 1: ', $variable1, PHP_EOL, 'variable 2: ', $variable2, PHP_EOL, 'variable 3: ', $variable3;

            $variable3 = 200;

            echo PHP_EOL, PHP_EOL;
            echo 'Variable 1: ', $variable1, PHP_EOL, 'variable 2: ', $variable2, PHP_EOL, 'variable 3: ', $variable3;

            $variable2 = 30;

            echo PHP_EOL, PHP_EOL;
            echo 'Variable 1: ', $variable1, PHP_EOL, 'variable 2: ', $variable2, PHP_EOL, 'variable 3: ', $variable3;

            $variable2 = 10;

            echo PHP_EOL, PHP_EOL;
            echo 'Variable 1: ', $variable1, PHP_EOL, 'variable 2: ', $variable2, PHP_EOL, 'variable 3: ', $variable3;

            echo '</pre>';
        ?>
    </body>
</html>