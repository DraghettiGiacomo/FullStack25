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
        <div>
            <label for="filtroCapacita">Capacità:</label>
            <input id="filtroCapacita" min="0" type="number">
        </div>
        <div>
            <label for="filtroAutonomia">Autonomia:</label>
            <input id="filtroAutonomia" min="0" type="number">
        </div>
        <div>
            <label for="filtroStatoManutenzione">Stato manutenzione:</label>
            <select id="filtroStatoManutenzione" name="scelta">
                <option value="false">false</option>
                <option value="true">true</option>
            </select>
        </div>
        <button @click="applicaFiltri">Applica filtri</button>
    </div>
    <hr>
    <div class="ordinamentoPlane">
        <h3>oridnamento lista aerei</h3>
        <div>
            <label for="ordinamento">Ordina lista:</label>
            <select id="ordinamento" name="scelta">
                <option value="false">anno</option>
                <option value="true">velocità</option>
                <option value="true">autonomia</option>
            </select>
        </div>
        <div>
            <label for="ordinamento">Ordinamento:</label>
            <select id="ordinamento" name="scelta">
                <option value="false">crescente</option>
                <option value="true">decrescente</option>
            </select>
        </div>
        <button>Ordina</button>
    </div>
    <hr>
    <div class="listAerei">
        <PlaneCard v-for="_ in aerei" :aereo="_" @delete="handleDelete"/>
    </div>
</template>

<style>
.listAerei, .filtri, .ordinamentoPlane{
    display: flex;
    gap: 1.2em;
    flex-wrap: wrap;
}
.filtri h3,
.ordinamentoPlane h3{
    margin: 0;
    padding: 0;
}
</style>