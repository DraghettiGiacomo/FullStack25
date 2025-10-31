<script setup lang="ts">
import ShipCard from './ShipCard.vue';
import { ref } from 'vue';
const contatore = ref(0)

let id = 0;
let removedIds: number[] = [];
interface Ship {
  id: number;
  nome: string;
  tipo: string;
  anno: number;
  stazza: number;
  stato: string;
}
const nomeShip = ref('')
const tipoShip = ref('')
const annoShip = ref(0)
const stazzaShip = ref(0)
const statoShip = ref('')
const ships = ref<Ship[]>([]);
const shipsInServizio = ref<Ship[]>([]);
const shipsFiltrate = ref<Ship[]>([]);
function addShip() {
  let newId = removedIds.pop();
  if (newId != 0 && !newId) {
    newId = id++;
  }
  ships.value.push({
    id: newId,
    nome: nomeShip.value,
    tipo: tipoShip.value,
    anno: annoShip.value,
    stazza: stazzaShip.value,
    stato: statoShip.value
  })
  if (statoShip.value === "In servizio") {
    shipsInServizio.value.push({
        id: newId,
        nome: nomeShip.value,
        tipo: tipoShip.value,
        anno: annoShip.value,
        stazza: stazzaShip.value,
        stato: statoShip.value
    })
  }
  nomeShip.value = '';
  tipoShip.value = '';
  annoShip.value = 0;
  stazzaShip.value = 0;
  statoShip.value = '';
}

function handledelete(id: number){
    ships.value = ships.value.filter((el) => el.id !== id);
}
</script>

<template>
  <form @submit.prevent="addShip">
    <label for="nome">Nome:</label>
    <input v-model ="nomeShip" id="nome" type="text">
    <label for="annocostruzione">Anno costruzione:</label>
    <input v-model ="annoShip" id="annocostruzione" type="number">
    <label for="stazza">Stazza:</label>
    <input v-model ="stazzaShip" id="stazza" type="number">
    <label for="tipo">Tipo:</label>
    <select v-model ="tipoShip" id="tipo" name="scelta">
        <option value="Crociera">Crociera</option>
        <option value="Peschereccio">Peschereccio</option>
        <option value="Militare">Militare</option>
        <option value="Cargo">Cargo</option>
    </select>
    <label for="stato">Stato:</label>
    <select v-model ="statoShip" id="stato" name="scelta">
        <option value="In servizio">In servizio</option>
        <option value="In manutenzione">In manutenzione</option>
        <option value="Fuori uso">Fuori uso</option>
    </select>
    <button type="submit">aggiungi nave</button>
  </form>
  <hr>
  <p>Tot navi: {{ships.length}}</p>
  <p>Navi in servizio: {{shipsInServizio.length}}</p>
  <hr>
  <div class="filtri">
      <div>
          <h4>Filtri per tipo</h4>
          <input type="checkbox" id="vehicle1" name="vehicle1" value="Bike">
          <label for="vehicle1"> I have a bike</label><br>
          <input type="checkbox" id="vehicle2" name="vehicle2" value="Car">
          <label for="vehicle2"> I have a car</label><br>
          <input type="checkbox" id="vehicle3" name="vehicle3" value="Boat">
          <label for="vehicle3"> I have a boat</label><br>
      </div>
      <div>
          <h4>Filtri per stato</h4>
          <input type="checkbox" id="vehicle1" name="vehicle1" value="Bike">
          <label for="vehicle1"> I have a bike</label><br>
          <input type="checkbox" id="vehicle2" name="vehicle2" value="Car">
          <label for="vehicle2"> I have a car</label><br>
          <input type="checkbox" id="vehicle3" name="vehicle3" value="Boat">
          <label for="vehicle3"> I have a boat</label><br>
      </div>
  </div>
  <hr>
  <div class="listShip">
      <ShipCard  v-for="_ in ships"
      :id="_.id"
      :nome-card="_.nome"
      :anno-card="_.anno"
      :stato-card="_.stato"
      :tipo-card="_.tipo"
      :stazza-card="_.stazza"
      @delete="handledelete"
      />
  </div>
</template>

<style>
.listShip, .filtri{
    display: flex;
    gap: 1.2em;
    flex-wrap: wrap;
}
.filtri *{
    padding: 0;
    margin: 0;
}
</style>