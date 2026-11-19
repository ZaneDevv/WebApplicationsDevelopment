<?php
    declare(strict_types = 1);

    $directoryImages = './assets/img/';
    $urlImages = 'assets/img';
?>

<?php if (isset($card)): ?>
    <?php $image = $directoryImages . $card->cardImage; ?>
    
    <?php if (is_file($image)): ?>
        <img class="card" alt="Card: <?= $card ?>" src=<?= $image ?>>
    <?php endif; ?>
<?php endif; ?>