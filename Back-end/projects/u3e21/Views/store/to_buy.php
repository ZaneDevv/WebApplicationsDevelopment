<form method="POST" action="<?= BASE_URL . 'cart' ?>">
    <label for="product">Product to buy:</label>
    <input required type="text" id="product" name="product[name]" />

    <label for="amount">Amount:</label>
    <input required type="number" id="amount" name="product[amount]" />

    <input type="submit">
</form>