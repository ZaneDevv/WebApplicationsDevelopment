// ------------------------------------------------------
// VARIABLES
// ------------------------------------------------------

const computingText = document.getElementById("computing-text");
const buttonsContainer = document.getElementById("buttons-container");

let operation = computingText.innerHTML;

// ------------------------------------------------------
// METHODS
// ------------------------------------------------------

const isStringANumber = (string) => !Number.isNaN(parseFloat(string));

function writePieceToFormula(piece)
{
    operation += piece;
    computingText.innerHTML = operation;
}

function addNumber(piece)
{
    if (operation === "0")
        operation = "";

    writePieceToFormula(piece);
}

function addOperation(piece)
{
    if (!isStringANumber(operation[operation.length - 1]))
        return;

    writePieceToFormula(piece);
}

function addNewPieceToFormula(piece)
{
    if (isStringANumber(piece))
        addNumber(piece);
    else
        addOperation(piece);
}

function computeOperation(x, y, operation)
{
    let result = x;

    switch (operation)
    {
    case "+":
        result = x + y;
        break;

    case "-":
        result = x - y;
        break;

    case "x":
    case "X":
        result = x * y;
        break;
    
    case "/":
        result = x / y;
        break;

    default:
        console.warn("Operation not recognized!");
        break;
    }

    return result;
}

function computeWholeOperation()
{
    let x = 0;
    let y = 0;
    let operator = "+";

    for (let character of operation)
    {
        if (isStringANumber(character))
        {
            y *= 10;
            y += parseInt(character);

            continue;
        }

        x = computeOperation(x, y, operator);
        y = 0;

        operator = character;
    }

    return computeOperation(x, y, operator);
}

function doEqual()
{
    operation = computeWholeOperation();
    computingText.innerHTML = operation;
}

// ------------------------------------------------------
// EVENTS
// ------------------------------------------------------

buttonsContainer.addEventListener("click", event => {
    if (event.target === buttonsContainer)
        return;

    let piece = event.target.innerHTML;

    if (piece === "=")
        doEqual();
    else
        addNewPieceToFormula(piece);
});