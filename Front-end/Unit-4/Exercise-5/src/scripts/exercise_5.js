let startingTouch = -1;
let lastClick = -1;

let fastClicks = 0;
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
    const timeSinceLastClick = now - lastClick;
    const timeSinceLastPress = now - startingTouch;

    if (timeSinceLastClick < 300 || lastClick < 0 || fastClicks <= 0)
    {
        fastClicks++;

        if (fastClicks >= 2)
            box.style.borderRadius = "50%";
    }
    else
    {
        fastClicks = 0;

        if (!hasMoved && lastClick > 0 && timeSinceLastPress > 1e+3)
            hidden.style.display = "block";
    }

    lastClick = now;
});