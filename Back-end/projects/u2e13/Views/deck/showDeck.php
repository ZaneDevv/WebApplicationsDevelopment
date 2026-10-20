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

    <?php foreach ($deck as $card): ?>
        <?php $image = $directoryImages . $card->cardImage; ?>

        <?php if (is_file($image)): ?>
            <img class="card" alt="Card: <?= $card ?>" src=<?= $image ?>>
        <?php else: ?>
            <p>Without an image for <?= $card ?></p>
        <?php endif; ?>
    <?php endforeach; ?>
<?php endif; ?>