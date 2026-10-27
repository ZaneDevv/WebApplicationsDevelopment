let offset = undefined;
let position = {
    x: 0,
    y: 0
}

box.addEventListener("touchstart", event => {
    event.preventDefault();
    
    let finger1 = event.touches[0]; 
    offset = {
        x: finger1.clientX - position.x,
        y: finger1.clientY - position.y,
    };

    box.style.backgroundColor = "blue";
});

box.addEventListener("touchend", event => {
    event.preventDefault();
    
    offset = undefined;
    box.style.backgroundColor = "red";
});

window.addEventListener("touchmove", event => {
    if (offset === undefined)
        return
    
    let finger1 = event.touches[0];

    position = {
        x: finger1.clientX - offset.x,
        y: finger1.clientY - offset.y
    }

    box.style.left = `${position.x}px`;
    box.style.top = `${position.y}px`;
});