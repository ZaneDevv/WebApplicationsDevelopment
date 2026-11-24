<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
        <title>Check whether a number is prime</title>
    </head>
    
    <body>
        <?php include './php/math.php' ?>
        <p><?= $_GET['x'] ?> is <?= isPrime((int)($_GET['x'])) ? 'prime' : 'composed' ?>.</p>
    </body>
</html>