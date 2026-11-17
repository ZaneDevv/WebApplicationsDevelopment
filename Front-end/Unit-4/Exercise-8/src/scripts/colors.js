// -----------------------------------------------------------------------
// JSON
// -----------------------------------------------------------------------

const colors = {
  "colors": [
    {
      "color": "black",
      "category": "hue",
      "type": "primary",
      "code": {
        "rgba": [255,255,255,1],
        "hex": "#000"
      }
    },
    {
      "color": "white",
      "category": "value",
      "code": {
        "rgba": [0,0,0,1],
        "hex": "#FFF"
      }
    },
    {
      "color": "red",
      "category": "hue",
      "type": "primary",
      "code": {
        "rgba": [255,0,0,1],
        "hex": "#F00"
      }
    },
    {
      "color": "blue",
      "category": "hue",
      "type": "primary",
      "code": {
        "rgba": [0,0,255,1],
        "hex": "#00F"
      }
    },
    {
      "color": "yellow",
      "category": "hue",
      "type": "primary",
      "code": {
        "rgba": [255,255,0,1],
        "hex": "#FF0"
      }
    },
    {
      "color": "green",
      "category": "hue",
      "type": "secondary",
      "code": {
        "rgba": [0,255,0,1],
        "hex": "#0F0"
      }
    }
  ]
}

// -----------------------------------------------------------------------
// VARIABLES
// -----------------------------------------------------------------------

const parent = document.querySelectorAll("body")[0];

let currentCard = undefined;

// -----------------------------------------------------------------------
// METHODS
// -----------------------------------------------------------------------

function createElementToCard(content, element = "p")
{
    if (!currentCard)
        return;

    const newElement = document.createElement(element);
    newElement.textContent = content;
    
    currentCard.appendChild(newElement);
}

// -----------------------------------------------------------------------
// DRAWING
// -----------------------------------------------------------------------

for (const colorData of colors.colors)
{
    currentCard = document.createElement("div");
    currentCard.style.backgroundColor = colorData.code.hex;

    createElementToCard(colorData.color[0].toUpperCase() + colorData.color.slice(1).toLocaleLowerCase(), "h2");
    createElementToCard(colorData.code.hex);
  
    createElementToCard(colorData.category);
    createElementToCard(`rgba(${colorData.code.rgba})`);
    
    if (colorData.type)
        createElementToCard(colorData.type);
    
    parent.appendChild(currentCard);
}