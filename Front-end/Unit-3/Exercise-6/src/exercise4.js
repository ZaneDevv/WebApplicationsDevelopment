let matrix = [];
let saddlePoints = [];

function fillUpMatrix(n = 5, m = 5)
{
    for (let i = 0; i < n; i++)
    {
        let row = [];

        for (let j = 0; j < m; j++)
            row.push(Math.round(Math.random() * 1e3));

        matrix.push(row);
    }
}

function isPositionTheGreatestInTheRow(i, j)
{
    let row = matrix[i];
    return Math.max(...row) === matrix[i][j];
}

function isPositionTheLowestInTheColumn(i, j)
{
    let column = [];
    for (let n = 0; n < matrix.length; n++)
        column.push(matrix[n][j]);

    return Math.min(...column) === matrix[i][j];
}

const isSaddlePoint = (i, j) => isPositionTheGreatestInTheRow(i, j) && isPositionTheLowestInTheColumn(i, j);

function findSaddlePoints()
{
    if (matrix.length < 0)
        return;

    for (let i = 0; i < matrix.length; i++)
    {
        let row = matrix[i];

        for (let j = 0; j < row.length; j++)
        {
            if (isSaddlePoint(i, j))
                saddlePoints.push({
                    x: i,
                    y: j
                });
        }
    }
}

fillUpMatrix();
findSaddlePoints();

console.log(matrix);
console.log(saddlePoints.length === 0 ? "No saddle points" : saddlePoints);