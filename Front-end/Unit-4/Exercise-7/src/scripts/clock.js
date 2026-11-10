// ------------------------------------------------------------------------
// VARIABLES
// ------------------------------------------------------------------------

const timer = document.getElementById("timer");

const start = document.getElementById("start");
const stop = document.getElementById("stop");
const reset = document.getElementById("reset");

let secondsPassed = 0;

let keepCounting = false;

// ------------------------------------------------------------------------
// METHODS
// ------------------------------------------------------------------------

const getNumberString = number => (number < 10 ? '0' : '') + number;

const update = () => {
    const minuten = Math.floor(secondsPassed / 60) % 60;
    const sekunden = secondsPassed % 60;

    timer.textContent = `${getNumberString(minuten)}:${getNumberString(sekunden)}`; 
}

// ------------------------------------------------------------------------
// EVENTS
// ------------------------------------------------------------------------

start.addEventListener("click", event => {
    keepCounting = true;
});

stop.addEventListener("click", event => {
    keepCounting = false;
});

reset.addEventListener("click", event => {
    secondsPassed = 0;
    update();
});

// ------------------------------------------------------------------------
// LOOP
// ------------------------------------------------------------------------

setInterval(() => {
    if (keepCounting)
    {
        secondsPassed++;
        update();
    }
}, 1e3);