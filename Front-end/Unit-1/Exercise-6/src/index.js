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

document.write("<hr>");
console.log("-------------------------\nEXERCISE 2\n-------------------------");

{
    const BLACK_COLOR = "#2A2A40";
    const WHITE_COLOR = "#E0E0E0";

    let size = Math.abs(parseInt(prompt("Set the squares's size in pixels:")));

    const styleWidth = "width: " + size + "px; min-width: " + size + "px; max-width: " + size + "px";
    const styleHeight = "height: " + size + "px; min-height: " + size + "px; max-height: " + size + "px";
    const styleDimensions = styleWidth + "; " + styleHeight;

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