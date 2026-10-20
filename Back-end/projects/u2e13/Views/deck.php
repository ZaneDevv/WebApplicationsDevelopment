<?php
declare(strict_types = 1);

$directoryImages = __DIR__ . '/../../public/assets/img/';
$urlImages = 'assets/img';
?>

<h2><?= $title ?? 'Deck' ?></h2>

<?php if (!is_dir($urlImages)): ?>
    <p>Images not found... Looking for assets/img</p>
<?php elseif (!isset($deck) || count($deck) === 0): ?>
    <p>The deck is empty</p>
<?php else: ?>
    <p>Cards amount: <?= count($deck) ?></p>
<?php endif ?>