let offsetX = 0;
let offsetY = 0;

let position = {
    x: 0,
    y: 0
};

function setPosition()
{
    circle.style.left = `${position.x}px`;
    circle.style.top = `${position.y}px`;
}
setPosition();

circle.addEventListener("touchstart", event => {
    const finger0 = event.touches[0];

    offsetX = finger0.clientX - position.x;
    offsetY = finger0.clientY - position.y;
});

circle.addEventListener("touchmove", event => {
    const finger0 = event.touches[0];

    position.x = finger0.clientX - offsetX;
    position.y = finger0.clientY - offsetY;

    setPosition();
});

circle.addEventListener("touchend", event => {
    const finger0 = event.changedTouches[0];
    const selectedElement = document.elementsFromPoint(finger0.clientX, finger0.clientY).filter(element => element.className === "slot")[0];

    if (selectedElement)
    {
        const boundary = selectedElement.getBoundingClientRect();

        position.x = boundary.left;
        position.y = boundary.top;

        setPosition();
    }
});