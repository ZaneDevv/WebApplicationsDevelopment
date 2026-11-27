/**
 * Examen JavaScript 27/11/2926
 * Álvaro Fernández Barrero
 * 2º DAW
 */

// ---------------------------------------------------------------------------------------
// GLOBALES
// ---------------------------------------------------------------------------------------

const restaurants = [
    {
        name: "Restaurante 1",
        address: "C\ Picasso",
        web: "https://www.restaurante1.es/",
        images: [
            "https://picsum.photos/id/292/300/300"
        ]
    },
    {
        name: "Restaurante 2",
        address: "C\ Einstein",
        web: "https://www.restaurante2.es/",
        images: [
            "https://picsum.photos/id/429/300/200",
        ]
    },
    {
        name: "Restaurante 3",
        address: "C\ Vivaldi",
        web: "https://www.restaurante3.es/",
        images: [
            "https://picsum.photos/id/431/300/200"
        ]
    }
];

const restaurantsTableId = "tablaRestaurantes";

// ---------------------------------------------------------------------------------------
// MÉTODOS (ejercicios)
// ---------------------------------------------------------------------------------------

function exercise1()
{
    const body = document.querySelectorAll("body")[0];

    const imagesParent = document.createElement("div");

    const table = document.createElement("table");
    table.id = restaurantsTableId;

    const thead = document.createElement("thead");
    const rowth = document.createElement("tr");

    const nameTitle = document.createElement("th");
    nameTitle.textContent = "Nombre";

    const addressTitle = document.createElement("th");
    addressTitle.textContent = "Direccion";

    const imagesTitle = document.createElement("th");
    imagesTitle.textContent = "Imágenes";

    const webTitle = document.createElement("th");
    webTitle.textContent = "Web";

    for (let i = 0; i < restaurants.length; i++)
    {
        const restaurant = restaurants[i];

        const row = document.createElement("tr");

        const name = document.createElement("td");
        name.textContent = restaurant.name;

        const address = document.createElement("td");
        address.textContent = restaurant.address;

        const buttonData = document.createElement("td");

        const imagesButton = document.createElement("button");
        imagesButton.textContent = "Mostrar imágenes";
        imagesButton.className = "mostrar-imagenes";
        imagesButton.id = `r${i}`;
        buttonData.appendChild(imagesButton);

        const webData = document.createElement("td");

        const web = document.createElement("a");
        web.target = "_blank";
        web.textContent = restaurant.web;
        web.href = restaurant.web;
        webData.appendChild(web);

        row.appendChild(name);
        row.appendChild(address);
        row.appendChild(buttonData);
        row.appendChild(webData);
        table.appendChild(row);
    }

    rowth.appendChild(nameTitle);
    rowth.appendChild(addressTitle);
    rowth.appendChild(imagesTitle);
    rowth.appendChild(webTitle);
    thead.appendChild(rowth);
    table.appendChild(thead);
    body.appendChild(table);

    body.appendChild(imagesParent);


    document.addEventListener("click", event => {
        if (event.target.className === "mostrar-imagenes")
        {
            const index = parseInt(event.target.id.substring(1));

            while (imagesParent.lastChild)
                imagesParent.lastChild.remove();

            for (const image of restaurants[index].images)
            {
                const imageHtml = document.createElement("img");
                imageHtml.alt = "Restaurante";
                imageHtml.src = image;
                imagesParent.appendChild(imageHtml);
            }
        }
    });
}


function exercise2(name, address, web, tableId)
{
    const table = getTBody(document.getElementById(tableId));

    const row = document.createElement("tr");

    const nameHtml = document.createElement("td");
    nameHtml.textContent = name;

    const addressHtml = document.createElement("td");
    addressHtml.textContent = address;

    const webData = document.createElement("td");

    const webHtml = document.createElement("a");
    webHtml.target = "_blank";
    webHtml.href = web;
    webHtml.textContent = web;
    webData.appendChild(webHtml);

    row.appendChild(nameHtml)
    row.appendChild(addressHtml);
    row.appendChild(document.createElement("td"));
    row.appendChild(webData);

    table.insertBefore(row, table.children[countInitialHeaders(table)]);
}


function exercise3(position, tableId)
{
    if (position < 0)
        return;
    const table = getTBody(document.getElementById(tableId));
    const index = position + countInitialHeaders(table);
    const element = table.children[position + countInitialHeaders(table)];

    if (!element || isListHeader(element))
        return;

    table.removeChild(element);
}


function exercise4(text)
{
    const regexLength = /.{12,}/;
    const regexUppercase = /[A-Z]/;
    const regexSpecial = /[-@#_]/;

    return regexLength.test(text) && regexUppercase.test(text) && regexSpecial.test(text);
}


function exercise5(data, containerId)
{
    const parent = document.getElementById(containerId);
    const list = document.createElement("ol");

    let lastLi = undefined;

    for (let i = 0; i < data.length; i++)
    {
        const item = data[i];

        if (typeof item !== "object")
        {
            lastLi = document.createElement("li");
            lastLi.textContent = `${item} (Elemento pos[${i}])`
            list.appendChild(lastLi);
        }
        else
        {
            if (!lastLi)
            {
                lastLi = document.createElement("li");
                list.appendChild(lastLi);
            }

            const sublist = document.createElement("ol");

            for (let j = 0; j < item.length; j++)
            {
                const subli = document.createElement("li");
                subli.textContent = `${item[j]} (Elemento pos[${i}][${j}])`;
                sublist.appendChild(subli);
            }

            lastLi.appendChild(sublist);
        }
    }

    parent.appendChild(list);
}

// ---------------------------------------------------------------------------------------
// MÉTODOS AUXILIARES
// ---------------------------------------------------------------------------------------

function isListHeader(node)
{
    if (!node)
        return false;

    if (node.nodeName.toLowerCase() === "thead")
        return true;

    if (node.nodeName.toLowerCase() !== "tr")
        return false;

    const child =  node.children[0];
    return child && child.nodeName.toLowerCase() === "th";
}


function countInitialHeaders(table)
{
    const children = table.children;

    let count = 0;
    let stop = false;

    for (let i = 0; !stop && i < children.length; i++)
    {
        stop = !isListHeader(children[i]);
        if (!stop)
            count++;
    }

    return count;
}


function getTBody(table)
{
    const children = table.children;
    let tbody = undefined;

    for (let i = 0; !tbody && i < children.length; i++)
    {
        if (children[i].nodeName.toLowerCase() === "tbody")
            tbody = children[i];
    }

    return tbody ? tbody : table;
}