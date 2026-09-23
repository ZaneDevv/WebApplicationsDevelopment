<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Document</title>
    </head>

    <body>
        <?php
            $country = "Austria";
            $population = 9200000;
            $continent = "Europe"; 

            echo "<pre>";

            echo "Country: " . $country . ", " . gettype($country) . PHP_EOL;
            echo "Population: " . $population . ", " . gettype($population) . PHP_EOL;
            echo "Continent: " . $continent . ", " . gettype($continent);

            echo "</pre>";
        ?>        
    </body>
</html>