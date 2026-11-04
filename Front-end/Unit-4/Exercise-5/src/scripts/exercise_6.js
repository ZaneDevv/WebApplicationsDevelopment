let startingXPosition = 0;

container.addEventListener("touchstart", event => {
    startingXPosition = event.touches[0].clientX;
});

container.addEventListener("touchmove", event => {
    const finger0 = event.touches[0];

    const deltaX = finger0.clientX - startingXPosition;
});