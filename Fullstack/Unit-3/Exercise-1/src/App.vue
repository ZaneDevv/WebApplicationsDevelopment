<script>
    import { ref } from 'vue';

    export default
    {
        setup()
        {
            const input = ref("");
            const names = ref([]);

            const addList = () =>
            {
                names.value.push(input.value);
                input.value = "";
            }

            return {input, names, addList};
        }
    }
</script>

<template>
    <input v-model="input" type="text">
    <button @click="addList()">Add</button>

    <ul>
        <li v-for="name of names">{{ name }}</li>
    </ul>
</template>

<style scoped></style>
