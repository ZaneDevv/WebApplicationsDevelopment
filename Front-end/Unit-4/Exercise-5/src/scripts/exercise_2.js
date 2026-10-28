window.addEventListener("touchmove", event => {
    const finger0 = event.touches[0];

    circle.style.left = `${finger0.clientX - circle.clientWidth * 0.5}px`;
    circle.style.top = `${finger0.clientY - circle.clientHeight * 0.5}px`;
});