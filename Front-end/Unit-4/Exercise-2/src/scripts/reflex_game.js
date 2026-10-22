window.onload = () => {
    const button = document.getElementById("button");
    const message = document.getElementById("message-text");

    const DEFAULT_COLOR = button.style.backgroundColor;
    const TO_PRESS_COLOR = "green";

    const isButtonReadyToBePressed = () => button.style.backgroundColor === TO_PRESS_COLOR;

    button.addEventListener("click", () => {
        message.innerHTML = isButtonReadyToBePressed() ? "Good reflex" : "Not quite good...";
    })

    setInterval(() => {
        button.style.backgroundColor = TO_PRESS_COLOR;
        setTimeout(() => button.style.backgroundColor = DEFAULT_COLOR, 400);
    }, 2e+3 + Math.random() * 3e+3);
}