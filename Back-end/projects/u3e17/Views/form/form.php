<?php
    if (!isset($language))
        $language = DEFAULT_LANGUAGE;
?>

<p>
<?= match ($language)
{
    'english' => 'Select a language',
    'german' => 'Sprache',
    'spanish' => 'Selecciona un idioma',
    'italian' => 'Lingua'
}
?></p>

<form method="POST" action="index.php">
    <select id="language" name="language">
        <option value="english">English</option>
        <option value="german">Deutsch</option>
        <option value="spanish">Espa&ntilde;ol</option>
        <option value="italian">Italiano</option>        
    </select>

    <input type="submit" value="Change language">
</form>