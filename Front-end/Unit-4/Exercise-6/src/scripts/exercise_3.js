// -----------------------------------------------------
// CONSTANTS
// -----------------------------------------------------

const lowerCaseRegex = new RegExp("[a-z]");
const upperCaseRegex = new RegExp("[A-Z]");
const minimumCharactersRegex = new RegExp(".{8}");

// -----------------------------------------------------
// METHODS
// -----------------------------------------------------

function validateUsername()
{
    console.log("A");
    lowercase.style.textDecoration = lowerCaseRegex.test(username.value) ? "line-through" : "none";
    uppercase.style.textDecoration = upperCaseRegex.test(username.value) ? "line-through" : "none";
    minimum.style.textDecoration = minimumCharactersRegex.test(username.value) ? "line-through" : "none";
}

// -----------------------------------------------------
// EVENTS
// -----------------------------------------------------

username.addEventListener("input", validateUsername);