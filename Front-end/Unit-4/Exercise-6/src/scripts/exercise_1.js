// -----------------------------------------------------
// VARIABLES
// -----------------------------------------------------

const capitalCaseRegex = new RegExp("[A-Z]");
const specialCharactersRegex = new RegExp("!@#$%\^&");
const emailRegex = new RegExp("^\w[a-zA-Z0-9-_\.]{2,}@\w[a-zA-Z0-9-_\.]+\.\w{2,}$");
const validateCreditCard = new RegExp("^\d{16}\s\w{3,}\s\d{2}\s\d{4}\s\d{3,4}$");
const atLeast8CharactersRegex = new RegExp(".{8}");
const validateNumberRegex = new RegExp("\d");

// -----------------------------------------------------
// METHODS
// -----------------------------------------------------

const validateCapitalCase = string => capitalCaseRegex.test(string);
const validateSpecialCharacters = string => specialCharactersRegex.test(string);
const validateEmail = string => emailRegex.test(string);
const validateCardNumber = string => validateCreditCard.test(string);
const validate8Characters = string => atLeast8CharactersRegex.test(string);
const validateAtLeastOneDigit = string => validateNumberRegex.test(string);