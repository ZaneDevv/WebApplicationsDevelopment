window.onload = () => {
    const colors = ["red", "blue", "yellow", "green"];

    const pickColorText = document.getElementById("selected-color-text");
    let selectedColor = undefined;

    function pickColor()
    {
        selectedColor = colors[Math.floor(Math.random() * colors.length)];
        pickColorText.innerHTML = `Pick the color <strong style="color: ${selectedColor}">${selectedColor.toUpperCase()}</strong>`
    }

    function applyMethodToButton(color)
    {
        document.getElementById(color).addEventListener("click", () => {
            if (selectedColor === color)
                pickColor();
        });
    }

    pickColor();

    for (let color of colors)
        applyMethodToButton(color);
}