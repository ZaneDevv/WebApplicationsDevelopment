<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="./css/main.css">

        <title>Decimal/binary/octal/hexadecimal</title>
    </head>

    <body>
        <?php
            define('STARTING_NUMBER', 0);
            define('FINAL_NUMBER', 20);
        ?>

        <table>
            <thead>
                <tr>
                    <th>Decimal</th>
                    <th>Binary</th>
                    <th>Octal</th>
                    <th>Hexadecimal</th>
                </tr>
            </thead>

            <tbody>
                <?php for ($i = STARTING_NUMBER; $i <= FINAL_NUMBER; $i++): ?>
                    <tr>
                        <td><?= $i ?></td>
                        <td>0b<?= decbin($i) ?></td>
                        <td>0<?= decoct($i) ?></td>
                        <td>0x<?= dechex($i) ?></td>
                    </tr>
                <?php endfor ?>
            </tbody>
        </table>
    </body>
</html>