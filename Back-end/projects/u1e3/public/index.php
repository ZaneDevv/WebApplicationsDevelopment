<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Variables of variables</title>
    </head>

    <body>
        <?=
            $greeting_en = 'Hello and welcome to my web page!';
            $greeting_es = '¡Hola y bienvenido a mi p&aacute;gina!';
            $greeting_de = 'Hallo und willkommen zu meinmem Web!';
            $greeting_it = 'Ciao e benvenuto a la mia web!';

            $choosen_language = "de";

            $language_variable_name = 'greeting_' . $choosen_language;
        ?>

        <header>
            <p>Choseen language: <strong><?= $choosen_language ?></strong></p>
            <h1><?= $$language_variable_name; ?></h1>
            <h1><?= ${'greeting_' . $choosen_language}; ?></h1>
        </header>
    </body>
</html>