let startDistance = -1;

function computeSquareDistance(x0, x1, y0, y1)
{
    const deltaX = x0 - x1;
    const deltaY = y0 - y1;

    return deltaX * deltaX + deltaY * deltaY;
}

duck.addEventListener("touchstart", event => {
    event.preventDefault();

    if (event.touches.length !== 2)
    {
        startDistance = -1;
        return;
    }

    startDistance = computeSquareDistance(
        event.touches[0].clientX, event.touches[0].clientY,
        event.touches[1].clientX, event.touches[1].clientY
    );
})

duck.addEventListener("touchmove", event => {
    event.preventDefault();

    if (event.touches.length !== 2)
        return;
    
    const distance = startDistance = computeSquareDistance(
        event.touches[0].clientX, event.touches[0].clientY,
        event.touches[1].clientX, event.touches[1].clientY
    );

    if (startDistance < 0)
        startDistance = distance;

    const deltaDistance = distance - startDistance;

    duck.style.transform = `scale(${deltaDistance + 1})`;
})