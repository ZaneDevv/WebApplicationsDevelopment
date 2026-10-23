// ----------------------------------------------------
// EXERCISE 3
// ----------------------------------------------------

function createCell()
{
    const cell = document.createElement("td");
    cell.classList = "cell";

    cell.onmouseenter = event => {
        if (event.shiftKey)
            cell.style.backgroundColor = "blue";

        if (event.ctrlKey)
            cell.style.backgroundColor = "red";

        if (event.altKey)
            cell.style.backgroundColor = "white";
    };

    return cell;
}

function generateCells()
{
    console.log("Generating canvas...");

    const table = document.getElementById("paint");

    for (let i = 0; i < 100; i++)
    {
        const row = document.createElement("tr");
        table.appendChild(row);

        for (let j = 0; j < 100; j++)
            row.appendChild(createCell());
    }

    console.log("Canvas generated!");
}

function cleanUpCells()
{
    for (cell of document.getElementsByClassName("cell"))
        cell.style.backgroundColor = "white";   
}

window.onload = generateCells;
document.getElementById("clean").onclick = cleanUpCells;