/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 1\n-------------------------");

for (let i = 1; i <= 6; i++)
{
    document.write("<h" + i + ">Heading h" + i + "<h" + i + ">");
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 2\n-------------------------");

{
    let columns = Math.abs(parseInt(prompt("Give me the table's columns amount")));
    let widthCell = Math.abs(parseInt(prompt("Give me the table's cell's width")));
    let heightCell = Math.abs(parseInt(prompt("Give me the table's cell's height")));

    const widthStyle = "width: " + widthCell + "px;";
    const heightStyle = "height: " + heightCell + "px;";
    const styleCss = "style='display: inline-block; margin: 0; border: 2px solid black;" + widthStyle + heightStyle + "'";

    document.write("<hr>");
    document.write("<table><tr>");
    for (let i = 0; i < columns; i++)
    {
        document.write("<td " + styleCss + "></td>");
    }
    document.write("</tr></table>");
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 3\n-------------------------");

{
    let columns = Math.abs(parseInt(prompt("Give me the table's columns amount")));
    let widthCell = Math.abs(parseInt(prompt("Give me the table's cell's width")));
    let heightCell = Math.abs(parseInt(prompt("Give me the table's cell's height")));

    const widthStyle = "width: " + widthCell + "px;";
    const heightStyle = "height: " + heightCell + "px;";
    const styleCss = "display: inline-block; margin: 0; border: 2px solid black;" + widthStyle + heightStyle;

    document.write("<hr>");
    document.write("<table><tr>");
    for (let i = 0; i < columns; i++)
    {
        let color = ((i & 1) === 0) ? "#2A2A40;" : "#E0E0E0;";
        document.write("<td style='background-color: " + color + styleCss + "'></td>");
    }
    document.write("</tr></table>");
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 4\n-------------------------");

{
    let columns = Math.abs(parseInt(prompt("Give me the table's columns amount")));
    let widthCell = Math.abs(parseInt(prompt("Give me the table's cell's width")));
    let heightCell = Math.abs(parseInt(prompt("Give me the table's cell's height")));

    const widthStyle = "width: " + widthCell + "px;";
    const heightStyle = "height: " + heightCell + "px;";
    const styleCss = "style='display: inline-block; margin: 0; border: 2px solid black;" + widthStyle + heightStyle + "'";

    document.write("<hr>");
    document.write("<table><tr>");

    let i = 0;
    while (i++ < columns)
    {
        document.write("<td " + styleCss + "></td>");
    }
    document.write("</tr></table>");
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 5\n-------------------------");

{
    let columns = Math.abs(parseInt(prompt("Give me the table's columns amount")));
    let widthCell = Math.abs(parseInt(prompt("Give me the table's cell's width")));
    let heightCell = Math.abs(parseInt(prompt("Give me the table's cell's height")));

    const widthStyle = "width: " + widthCell + "px;";
    const heightStyle = "height: " + heightCell + "px;";
    const styleCss = "display: inline-block; margin: 0; border: 2px solid black;" + widthStyle + heightStyle;

    document.write("<hr>");
    document.write("<table><tr>");

    let i = 0;
    while (i++ < columns)
    {
        let color = ((i & 1) === 0) ? "#2A2A40;" : "#E0E0E0;";
        document.write("<td style='background-color: " + color + styleCss + "'></td>");
    }
    document.write("</tr></table>");
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 6\n-------------------------");

{
    let numberToGuess = parseInt(prompt("Set a number to guess"));
    let lastAttempt = 0;
    let wasRight = false;

    do
    {
        lastAttempt = parseInt(prompt("Give me a guess for the number"));
        wasRight = lastAttempt === numberToGuess;

        if (!wasRight)
        {
            console.log(lastAttempt < numberToGuess ? "The number you're looking for is greater!" : "The number you're looking for is lower!");
        }
    }
    while (!wasRight);
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 7\n-------------------------");

for (let i = 0; i <= 10; i++)
{
    for (let j = 0; j <= 10; j++)
    {
        console.log(i + "x" + j + " = " + (i * j));
    }
    console.log("\n");
}

// ---------------------------------------------------
// EXERCISE 8
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 8\n-------------------------");

{
    let columnsAmount = Math.abs(parseInt(prompt("Set columns amount")));
    let rowsAmount = Math.abs(parseInt(prompt("Set rows amount")));
    let cellWidth = Math.abs(parseInt(prompt("Set cell's width")));
    let cellHeight = Math.abs(parseInt(prompt("Set cell's height")));

    const dimensionsStyle = "width: " + cellWidth + "px; height: " + cellHeight + "px;";
    const style = "display: inline-block; background-color: #E0E0E0;" + dimensionsStyle + " border: 2px solid #2A2A40";

    document.write("<hr>");

    document.write("<table>");
    for (let i = 0; i < rowsAmount; i++)
    {
        document.write("<tr>");
        for (let j = 0; j < columnsAmount; j++)
        {
            document.write("<td style='" + style + "'></td>")
        }
        document.write("</tr>");
    }
    document.write("</table>");
}

// ---------------------------------------------------
// EXERCISE 9
// ---------------------------------------------------

console.log("-------------------------\nEXERCISE 9\n-------------------------");

{
    const BLACK_COLOR = "#2A2A40";
    const WHITE_COLOR = "#E0E0E0";
    
    let size = Math.abs(parseInt(prompt("Set the squares's size in pixels:")));
    
    const styleWidth = "width: " + size + "px; min-width: " + size + "px; max-width: " + size + "px";
    const styleHeight = "height: " + size + "px; min-height: " + size + "px; max-height: " + size + "px";
    const styleDimensions = styleWidth + "; " + styleHeight;
    
    document.write("<hr>");

    for (let i = 0; i < 8; i++)
    {
        for (let j = 0; j < 8; j++)
        {
            let color = ((i + j) & 1) === 0 ? BLACK_COLOR : WHITE_COLOR;
            document.write("<span style='display: inline-block; margin: 0; background-color: " + color + "; " + styleDimensions + "'></span>");
        }
        document.write("<br>");
    }
}