<script>
    import { ref } from 'vue';

    export default
    {
        setup()
        {
            // ----------------------------------------------------------------------
            // EXERCIE 1
            // ----------------------------------------------------------------------

            const name = "Álvaro";
            const currentYear = 2026;

            // ----------------------------------------------------------------------
            // EXERCIE 2
            // ----------------------------------------------------------------------

            const grossPrice = 100;
            const tax = 21;

            // ----------------------------------------------------------------------
            // EXERCIE 3
            // ----------------------------------------------------------------------
            
            const Car = {
                brand: "Mercedes",
                model: "A",
                kilometers: 250
            }

            // ----------------------------------------------------------------------
            // EXERCIE 4
            // ----------------------------------------------------------------------

            const message = ref("");

            // ----------------------------------------------------------------------
            // EXERCIE 5
            // ----------------------------------------------------------------------

            const text = ref("");

            // ----------------------------------------------------------------------
            // EXERCIE 6
            // ----------------------------------------------------------------------

            const city = ref("");

            // ----------------------------------------------------------------------
            // EXERCIE 7
            // ----------------------------------------------------------------------

            const accept = ref(false);

            // ----------------------------------------------------------------------
            // EXERCIE 8
            // ----------------------------------------------------------------------

            const fruits = ["Apple", "Pear", "Orange"];

            // ----------------------------------------------------------------------
            // EXERCIE 9
            // ----------------------------------------------------------------------

            const languages = ["HTML", "CSS", "JavaScript"];

            // ----------------------------------------------------------------------
            // EXERCIE 10/11
            // ----------------------------------------------------------------------

            class Product
            {
                id = "";
                name = "";
                price = 0;

                constructor(id, name, price)
                {
                    this.id = id;
                    this.name = name;
                    this.price = price;
                }
            }

            const products = ref([
                new Product("P1", "Chalk", 2.5),
                new Product("P2", "Vicenç", 200),
                new Product("P3", "Keyboard", 36)
            ]);

            // ----------------------------------------------------------------------
            // EXERCIE 12
            // ----------------------------------------------------------------------

            const titleSection = ref("");
            const tasks = [
                "Wash the dishwasher",
                "Walk the dog",
                "Prepare the meat"
            ];

            // ----------------------------------------------------------------------
            // RETURN
            // ----------------------------------------------------------------------

            return {
                name, currentYear,
                grossPrice, tax,
                Car,
                message,
                text,
                city,
                accept,
                fruits,
                languages,
                products,
                titleSection, tasks
            };
        }
    }
</script>

<template>
    <!------------------------------------------------ EXERCISE 1 ------------------------------------------------>
    <h2>Exercise 1</h2>
    <p>Hello, I'm {{ name }} and it's {{ currentYear }}</p>

    <!------------------------------------------------ EXERCISE 2 ------------------------------------------------>
    <h2>Exercise 2</h2>
    <p>${{ grossPrice + (grossPrice * tax / 100) }}</p>

    <!------------------------------------------------ EXERCISE 3 ------------------------------------------------>
    <h2>Exercise 3</h2>
    <p>Car:</p>
    <ul>
        <li>Brand: {{ Car.brand }}</li>
        <li>Model: {{ Car.model }}</li>
        <li>Kilometers: {{ Car.kilometers }}</li>
    </ul>

    <!------------------------------------------------ EXERCISE 4 ------------------------------------------------>
    <h2>Exercise 4</h2>
    <input type="text" v-model="message">
    <p>{{ message }}</p>

    <!------------------------------------------------ EXERCISE 5 ------------------------------------------------>
    <h2>Exercise 5</h2>
    <textarea v-model="text"></textarea>
    <p>Length: {{ text.length }}</p>

    <!------------------------------------------------ EXERCISE 6 ------------------------------------------------>
    <h2>Exercise 6</h2>
    <select v-model="city">
        <option value="Zurich">Zürich</option>
        <option value="Cologne">Cologne</option>
        <option value="Osaka">Osaka</option>
        <option value="Nice">Nice</option>
    </select>
    <p>Chosen: {{ city }}</p>

    <!------------------------------------------------ EXERCISE 7 ------------------------------------------------>
    <h2>Exercise 7</h2>
    <input type="checkbox" v-model="accept">
    <p>State: {{ accept }}</p>

    <!------------------------------------------------ EXERCISE 8 ------------------------------------------------>
    <h2>Exercise 8</h2>
    <ul>
        <li v-for="fruit in fruits">{{ fruit }}</li>
    </ul>

    <!------------------------------------------------ EXERCISE 9 ------------------------------------------------>
    <h2>Exercise 9</h2>
    <ul>
        <li v-for="(language, index) in languages">{{ index + 1 }}. {{ language }}</li>
    </ul>

    <!------------------------------------------------ EXERCISE 10/11 ------------------------------------------------>
    <h2>Exercise 10</h2>
    <ol>
        <li v-for="product in products" :key="product.id">
            <p>{{ product.name }} - {{ product.price }}€</p>
            <input type="number" v-model="product.price ">
        </li>
    </ol>

    <!------------------------------------------------ EXERCISE 12 ------------------------------------------------>
    <h2>Exercise 12</h2>
    <h3>{{ titleSection }}</h3>
    <input type="text" v-model="titleSection">
    <ul>
        <li v-for="task in tasks">{{ task }}</li>
    </ul>
</template>

<style scoped></style>
