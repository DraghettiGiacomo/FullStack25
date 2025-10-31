<script setup lang="ts">
const props = defineProps<{
    id: number
    nomeCard: string,
    annoCard: number
    stazzaCard: number
    tipoCard: string
    statoCard: string
}>();

const emit = defineEmits(['delete']);
</script>

<template>
    <div class="card">
        <h2>{{nomeCard || "Nave senza nome"}}</h2>
        <p>{{tipoCard || "Peschereccio"}}</p>
        <p>{{annoCard || 1900}}</p>
        <p>{{stazzaCard || 1200}} (tonnellate)</p>
        <p>{{statoCard || "Fuori uso"}}</p>
        <button @click="emit('delete', id)">elimina nave</button>
    </div>
</template>

<style>
.card{
    width: 11%;
    padding: 1em;
    border: 1px solid lightgray;
}
.card *{
    padding: 0;
    margin: 0;
}
</style>