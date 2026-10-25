// ------------------------------------------------------
// VARIABLES
// ------------------------------------------------------

const colorTextToGuess = document.getElementById("color-to-guess");
const colorsContainer = document.getElementById("colors-container");

// ------------------------------------------------------
// METHODS
// ------------------------------------------------------

const getRandomColorNumber = () => Math.floor(Math.random() * 256);
const getRandomColor = () => {
    let red = getRandomColorNumber();
    let green = getRandomColorNumber();
    let blue = getRandomColorNumber();

    return {
        red: red,
        green: green,
        blue: blue
    }
};

function getPossibleColors(correctColor)
{
    let possibleColors = [];
    for (let i = 0; i < 6; i++)
        possibleColors.push(getRandomColor());

    let correctColorPosition = Math.floor(Math.random() * possibleColors.length);
    possibleColors[correctColorPosition] = correctColor;

    return possibleColors;
}

function generateColorsUi(possibilities, colorToSelect)
{
    for (let possibility of possibilities)
    {
        const colorUi = document.createElement("div");
        colorUi.className = "color";
        colorUi.style.backgroundColor = `rgb(${possibility.red}, ${possibility.green}, ${possibility.blue})`;

        if (colorToSelect === possibility)
            colorUi.id = "selected";

        colorsContainer.appendChild(colorUi);
    }
}

function initializeMatch()
{
    colorsContainer.innerHTML = "";

    const selectedColor = getRandomColor();
    colorTextToGuess.innerHTML = `RGB <span id="red">${selectedColor.red}</span>,
                                      <span id="green">${selectedColor.green}</span>,
                                      <span id="blue">${selectedColor.blue}</span>`;

    let possibilities = getPossibleColors(selectedColor);
    generateColorsUi(possibilities, selectedColor);
}

function winMatch()
{
    alert("Great!")
    initializeMatch();
}

function loseMatch()
{
    alert("Haha you nerd.");
}

// ------------------------------------------------------
// EVENTS
// ------------------------------------------------------

colorsContainer.addEventListener("click", event => {
    if (event.target === colorsContainer)
        return;

    if (event.target.id === "selected")
        winMatch();

    else
        loseMatch();
})

// ------------------------------------------------------
// SET UP
// ------------------------------------------------------

initializeMatch();