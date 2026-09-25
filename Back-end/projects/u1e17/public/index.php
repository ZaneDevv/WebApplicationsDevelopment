<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="./css/main.css">

        <title>Calculator</title>
    </head>

    <body>
        <?php
            try
            {
                $x = $_GET['x-number'];
                $y = $_GET['y-number'];
                $operation = $_GET['operation'];
    
                if (!(empty($x) || empty($y) || empty($operation)))
                {
                    if (is_numeric($x) && is_numeric($y))
                    {
                        $result = match ($operation)
                        {
                            'add' => $x + $y,
                            'subtract' => $x - $y,
                            'multiply' => $x * $y,
                            'divide' => $x / $y
                        };
                    }
                }
            }
            catch (exception $exception)
            {
                echo $exception;
            }
        ?>

        <div id="calculator-container">
            <form action="index.php">
                <div class="input-container number-input-container">
                    <label for="x-number">x:</label>
                    <input required type="number" name="x-number" id="x-number" placeholder="0" value=<?= $x ?? 0 ?>>
                </div>
    
                <div class="input-container number-input-container">
                    <label for="y-number">y:</label>
                    <input required type="number" name="y-number" id="y-number" placeholder="0" value=<?= $y ?? 0 ?>>
                </div>
    
                <div class="input-container">
                    <label for="operation">Operation to perform:</label>
                    <select required id="operation" name="operation" value=<?= $operation ?>>
                        <option value="add">Add</option>
                        <option value="subtract">Subtract</option>
                        <option value="multiply">Multiply</option>
                        <option value="divide">Divide</option>
                    </select>
                </div>
    
                <input type="submit" value="Calculate">
            </form>

            <p> ∴
                <?= $x ?>
                <?= 
                    match ($operation)
                    {
                        'add' => '+',
                        'subtract' => '-',
                        'multiply' => 'x',
                        'divide' => '/'
                    };
                ?>
                <?= $y ?>
                = <?= $result ?? 'NaN' ?>
            </p>
        </div>

    </body>
</html>