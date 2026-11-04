// -----------------------------------------------------
// CONSTANTS
// -----------------------------------------------------

const VALID_COLOR = "#0B0";
const INVALID_COLOR = "#D00";

// -----------------------------------------------------
// VARIABLES
// -----------------------------------------------------

const dniRegex = new RegExp("^\d{9}\w$");
const phoneRegex = new RegExp("^\+\d{1,3}\s(\d{3}\s\d{3}\s\d{3})|(\d{9})|(\d{3}\s\d{2}\s\d{2}\d{2})$");
const emailRegex = new RegExp("^\w[a-zA-Z0-9-_\.]{2,}@\w[a-zA-Z0-9-_\.]+\.\w{2,}$");
const usernameRegex = new RegExp("^(?=.*\d)(?=.*\w).{8,}$");

// -----------------------------------------------------
// EVENTS
// -----------------------------------------------------

dni.addEventListener("blur", () => {
    dni.style.borderColor = dniRegex.test(dni.value) ? VALID_COLOR : INVALID_COLOR;
});

phone.addEventListener("blur", () => {
    phone.style.borderColor = phoneRegex.test(phone.value) ? VALID_COLOR : INVALID_COLOR;
});

email.addEventListener("blur", () => {
    email.style.borderColor = emailRegex.test(email.value) ? VALID_COLOR : INVALID_COLOR;
});

username.addEventListener("blur", () => {
    username.style.borderColor = usernameRegex.test(username.value) ? VALID_COLOR : INVALID_COLOR;
});