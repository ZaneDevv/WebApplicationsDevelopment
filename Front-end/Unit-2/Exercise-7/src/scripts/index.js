/**
 * @author Álvaro Fernández Barrero
 */

// -----------------------------------------------------------------
// CONSTANTS
// -----------------------------------------------------------------

const TIME_ZONE = "en-US";

const TIME_PARAGRAPH_OBJECT_ID = "time-text";
const TIME_PARAGRAPH_OBJECT = document.getElementById(TIME_PARAGRAPH_OBJECT_ID);

const DATE_PARAGRAPH_OBJECT_ID = "date-text";
const DATE_PARAGRAPH_OBJECT = document.getElementById(DATE_PARAGRAPH_OBJECT_ID);

const TEXT_COLOR = getComputedStyle(document.documentElement).getPropertyValue("--lighter-color");
const HIGHLIGHT_COLOR = getComputedStyle(document.documentElement).getPropertyValue("--highlight-color");

const TIME_TO_RESET_DIGIT_CSS_MILLISECONDS = 500;

// -----------------------------------------------------------------
// GLOBAL VARIABLES
// -----------------------------------------------------------------

let lastTimeString = "";

// -----------------------------------------------------------------
// METHODS
// -----------------------------------------------------------------

/**
 * Formats the given 2-digit number to have each digit separated and encapsulated in a span mark
 * @param {*} x 2-digit number to format
 * @returns The 2-digit number formatted
 * @author Álvaro Fernández Barrero
 */
function formatInTimeTwoDigitNumber(x)
{
    let digit0 = Math.floor(x / 10) % 10;
    let digit1 = x % 10;
    
    return `<span>${digit0}</span><span>${digit1}</span>`; 
}

/**
 * Formats the given time
 * @param {*} date Date to format
 * @returns A string with the current time formatted
 * @author Álvaro Fernández Barrero
 */
function getFormattedTime(date)
{
    const hourFormatted = formatInTimeTwoDigitNumber(date.getHours());
    const minuteFormatted = formatInTimeTwoDigitNumber(date.getMinutes());
    const secondFormatted = formatInTimeTwoDigitNumber(date.getSeconds());

    return `${hourFormatted}:${minuteFormatted}:${secondFormatted}`;
}

/**
 * Gives the span HTML element corresponding to the given digit's index
 * @param {*} index Digit's index
 * @returns The span HTML element which corresponds to the given digit's index. Undefined if it was not found
 * @author Álvaro Fernández Barrero
 */
function getDigitsSpainByDigitIndex(index)
{
    return document.querySelectorAll(`#${TIME_PARAGRAPH_OBJECT_ID} span:nth-child(${index})`)[0];
}

/**
 * Modifies the CSS of the digits that were modified 
 * @param {*} lastTimeString Previos time string
 * @param {*} newTimeString New time string
 * @author Álvaro Fernández Barrero
 */
function setHighlightOnAlteredDigits(lastTimeString, newTimeString)
{
    lastTimeString = lastTimeString.split("<span>");
    newTimeString = newTimeString.split("<span>");

    for (let i = 0; i < lastTimeString.length; i++)
    {
        let lastDigit = lastTimeString[i][0];
        let newDigit = newTimeString[i][0];

        if (lastDigit !== newDigit)
        {
            let spanToAlter = getDigitsSpainByDigitIndex(i);
            if (spanToAlter !== undefined)
            {
                spanToAlter.style.color = HIGHLIGHT_COLOR;
                setTimeout(
                    () => spanToAlter.style.color = TEXT_COLOR,
                    TIME_TO_RESET_DIGIT_CSS_MILLISECONDS
                );
            }
        }
    }

    console.log("------------------------------");
}

/**
 * Updates the whole clock
 * @author Álvaro Fernández Barrero
 */
function updateClock()
{
    const now = new Date();
    
    const dayName = now.toLocaleDateString(TIME_ZONE, {weekday: "long"})
    const monthName = now.toLocaleDateString(TIME_ZONE, {month: "long"})

    let newTimeString = getFormattedTime(now); 
    TIME_PARAGRAPH_OBJECT.innerHTML = newTimeString;
    setHighlightOnAlteredDigits(lastTimeString, newTimeString);

    DATE_PARAGRAPH_OBJECT.innerHTML = `${dayName}, ${now.getDate()}th of ${monthName}, ${now.getFullYear()}`;
    
    lastTimeString = newTimeString;
}

// -----------------------------------------------------------------
// INITIALIZE
// -----------------------------------------------------------------

updateClock();
setInterval(updateClock, 1e3);