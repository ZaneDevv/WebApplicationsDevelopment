<form method="POST" action="index.php">
    <p>
        <label for="x">x:</label>
        <input required type="number" id="x" name="operation[x]">
    </p>

    <p>
        <label for="y">y:</label>
        <input required type="int" id="y" name="operation[y]">
    </p>

    <p>
        <label for="operator">Opartor:</label>
        <select required id="operator" name="operation[operator]">
            <option value="add">Addition</option>
            <option value="subtract">Subtraction</option>
            <option value="muliply">Multiplication</option>
            <option value="divide">Division</option>
        </select>
    </p>

    <input type="submit" value="Compute">
</form>