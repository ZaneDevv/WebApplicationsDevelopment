const colors = ["red", "blue", "yellow", "green"];

window.onload = () => {
    const pickColorText = document.getElementById("selected-color-text");

    function pickColor()
    {
        let color = colors[Math.floor(Math.random() * colors.length)];
        pickColorText.innerHTML = `Pick the color <strong style="color: ${color}">${color.toUpperCase()}</strong>`
    }

    pickColor();
}