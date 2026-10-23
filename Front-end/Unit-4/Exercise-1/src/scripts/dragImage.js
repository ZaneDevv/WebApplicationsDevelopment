window.onload = () => {
    const images = document.getElementsByClassName("draggable");

    let offsetX = 0;
    let offsetY = 0;

    for (const image of images) {
        image.src = "https://i.pinimg.com/736x/ea/0c/1b/ea0c1b927600238b6a54297d002a5e88.jpg";

         image.addEventListener("dragstart", (event) => {
            let dimensions = image.getBoundingClientRect();
            
            offsetX = event.clientX - dimensions.left;
            offsetY = event.clientY - dimensions.top;
        });

        image.addEventListener("drag", (event) => {
            if (event.clientX === 0 && event.clientY === 0)
                return;

            image.style.left = `${event.clientX - offsetX}px`;
            image.style.top = `${event.clientY - offsetY}px`;
        });
    }
};