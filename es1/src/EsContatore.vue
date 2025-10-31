<script setup lang="ts">
import {reactive, ref} from 'vue'
const contatore = ref(0)
const colorClass = ref("blu")

function checkContatore(){
  if (contatore.value > 0) {
    colorClass.value = "green"
  } else if (contatore.value === 0) {
    colorClass.value = "blu"
  } else {
    colorClass.value = "red"
  }
}
function decrement(){
  contatore.value--
  checkContatore()
}
function increment(){
  contatore.value++
  checkContatore()
}
</script>

<template>
  <h1>Esercizio contatore</h1>
  <button @click="decrement">-</button>
  <span> Contatore:  <span :class="colorClass">{{ contatore }}</span></span>
  <button @click="increment">+</button>
  <p v-if="contatore > 10">Hai superato il limite</p>
  <p v-else-if="contatore < 0">Negativo</p>
  <p v-else>Sei dentro il limite</p>
</template>

<style scoped>
.blu{
  color: blue;
}
.red{
  color: red;
}
.green{
  color: green;
}
</style>
