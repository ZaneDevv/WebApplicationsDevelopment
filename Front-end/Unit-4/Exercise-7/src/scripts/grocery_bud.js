// ------------------------------------------------------------------------
// VARIABLES
// ------------------------------------------------------------------------

const newItemInput = document.getElementById("new-item-input");
const itemsList = document.getElementById("elements-list");
const submitButton = document.getElementById("submit");
const clearAll = document.getElementById("clear-items");

// ------------------------------------------------------------------------
// METHODS
// ------------------------------------------------------------------------

function addElement(name)
{
    const div = document.createElement("div");
    div.style.borderRadius = "15px";
    div.style.backgroundColor = "white";

    const text = document.createElement("p");
    text.textContent = name;

    div.appendChild(text);
    itemsList.appendChild(div);
}

// ------------------------------------------------------------------------
// EVENTS
// ------------------------------------------------------------------------

submitButton.addEventListener("click", event => {
    addElement(newItemInput.value);
    newItemInput.value = "";
});

clearAll.addEventListener("click", event => {
    
});