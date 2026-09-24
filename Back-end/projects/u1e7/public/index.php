<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
        <title>Document</title>
    </head>
    
    <body>
        <?php
            define('IMAGES_PATH', './img/dice_face');

            $dice1 = random_int(1, 6);
            $dice2 = random_int(1, 6);

            $dice1Image = IMAGES_PATH . "$dice1.svg";
            $dice2Image = IMAGES_PATH . "$dice2.svg";
        ?>

        <img style="width: 100px; border-radius: 10px" src=<?= $dice1Image ?> alt="Dice 1">
        <img style="width: 100px; border-radius: 10px" src=<?= $dice2Image ?> alt="Dice 2">

        <?php if ($dice1 === $dice2): ?>
            <p>Dices got different numbers</p>
            <p>Both dices have the same number</p>
        <?php else: ?>
            <p>Maximung value: <?= max($dice1, $dice2) ?></p>
        <?php endif ?>
    </body>
</html>