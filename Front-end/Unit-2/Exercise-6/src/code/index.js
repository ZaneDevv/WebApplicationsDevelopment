/**
 * @author Álvaro Fernández Barrero
 */

// ---------------------------------------------------
// EXERCISE 1
// ---------------------------------------------------

function doExercise1()
{
    console.log("-------------------------\nEXERCISE 1\n-------------------------");
    
    navigator.geolocation.getCurrentPosition(data => {
        console.log(`Latitude: ${data.coords.latitude}`);
        console.log(`Longitude: ${data.coords.longitude}`);
    });
}

// ---------------------------------------------------
// EXERCISE 2
// ---------------------------------------------------

function doExercise2()
{
    console.log("-------------------------\nEXERCISE 2\n-------------------------");
    
    navigator.geolocation.getCurrentPosition(data => {
        document.write(`<p>Latitude: ${data.coords.latitude}</p>`);
        document.write(`<p>Longitude: ${data.coords.longitude}</p>`);
    });
}

// ---------------------------------------------------
// EXERCISE 3
// ---------------------------------------------------

function doExercise3()
{
    console.log("-------------------------\nEXERCISE 3\n-------------------------");

    navigator.geolocation.getCurrentPosition(
        console.log,
        data => console.warn(data.message)
    );
}

// ---------------------------------------------------
// EXERCISE 4
// ---------------------------------------------------

function doExercise4()
{
    console.log("-------------------------\nEXERCISE 4\n-------------------------");
    
    navigator.geolocation.watchPosition(
        data => {
            console.log(`Latitude: ${data.coords.latitude}`);
            console.log(`Longitude: ${data.coords.longitude}`);
        },
        data => console.warn(data.message)
    );
}

// ---------------------------------------------------
// EXERCISE 5
// ---------------------------------------------------

function doExercise5()
{
    console.log("-------------------------\nEXERCISE 5\n-------------------------");
    
    navigator.geolocation.getCurrentPosition(
        data => {
            let map = L.map('map').setView([data.coords.latitude, data.coords.longitude], 13);
            L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
                maxZoom: 19,
                attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
            }).addTo(map);
        },
        data => console.warn(data.message)
    );
}

// ---------------------------------------------------
// EXERCISE 6
// ---------------------------------------------------

function doExercise6()
{
    console.log("-------------------------\nEXERCISE 6\n-------------------------");
    navigator.geolocation.getCurrentPosition(data => document.write(`<p>Accuracy: ${data.coords.accuracy}</p>`));
}

// ---------------------------------------------------
// EXERCISE 7
// ---------------------------------------------------

function doExercise7()
{
    console.log("-------------------------\nEXERCISE 7\n-------------------------");
    
    navigator.geolocation.getCurrentPosition(data => {
        let coordinates = [data.coords.latitude, data.coords.longitude];

        let map = L.map('map').setView(coordinates, 13);

        let coordinate1 = L.latLng(coordinates);
        let coordinate2 = L.latLng([50.5, 30.5]);

        console.log(`Distance: ${L.GeometryUtil.distance(map, coordinate1, coordinate2).toFixed(2)}m`);
    });
}

// ---------------------------------------------------
// EXERCISE 8
// ---------------------------------------------------

function doExercise8()
{
    console.log("-------------------------\nEXERCISE 8\n-------------------------");
    
    let coordinates = [];
    let map = undefined;

    navigator.geolocation.getCurrentPosition(
        data => {
            let currentCoordinates = [data.coords.latitude, data.coords.longitude];

            coordinates.push(currentCoordinates);
            map = L.map('map').setView(currentCoordinates, 13);
        },
        data => console.warn(data.message)
    );

    navigator.geolocation.watchPosition(
        data => {
            let currentCoordinates = [data.coords.latitude, data.coords.longitude];
            coordinates.push(currentCoordinates);

            L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
                maxZoom: 19,
                attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
            }).addTo(map);

            L.polygon(coordinates).addTo(map);
        },
        data => console.warn(data.message)
    );
}

// ---------------------------------------------------
// EXERCISE 9
// ---------------------------------------------------

function doExercise9()
{
    console.log("-------------------------\nEXERCISE 9\n-------------------------");
    
    navigator.geolocation.getCurrentPosition(
        data => {
            let coordinates = [data.coords.latitude, data.coords.longitude];
            let map = L.map('map').setView(coordinates, 13);
            
            L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
                maxZoom: 19,
                attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
            }).addTo(map);

            L.circle(coordinates, {
                color: 'red',
                fillColor: '#f03',
                fillOpacity: 0.5,
                radius: 100
            }).addTo(map);
        },
        data => console.warn(data.message)
    );
}

// ---------------------------------------------------
// EXERCISE 10
// ---------------------------------------------------

function doExercise10()
{
    console.log("-------------------------\nEXERCISE 10\n-------------------------");
    
    let coordinates = [];

    let startingTime = 0;
    let totalDistance = 0;

    let map = undefined;

    function initializeTracking(centerMapCoordinates)
    {
        startingTime = new Date().getMilliseconds();
        map = L.map('map').setView(centerMapCoordinates, 13);

        L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
            maxZoom: 19,
            attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
        }).addTo(map);
    }

    function updateDistance()
    {
        if (coordinates.length >= 2)
            totalDistance += L.GeometryUtil.distance(
                map,
                L.latLng(coordinates[coordinates.length - 1]),
                L.latLng(coordinates[coordinates.length - 2])
            );
    }
    
    navigator.geolocation.watchPosition(
        data => {
            let currentCoordinates = [data.coords.latitude, data.coords.longitude];
            coordinates.push(currentCoordinates);

            if (map === undefined)
                initializeTracking(currentCoordinates);

            L.polygon(coordinates).addTo(map);

            let deltaTime = new Date().getMilliseconds() - startingTime;

            updateDistance();

            console.log(`Time: ${Math.floor(deltaTime / 1e3)}`);
            console.log(`Total distance: ${totalDistance.toFixed(2)}m`);
        },
        data => console.warn(data.message)
    );
}

// ---------------------------------------------------
// Run exercises
// ---------------------------------------------------

/*doExercise1();
doExercise2();
doExercise3();
doExercise4();
doExercise5();
doExercise6();
doExercise7();
doExercise8();
doExercise9();*/
doExercise10();