<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
        <title>Document</title>
    </head>
    
    <body>
        <?php
            $dice1 = rand(1, 6);
            $dice2 = rand(1, 6);
        ?>

        <p><?= $dice1 === $dice2 ? "Both dices have the same number" : "The dices got different numbers" ?></p>
        <p><?= max($dice1, $dice2) ?></p>
    </body>
</html>