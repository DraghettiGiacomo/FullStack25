<script setup lang="ts">
import HelloBox from '@/components/HelloBox.vue';
import {ref} from 'vue'
import CounterButton from './components/CounterButton.vue';
import CardBox from './components/CardBox.vue';
const contatore = ref(0)

function decrement(){
  contatore.value--
}
function increment(){
  contatore.value++
}
function handleincrement(){

}
const count = ref(0)
</script>

<template>
  <!-- <h2>Introduzione componenti</h2>
  <div>
  <button :disabled="contatore === 0" @click="decrement">-</button>
  <span> Contatore: {{ contatore }}</span>
  <button @click="increment">+</button>
  </div> -->
  
  <!-- il mio primo componente -->
  <!-- <HelloBox v-for="_ in contatore" 
  :msg="'Sono il componente #' + _.toString()"
  :num="contatore"
  /> -->
  <!-- il mio componente counter -->
  <!-- <CounterButton v-for="_ in contatore" 
  :id="_"
  @increment="handleincrement"/> -->
  <!-- il mio componente slot -->
  <button @click="count--">-</button>
  <span> Contatore: {{ count }}</span>
  <button @click="count++">+</button>
  <CardBox v-for="_ in count">
    <p>prova slot</p>
  </CardBox>
</template>

<style scoped></style>
