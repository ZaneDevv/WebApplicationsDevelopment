// -----------------------------------------------------
// Box 1
// -----------------------------------------------------

let offset1 = undefined;
let position1 = {
    x: 0,
    y: 0
}

box1.addEventListener("touchstart", event => {
    event.preventDefault();
    
    let finger1 = event.touches[0]; 
    offset1 = {
        x: finger1.clientX - position1.x,
        y: finger1.clientY - position1.y,
    };

    box1.style.backgroundColor = "blue";
});

box1.addEventListener("touchend", event => {
    event.preventDefault();
    
    offset1 = undefined;
    box1.style.backgroundColor = "red";
});

box1.addEventListener("touchmove", event => {
    if (offset1 === undefined)
        return
    
    let finger1 = event.touches[0];

    position1 = {
        x: finger1.clientX - offset1.x,
        y: finger1.clientY - offset1.y
    }

    box1.style.left = `${position1.x}px`;
    box1.style.top = `${position1.y}px`;
});

// -----------------------------------------------------
// Box 2
// -----------------------------------------------------

const cursor_position = {
    x: 0,
    y: 0
};

box2.addEventListener("touchstart", event => {
    event.preventDefault();

    const finger1 = event.touches[0];

    cursor_position.x = finger1.clientX;
    cursor_position.y = finger1.clientY;
});

box2.addEventListener("touchend", event => {
    event.preventDefault();

    const finger1 = event.changedTouches[0];

    let deltaX = cursor_position.x - finger1.clientX;
    let deltaY = cursor_position.y - finger1.clientY;

    let distancePositionxX = Math.abs(deltaX);
    let distancePositionxY = Math.abs(deltaY);

    let directionX = cursor_position.x > finger1.clientX ? "Left" : cursor_position.x < finger1.clientX ? "Right" : "No moved";
    let directionY = cursor_position.y > finger1.clientY ? "Up" : cursor_position.y < finger1.clientY ? "Down" : "No moved";

    box2.innerHTML = distancePositionxX < distancePositionxY ? directionY : directionX;
});