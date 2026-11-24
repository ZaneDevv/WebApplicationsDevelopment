<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
        <title>Random numbers and print testing</title>
    </head>
    
    <body>
        <?= "<br>HI" ?>

        <?php
            $name = "John Doe";
            $genre = "Masculine";

            // Quotes understand variable, simple quotes don't
            echo "<h2>Welcome, $name!</h2>";
            echo '<h2>Welcome, $name!</h2>';

            echo '<h2>Welcome, ', $name, '</h2>';

            // Look up differences among <?=, print and echo
            echo "Random number generated: " . rand(0, 100);

            $result = (print("<br>Random number generated: " . rand(0, 100))) * 5;
            echo $result;
        ?>

        <ul>
            <li>Name: <?= $name ?></li>
            <li>Genre: <?= $genre ?></li>
        </ul>

        <?php 
            echo phpinfo();
        ?>
    </body>
</html>