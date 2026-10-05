/**
 * @author Álvaro Fernández Barrero
 */

document.getElementById("browser").innerHTML = `Browser: ${window.navigator.userAgent}`;
document.getElementById("language").innerHTML = `Language: ${window.navigator.language}`;
document.getElementById("platform").innerHTML = `Platform: ${window.navigator.platform}`;
document.getElementById("resolution").innerHTML = `Resolution: ${window.screen.availWidth}x${window.screen.availHeight}`;

document.getElementById("url").innerHTML = `URL: ${window.location.href}`

document.getElementById("url-button").addEventListener("click", () => window.navigation.navigate("https://www.wikipedia.com"));

document.getElementById("total-resolution").innerHTML = `Total resolution: ${screen.width}x${screen.height}`;
document.getElementById("available-area").innerHTML = `Available area: ${screen.availWidth}x${screen.availHeight}`;
document.getElementById("orientation").innerHTML = `Orientation: ${screen.orientation.type}`;
document.getElementById("color-depth").innerHTML = `Color depth: ${screen.colorDepth}px`;
document.getElementById("pixel-depth").innerHTML = `Pixel depth: ${screen.pixelDepth}px`;