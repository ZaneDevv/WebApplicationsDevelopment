// -----------------------------------------------------
// VARIABLES
// -----------------------------------------------------

const capitalCaseRegex = new RegExp("[A-Z]");
const specialCharactersRegex = new RegExp("!@#$%\^&");
const emailRegex = new RegExp("^\A(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*| \"(?:[\x01**-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]**| \\\[\x01**-\x09\x0b\x0c\x0e-\x7f])*\")@ \(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?| \\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?\:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]**| \\[\x01**-\x09\x0b\x0c\x0e-\x7f]**)+)\])\z $");
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