<?php
    declare(strict_types = 1);
?>

<!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
        <title>Powers</title>
    </head>
    
    <body>
        <?php
            /**
             * Powers the given base to the given exponent
             * 
             * @param float $base Base number to power
             * @param ?int $exponent Exponent number, 2 if it is not set or an invalid data type
             * 
             * @return float The result of the base powered to the exponent
             */
            function power(float $base, ?int $exponent) : float
            {
                if ($base === 1)
                    return 1;

                if ($base === 0)
                    return 0;

                if (is_null($exponent) || gettype($exponent) !== 'number')
                    $exponent = 2;

                $result = 1;
                
                for ($i = 1; $i <= $exponent; $i++)
                {
                    $result *= $base;
                }

                return $result;
            }
        ?>

        <p>2<sup>2</sup> = <?= power(2, null) ?></p>
        <p>10<sup>2</sup> = <?= power(10, null) ?></p>
        <p>5.3<sup>2</sup> = <?= power(5.3, null) ?></p>
        <p>3<sup>5</sup> = <?= power(3, 5) ?></p>
        <p>25<sup>3</sup> = <?= power(25, 3) ?></p>
        <p>1<sup>28</sup> = <?= power(1, 28) ?></p>
        <p>100<sup>5</sup> = <?= power(100, 5) ?></p>
    </body>
</html>