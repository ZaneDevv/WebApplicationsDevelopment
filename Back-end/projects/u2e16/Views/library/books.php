<?php if (isset($book)): ?>
    <h2><?= $book->title ?></h2>

    <ul>
        <li>Release year: <?= $book->year ?></li>
        <li><?= $book->available ? 'It\'s available!' : 'It\'s out of sale...' ?></li>
    </ul>
<?php endif; ?>

<?php if (isset($books)): ?>
    <?php foreach($books as $book): ?>
        <h2><?= $book->title ?></h2>

        <ul>
            <li>Release year: <?= $book->year ?></li>
            <li><?= $book->available ? 'It\'s available!' : 'It\'s out of sale...' ?></li>
        </ul>
    <?php endforeach; ?>
<?php endif; ?>