<?php if (isset($author)): ?>
    <h2><?= $author->name ?></h2>

    <ul>
        <li>Nationality: <?= $author->nationality ?></li>
    </ul>
<?php endif; ?>

<?php if (isset($authors)): ?>
    <?php foreach($authors as $author): ?>
        <h2><?= $author->name ?></h2>

        <ul>
            <li>Nationality: <?= $author->nationality ?></li>
        </ul>
    <?php endforeach; ?>
<?php endif; ?>