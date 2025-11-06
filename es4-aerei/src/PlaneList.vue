<script setup lang="ts">
import { ref } from 'vue';
import type { Aereo } from './interface';
import PlaneCard from './PlaneCard.vue';
const tipiAereo = ["Passeggieri", "Cargo", "Militare", "Privato"]
const props = defineProps<{
    aerei: Aereo[]
}>();

const emit = defineEmits(['delete']); 

const filtroTipo = ref<"Passeggieri"| "Cargo"| "Militare"| "Privato">()
const filtroModello = ref('')
function handleDelete(aereo: Aereo) {
    emit('delete', aereo);
}
const aereiDaMostrare = ref(props.aerei); 
function applicaFiltri(){
    console.log(filtroTipo.value);
    console.log(filtroModello.value);
    /* aereiDaMostrare.value = props.aerei.filter((aereo) => {
        const matchTipo = filtroTipo.value ? aereo.tipo === filtroTipo.value : true;
        const matchModello = filtroModello.value ? aereo.modello.toLowerCase().includes(filtroModello.value.toLowerCase()) : true;
        return matchTipo && matchModello;
    }); */
}
</script>
<template>
    <div class="filtri">
        <h3>filtri</h3>
        <div>
            <label for="tipo">Tipo:</label>
            <select v-model ="filtroTipo" id="tipo" name="scelta">
                <option v-for="tipo in tipiAereo" :value="tipo">{{ tipo }}</option>
            </select>
        </div>
        <div>
            <label for="filtroModel">Modello:</label>
            <input v-model="filtroModello" id="filtroModel" type="text">
        </div>
        <button @click="applicaFiltri">Applica filtri</button>
    </div>
    <hr>
    <div class="listAerei">
        <PlaneCard v-for="_ in aerei" :aereo="_" @delete="handleDelete"/>
    </div>
</template>

<style>
.listAerei, .filtri{
    display: flex;
    gap: 1.2em;
    flex-wrap: wrap;
}
.filtri h3{
    margin: 0;
    padding: 0;
}
</style>