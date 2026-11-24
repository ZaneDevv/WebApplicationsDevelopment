<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="./css/main.css">
    
        <title>Real numbers between other two</title>
    </head>
    
    <body>
        <?php
            $number1 = $_GET['number-one'];
            $number2 = $_GET['number-two'];

            $numeric1 = (int)$number1;
            $numeric2 = (int)$number2;

            $isEitherEmpty = (empty($number1) && $number1 != false) || (empty($number2) && $number2 != false);
            $areBothNumeric = is_numeric($numeric1) && is_numeric($numeric2);
            $isSecondGreaterThanFirst = $numeric2 > $numeric1;
        ?>

        <form action="index.php">
            <label for="number-one">First number:</label>
            <input type="number" name="number-one" id="number-one" placeholder="Write the first number (must be lower than the second one)" value=<?= $numeric1 ?? 0 ?> required>

            <label for="number-two">Second number:</label>
            <input type="number" name="number-two" id="number-two" placeholder="Write the second number (must be greater than the first one)" value=<?= $numeric2 ?? 0 ?> required>

            <input type="submit">
        </form>

        <?php if (!$isEitherEmpty && $areBothNumeric && $isSecondGreaterThanFirst): ?>
            <ul>
                <?php for ($i = $numeric1; $i <= $numeric2; $i++): ?>
                    <li><?= $i ?></li>
                <?php endfor ?>
            </ul>
        <?php endif ?>
    </body>
</html>