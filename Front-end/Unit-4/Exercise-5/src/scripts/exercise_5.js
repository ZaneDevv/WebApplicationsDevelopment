let startingTouch = 0;
let lastClick = 0;

let fastClicks = 1;
let hasMoved = false;

box.addEventListener("touchstart", _ => {
    startingTouch = Date.now();
    hasMoved = false;
});

box.addEventListener("touchmove", _ => {
    hasMoved = true;
})

box.addEventListener("touchend", _ => {
    const now = Date.now();

    if (now - startingTouch >= 500 && !hasMoved)
        hidden.style.display = "block";

    if (now - lastClick <= 300)
    {
        if (++fastClicks === 2)
            box.style.borderRadius = "50%";
    }
    else
    {
        fastClicks = 1;
    }

    lastClick = now;
});