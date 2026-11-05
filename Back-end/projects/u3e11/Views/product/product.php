<?php if (isset($product)): ?>
    <p>Name: <?= $product['name'] ?>
    <p>Description: <?= $product['description'] ?>
    <p>Price: $<?= $product['price'] ?>
<?php endif; ?>