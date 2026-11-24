<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="./css/main.css">

        <title>Numbers translations</title>
    </head>

    <body>
        <?php
            $numbersEnglish = array(
                1 => 'One',
                2 => 'Two',
                3 => 'Three',
                4 => 'Four',
                5 => 'Five',
                6 => 'Six',
                7 => 'Seven',
                8 => 'Eight',
                9 => 'Nine',
                10 => 'Ten'
            );

            $numbersTranslations = array(
                'One' => 'Uno',
                'Two' => 'Dos',
                'Three' => 'Tres',
                'Four' => 'Cuatro',
                'Five' => 'Cinco',
                'Six' => 'Seis',
                'Seven' => 'Siete',
                'Eight' => 'Ocho',
                'Nine' => 'Nueve',
                'Ten' => 'Diez'
            );
        ?>

        <table>
            <tbody>
                <?php for ($i = 1; $i <= 10; $i++): ?>
                    <tr>
                        <td><?= $numbersEnglish[$i] ?></td>
                        <td><?= $numbersTranslations[$numbersEnglish[$i]] ?></td>
                    </tr>
                <?php endfor ?>
            </tbody>
        </table>
    </body>
</html>