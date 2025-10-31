<script setup lang="ts">
import type { Aereo } from './interface';
const props = defineProps<{
    aereo: Aereo
}>();
const emit = defineEmits(['delete']);
</script>

<template>
    <div class="card">
        <h3>{{aereo.modello}}</h3>
        <p>{{aereo.compagnia}}</p>
        <p>{{aereo.anno}}</p>
        <p>{{aereo.tipo}}</p>
        <p>{{aereo.capacitaPasseggeri}}</p>
        <p>{{aereo.autonomiaVolo}}</p>
        <p>{{aereo.statoRiparazione ? "aereo in riparazione⚠️" : ""}}</p>
        <p>{{aereo.maxVelocita}} km/h</p>
        <p>{{aereo.lastCheckYear}}</p>
        <button @click="emit('delete', aereo)">elimina aereo</button>
    </div>
</template>

<style>
.card{
    width: fit-content;
    padding: 1em;
    border: 1px solid lightgray;
}
.card *{
    margin: 0;
    padding: 0;
}
</style>