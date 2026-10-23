window.onload = () => {
    const colors = ["red", "blue", "yellow", "green"];

    const pickColorText = document.getElementById("selected-color-text");
    const colorsContainer = document.getElementById("colors-container");

    let selectedColor = undefined;

    function pickColor()
    {
        selectedColor = colors[Math.floor(Math.random() * colors.length)];
        pickColorText.innerHTML = `Pick the color <strong style="color: ${selectedColor}">${selectedColor.toUpperCase()}</strong>`
    }

    pickColor();
    
    colorsContainer.addEventListener("click", event => {
        const buttonColor = event.target.id;

        if (selectedColor === buttonColor)
            pickColor();
    });
}