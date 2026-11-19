let startingCoordinates = {
    x: 0,
    y: 0
}

box.addEventListener("touchstart", event => {
    const finger0 = event.touches[0];
    
    startingCoordinates.x = finger0.clientX;
    startingCoordinates.y = finger0.clientY;
})

box.addEventListener("touchend", event => {
    const finger0 = event.changedTouches[0];

    const deltaX = finger0.clientX - startingCoordinates.x;
    const deltaY = finger0.clientY - startingCoordinates.y;

    if (Math.abs(deltaX) > Math.abs(deltaY))
        console.log(deltaX < 0 ? "Left" : "Right");

    else
        console.log(deltaY < 0 ? "Up" : "Down");
})