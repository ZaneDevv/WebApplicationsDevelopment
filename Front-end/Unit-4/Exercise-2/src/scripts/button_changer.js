window.onload = () => {
    const button = document.getElementById("button");
    
    const CLICK_MESSAGE = "Heyy!! Don't click me...";
    const NORMAL_MESSAGE = button.innerHTML;
    const CLICK_MESSAGE_DURATION = 2e+3;

    const HOVER_COLOR = "green";
    const NORMAL_COLOR = button.style.backgroundColor;

    let lastClickTime = 0;

    button.addEventListener("mouseover", () => button.style.backgroundColor = HOVER_COLOR);
    button.addEventListener("mouseout", () => button.style.backgroundColor = NORMAL_COLOR);

    button.addEventListener("click", () => {
        button.innerHTML = CLICK_MESSAGE;
        lastClickTime = Date.now();

        setTimeout(() => {
            if (Date.now() - lastClickTime >= CLICK_MESSAGE_DURATION)
                button.innerHTML = NORMAL_MESSAGE;
        }, CLICK_MESSAGE_DURATION);
    });
}