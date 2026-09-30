<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="./css/style.css">

        <title>Duplicate characters</title>
    </head>

    <body>
        <?php include './php/duplicator.php' ?>

        <form>
            <label for="text">Text to duplicate:</label>
            <input required id="text" name="text" type="text" placeholder="Write here a text...">
            <input type="submit">
        </form>

        <p><?= duplicateCharacters($_GET['text'] ?? '') ?></p>
    </body>
</html>