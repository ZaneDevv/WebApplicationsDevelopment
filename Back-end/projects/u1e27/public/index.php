<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Compute mcd</title>
    </head>

    <body>
        <?php include './php/math.php' ?>
        <p>mcd(<?= $_GET['x'] ?>, <?= $_GET['y'] ?>) = <?= mcd((int)($_GET['x']), (int)($_GET['y'])) ?></p>
    </body>
</html>