<h2>Form</h2>

<form method="POST" action="index.php" enctype="multipart/form-data">
    <p>
        <label for="pictures">Images:</label>
        <input type="file" id="pictures" name="pictures[]" multiple />
    </p>

    <input type="submit">
</form>

<?php if (isset($errors)): ?>
    <details>
        <summary>Errors</summary>

        <ul>
            <?php foreach ($errors as $key => $error): ?>
                <li>Image <?= $key ?>: <?= $error ?></li>
            <?php endforeach; ?>
        </ul>
    </details>
<?php endif; ?>

<?php if (isset($images)): ?>
    <h2>Images</h2>

    <?php foreach ($images as $image_path): ?>
        <img alt="image" src="<?= $image_path ?>">
    <?php endforeach; ?>
<?php endif; ?>