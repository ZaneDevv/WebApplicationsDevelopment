<table>
    <thead>
        <th>Product</th>
        <th>Amount</th>
    </thead>

    <?php if (isset($products)): ?>
        <tbody>
            <?php foreach ($products as $name => $amount): ?>
                <tr>
                    <td><?= htmlspecialchars(ucfirst($name)) ?></td>
                    <td><?= htmlspecialchars($amount) ?></td>
                </tr>
            <?php endforeach ?>
        </tbody>
    <?php endif; ?>
</table>