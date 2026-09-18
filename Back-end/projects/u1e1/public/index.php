<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
        <title>First php code</title>
    </head>
    
    <body>
        <?php
            // Look up differences among <?=, print and echo
            echo "Random number generated: " . rand(0, 100);
            print("<br>Random number generated: " . rand(0, 100));
        ?>    
        <?= "<br>HI" ?>
    </body>
</html>