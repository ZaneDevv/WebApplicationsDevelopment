<?php
    if (!isset($color))
        $color = DEFAULT_COLOR;
?>

<html lang="en">
    <body style="background-color: <?= $color ?>">
        <form method="POST" action="index.php">
            <label>Background color:</label>
            <input type="color" name="color" value="<?= $color ?>"/>

            <input type="submit">
        </form>
    </body>
</html>