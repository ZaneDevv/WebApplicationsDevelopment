box.addEventListener("touchstart", event => {
    box.style.backgroundColor = "green";
});

box.addEventListener("touchend", event => {
    box.style.backgroundColor = "red";
});

box.addEventListener("touchmove", event => {
    box.style.backgroundColor = "yellow";
});