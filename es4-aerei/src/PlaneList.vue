<script setup lang="ts">
import { ref } from 'vue';
import type { Aereo } from './interface';
import PlaneCard from './PlaneCard.vue';
const tipiAereo = ["Passeggieri", "Cargo", "Militare", "Privato"]
const filtroTipo = ref<"Passeggieri"| "Cargo"| "Militare"| "Privato">()
const props = defineProps<{
    aerei: Aereo[]
}>();

const emit = defineEmits(['delete']); 
function handleDelete(aereo: Aereo) {
    emit('delete', aereo);
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
            <input id="filtroModel" type="text">
        </div>
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
}
.filtri h3{
    margin: 0;
    padding: 0;
}
</style>