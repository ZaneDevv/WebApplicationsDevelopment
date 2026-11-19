window.onload = () => {
    const button = document.getElementById("run-button");
    const progressBar = document.getElementById("progress");

    let progress = 0;
    
    const clamp = (x, min, max) => x < min ? min : x > max ? max : x;
    const updateBar = () => progressBar.style.width = `${progress}%`;

    function increaseProgress(amount)
    {
        progress += amount;
        progress = clamp(progress, 0, 100);

        updateBar();
    }

    button.addEventListener("click", () => increaseProgress(1));

    setInterval(() => {
        if (progress < 100)
            increaseProgress(-progress / 70);
    }, 350);
}