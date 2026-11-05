<?php if (isset($article)): ?>
    <p>Name: <?= $article->name ?></p>
    <p>Description: <?= $article->description ?></p>
    <p>Price: $<?= $article->price ?></p>
<?php endif; ?>