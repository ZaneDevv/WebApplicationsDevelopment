<?php
    declare(strict_types = 1);

    $directoryImages = './assets/img/';
    $urlImages = 'assets/img';
?>

<?php if (isset($player)): ?>
    <h2><?= $player->name ?></h2>

    <?php foreach ($player->takenCards as $card): ?>
        <?php $image = $directoryImages . $card->cardImage; ?>

        <?php if (is_file($image)): ?>
            <img class="card" alt="Card: <?= $card ?>" src=<?= $image ?>>
        <?php else: ?>
            <p>Without an image for <?= $card ?></p>
        <?php endif; ?>
    <?php endforeach; ?>

    <p>Total points: <?= $player->points ?></p>
<?php endif; ?>