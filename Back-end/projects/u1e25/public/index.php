<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Today's date</title>
    </head>

    <body>
        <?php
            include './php/times.php'
        ?>

        <p><?= getTimeFrance() ?></p>
    </body>
</html>