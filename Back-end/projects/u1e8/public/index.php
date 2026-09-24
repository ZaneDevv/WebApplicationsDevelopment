<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Document</title>
    </head>

    <body>
        <?php
            define('TOP_NUMBER', 40);

            $currentNumber = 0;

            while ($currentNumber <= TOP_NUMBER)
            {
                echo $currentNumber . ' ^ 3 = ' . pow($currentNumber, 3) . '<br>';
                $currentNumber++;
            }
        ?>
    </body>
</html>