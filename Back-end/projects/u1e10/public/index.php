<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>2nd degree equation</title>
    </head>

    <body>
        <?php
            define("DECIMAL_PRECISION", 3);

            $a = 1;
            $b = 2;
            $c = 3;

            if ($a === 0)
            {
                echo 'The given values do not make a 2nd-degree equation';
            }
            else
            {
                $bSquared = $b ** 2;
                $fourac = 4 * $a * $c;
    
                if ($bSquared < $fourac)
                {
                    echo 'The equation has no real roots';
                }
                else
                {
                    $root = sqrt($bSquared - $fourac);
                    $divisor = 2 * $a;
        
                    $result1 = round(($root - $b) / $divisor, DECIMAL_PRECISION);
                    $result2 = round((-$b - $root) / $divisor, DECIMAL_PRECISION);
                }
    
            }        
        ?>

        <p>=> <?= $a ?>x<sup>2</sup> + <?= $b ?>x + <?= $c ?> = 0</p>
        <p>x<sub>1</sub> = <?= $result1 ?? 'NaN' ?></p>
        <p>x<sub>2</sub> = <?= $result2 ?? 'NaN' ?></p>
    </body>
</html>