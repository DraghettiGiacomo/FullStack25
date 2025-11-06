<script setup lang="ts">
import { computed, ref } from 'vue';
import type { Aereo } from './interface';
import PlaneList from './PlaneList.vue';

const tipiAereo = ["Passeggieri", "Cargo", "Militare", "Privato"]
let id = 0;
let removedIds: number[] = [];
const modelloAereo = ref('')
const compagniaAereo = ref('')
const annoAereo = ref(0)
const tipoAereo = ref<"Passeggieri" | "Cargo" | "Militare" | "Privato">('Cargo')
const capacitaPasseggeriAereo = ref(0)
const autonomiaVoloAereo = ref(0)
const statoRiparazioneAereo = ref(false)
const maxVelocitaAereo = ref(0)
const lastCheckYearAereo = ref(0)
const planes = ref<Aereo[]>([]);
function addPlane() {
  let newId = removedIds.pop();
  if (newId != 0 && !newId) {
    newId = id++;
  }
  planes.value.push({
    id: newId,
    modello: modelloAereo.value,
    compagnia: compagniaAereo.value,
    anno: annoAereo.value,
    tipo: tipoAereo.value,
    capacitaPasseggeri : capacitaPasseggeriAereo.value,
    autonomiaVolo : autonomiaVoloAereo.value,
    statoRiparazione : statoRiparazioneAereo.value,
    maxVelocita : maxVelocitaAereo.value,
    lastCheckYear : lastCheckYearAereo.value,
  })
  resetForm();
}
function resetForm(){
  modelloAereo.value = ''
  compagniaAereo.value = ''
  annoAereo.value = 0
  tipoAereo.value = 'Cargo'
  capacitaPasseggeriAereo.value = 0
  autonomiaVoloAereo.value = 0
  statoRiparazioneAereo.value = false
  maxVelocitaAereo.value = 0
  lastCheckYearAereo.value = 0
}
const percAereiMilitari = computed(() => {
  const militari = planes.value.filter((aereo) => aereo.tipo === "Militare");
  return planes.value.length ? (militari.length / planes.value.length) * 100 : 0;
});
const mediaAutonomia = computed(() => {
  const total = planes.value.reduce((acc, aereo) => acc + aereo.autonomiaVolo, 0);
  return planes.value.length ? total / planes.value.length : 0;
});
const mediaCapacitaPasseggeri = computed(() => {
  const total = planes.value.reduce((acc, aereo) => acc + aereo.capacitaPasseggeri, 0);
  return planes.value.length ? total / planes.value.length : 0;
});
function handleDelete(aereo: Aereo){
    planes.value = planes.value.filter((el) => el.id !== aereo.id);
}
</script>

<template>
  <div class="formERiassunto">
    <form @submit.prevent="addPlane" class="form">
      <label for="modello">
        Modello:
        <input v-model ="modelloAereo" id="modello" type="text">
      </label>
      <label for="compagnia">
        compagnia:
        <input v-model ="compagniaAereo" id="compagnia" type="text">
      </label>
      <label for="annocostruzione">
        Anno costruzione:
        <input v-model ="annoAereo" id="annocostruzione" min="0" type="number">
      </label>
      <label for="tipo">
        Tipo:
        <select v-model ="tipoAereo" id="tipo" name="scelta">
            <option v-for="tipo in tipiAereo" :value="tipo">{{ tipo }}</option>
        </select>
      </label>
      <label for="capacitaPasseggeriAereo">
        capacità aereo:
        <input v-model ="capacitaPasseggeriAereo" id="capacitaPasseggeriAereo" min="0" type="number">
      </label>
      <label for="autonomiaAereo">
        autonomia aereo:
        <input v-model ="autonomiaVoloAereo" id="autonomiaAereo" min="0" type="number">
      </label>
      <label for="statoRiparazioneAereo"> 
        <input v-model="statoRiparazioneAereo" type="checkbox" id="statoRiparazioneAereo" name="statoRiparazioneAereo" value="true">
        Aereo in riparazione
      </label>
      <label for="maxVelocitaAereo">
        velocità massima aereo:
        <input v-model ="maxVelocitaAereo" id="maxVelocitaAereo" min="0" type="number">
      </label>
      <label for="lastCheckYearAereo">
        anno dell'ultimo controllo dell'aereo:
        <input v-model ="lastCheckYearAereo" id="lastCheckYearAereo" min="0" type="number">
      </label>
      <button type="submit">aggiungi aereo</button>
    </form>
    <hr>
    <div>
      <p>Tot aerei: {{planes.length}}</p>
      <p>% aerei militari: {{ percAereiMilitari }}%</p>
      <p>media autonomia: {{ mediaAutonomia }}</p>
      <p>media capacità passegieri: {{ mediaCapacitaPasseggeri }}</p>
    </div>
  </div>
  <hr>
  <PlaneList :aerei="planes" @delete="handleDelete"/>
</template>

<style>
.formERiassunto{
  display: flex;
  gap: 1em;
}
.formERiassunto div{
  flex-grow: 1;
}
.form{
  width: fit-content;
  display: flex;
  flex-direction: column;
  gap: 0.4em;
}
</style>
