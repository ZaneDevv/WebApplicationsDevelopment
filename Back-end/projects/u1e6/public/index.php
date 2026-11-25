<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Constants</title>
    </head>

    <body>
        <?php
            define("CONVERSOR_MULTIPLIER", 1.14);
            
            $euros = 86;
            $dollars = $euros * CONVERSOR_MULTIPLIER;
        ?>
        
        <p><?= $euros ?>€ = $<?= $dollars ?></p>
    </body>
</html>