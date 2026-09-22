<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Document</title>
    </head>
    
    <body>
        <?php
            $array1 = [33, 44, 55];
            $array2 = array(11, 22);
            $array3 = array(
                'name' => 'Jane',
                'last_name' => 'Doe'
            );

            print_r($array1);
            echo '<br>';
            print_r($array2);
            echo '<br>';
            print_r($array3);
        ?>
    </body>
</html>