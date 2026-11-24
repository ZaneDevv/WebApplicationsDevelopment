<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="./css/style.css">

        <title>Car number plate</title>
    </head>
    <body>
        <?php include './php/number_checker.php' ?>

        <form>
            <label for="plate-number">Plate number:</label>
            <input required type="text" placeholder="XXXXXXX" id="plate-number" name="plate-number" value=<?= $_GET['plate-number'] ?? '' ?> >
            <input type="submit" />
        </form>

        <p><?= $printingText ?></p>
    </body>
</html>