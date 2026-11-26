<table>
    <thead>
        <th>Product</th>
        <th>Amount</th>
    </thead>

    <?php if (isset($products)): ?>
        <tbody>
            <?php foreach ($products as $name => $amount): ?>
                <tr>
                    <td><?= $name ?></td>
                    <td><?= $amount ?></td>
                </tr>
            <?php endforeach ?>
        </tbody>
    <?php endif; ?>
</table>