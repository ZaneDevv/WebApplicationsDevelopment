<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
        <title>Car</title>
    </head>
    
    <body>
        <?php include_once './php/main.php' ?>

        <h1>Car data</h1>
        <ul>
            <li>Brand: <?= $car->brand ?></li>
            <li>Model: <?= $car->model ?></li>
            <li>Color: <?= $car->color ?></li>
            <li>Horses: <?= $car->horses ?></li>
            <li>Speed: <?= $car->speed ?></li>
            <li>Seats: <?= $car->seats ?></li>
        </ul>
    </body>
</html>