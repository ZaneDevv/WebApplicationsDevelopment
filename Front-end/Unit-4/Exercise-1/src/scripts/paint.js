// ----------------------------------------------------
// EXERCISE 3
// ----------------------------------------------------

const table = document.getElementById("paint");

function createCell()
{
    const cell = document.createElement("td");
    cell.classList = "cell";

    return cell;
}

function generateCells()
{
    for (let i = 0; i < 100; i++)
    {
        const row = document.createElement("tr");
        table.appendChild(row);

        for (let j = 0; j < 100; j++)
        {
            const cell = document.createElement("td");
            cell.classList = "cell";
            row.appendChild(cell);
        }
    }
}

function cleanUpCells()
{
    for (cell of document.getElementsByClassName("cell"))
        cell.style.backgroundColor = "white";   
}

table.addEventListener("mouseover", (event) => {
    if (event.target === table)
        return;

    if (event.shiftKey)
        event.target.style.backgroundColor = "blue";

    if (event.ctrlKey)
        event.target.style.backgroundColor = "red";

    if (event.altKey)
        event.target.style.backgroundColor = "white";
});

window.onload = generateCells;
document.getElementById("clean").onclick = cleanUpCells;