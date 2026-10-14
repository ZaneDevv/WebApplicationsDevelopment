const areDifferentSpots = (spot0, spot1) => spot0.i !== spot1.i || spot0.j !== spot1.j;
const pritnSpot = spot => console.log(`X: ${spot.i + 1}, Y: ${spot.j + 1}`);

let board = [];

function setUpBoard(dimensions = 5)
{
    if (dimensions < 1 || dimensions > 10)
        dimensions = 5;

    let previousDimension = dimensions - 1;

    let trasureX = Math.floor(Math.random() * previousDimension);
    let trasureY = Math.floor(Math.random() * previousDimension);

    for (let i = 0; i < dimensions; i++)
    {
        let row = []
        for (let j = 0; j < dimensions; j++)
            row.push((1 + Math.round(Math.random() * previousDimension)) * 10 + 1 + Math.round(Math.random() * previousDimension));

        board.push(row);
    }

    board[trasureX][trasureY] = 11 + trasureX * 10 + trasureY;
}

function printBoard()
{
    if (board.length === 0)
        return;

    let finalPrint = "";
    let separator = `+${"----+".repeat(board.length)}`;

    for (let i = 0; i < board.length; i++)
    {
        let row = board[i];
        let rowText = "|";

        for (let j = 0; j < row.length; j++)
            rowText += ` ${row[j]} |`;
        
        finalPrint += `${rowText}"\n${separator}\n`;
    }

    console.log(`${separator}\n${finalPrint}`);
}

function readNextSpot(i, j)
{
    if (board.length === 0)
        return;

    let number = board[i][j];
    return {
        i: Math.floor(number / 10) - 1,
        j: number % 10 - 1
    };
}


setUpBoard(3);
printBoard();

let currentSpot = {i: 0, j: 0};
let nextSpot = readNextSpot(currentSpot.i, currentSpot.j);
let iterations = 0;

while (areDifferentSpots(currentSpot, nextSpot) && iterations++ < 50)
{
    currentSpot = nextSpot;
    nextSpot = readNextSpot(currentSpot.i, currentSpot.j);
}

pritnSpot(currentSpot);