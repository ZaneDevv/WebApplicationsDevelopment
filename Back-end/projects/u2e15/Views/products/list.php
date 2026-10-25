<?php if (isset($products)): ?>
    <?php foreach ($products as $product): ?>
        <?php
            $stock = $product->getStock();
            $stockMessage = $stock > 0 ? $stock : 'Out of stock!';
        ?>

        <h2><?= $product->getName() ?></h2>
        <p>Price: <?= $product->getPrice() ?> &pound;</p>
        <p>Stock: <?= $stockMessage ?></p>
    <?php endforeach; ?>
<?php endif; ?>