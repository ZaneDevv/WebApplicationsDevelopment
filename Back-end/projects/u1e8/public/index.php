<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Cube of numbers</title>
    </head>

    <body>
        <?php
            define('TOP_NUMBER', 40);

            $currentNumber = 0;

            while ($currentNumber <= TOP_NUMBER)
            {
                echo $currentNumber . ' ^ 3 = ' . ($currentNumber ** 3) . '<br>';
                $currentNumber++;
            }
        ?>
    </body>
</html>