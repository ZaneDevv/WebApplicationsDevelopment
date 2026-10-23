// ----------------------------------------------------
// EXERCISE 1
// ----------------------------------------------------

document.getElementById("my-button").onclick = () => alert("CLICK");

// ----------------------------------------------------
// EXERCISE 2
// ----------------------------------------------------

document.addEventListener("mousemove", event => console.log(`<${event.clientX}, ${event.clientY}>`));

// ----------------------------------------------------
// EXERCISE 3
// ----------------------------------------------------

window.onload = event => console.log(`Time taken to load: ${event.timeStamp}ms`);

// ----------------------------------------------------
// EXERCISE 8
// ----------------------------------------------------

const textInput = document.getElementById("text-input");
textInput.addEventListener("blur", () => {
    textInput.value = textInput.value.replaceAll("&", "and");
});