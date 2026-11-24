<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
     
        <title>Round method</title>
    </head>
    
    <body>
        <?php
            $sphereRadius = 10;

            $length = 2 * M_PI * $sphereRadius;
            $surface = 4 * M_PI * $sphereRadius ** 2;
            $volume = (4/3) * M_PI * $sphereRadius ** 3;

            printf('Diameter: %.2f<br>', $length);
            printf('Surface: %.2f<br>', $surface);
            printf('Volume: %.2f<br>', $volume);
        ?>

        <p>Length: <?= round($length, 2) ?></p>
        <p>Surgace: <?= round($surface, 2) ?></p>
        <p>Volume: <?= round($volume, 2) ?></p>
    </body>
</html>