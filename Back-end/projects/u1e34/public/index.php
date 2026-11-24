<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
        <title>Remove from array</title>
    </head>
    
    <body>
        <?php include './php/remove_from_array.php' ?>

        <ul>
            <?php foreach ($provinces as $province): ?>
                <li><?= $province ?></li>
            <?php endforeach ?>
        </ul>
    </body>
</html>