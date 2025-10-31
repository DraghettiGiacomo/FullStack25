<script setup lang="ts">
import {reactive, ref} from 'vue'

  let testo: string = "esempio rendering dichiarativo"
  function cambiaTesto(){
    console.log(testo);
    testo = "nuovo testo"
    console.log(testo);
  }
  
  const testoRef = ref("testo con ref");
  function cambiaTestoRef(){
    console.log(testoRef.value);
    testoRef.value = "nuovo testo"
    console.log(testoRef.value);
  }

  const testoReactive = reactive({ 
    text: "testo con reactive"
  });
  function cambiaTestoReactive(){
    console.log(testoReactive.text);
    testoReactive.text = "nuovo testo"
    console.log(testoReactive.text);
  }

  const testoEsercizio = ref("testo esercizio")
  function cambiaTestoEsercizio(){
    console.log(testoEsercizio.value);
    testoEsercizio.value = testoEsercizio.value.split('').reverse().join('');
    console.log(testoEsercizio.value);
  }

</script>

<template>
  <h1>declerative rendering</h1>
  <div>
    <p>esempio rendering dichiarativo: <span>{{ testo }}</span></p>
    <button @click="cambiaTesto()">cliccami</button>
    <hr>
    <p>esempio rendering dichiarativo con l'utilizzo di ref: <span>{{ testoRef }}</span></p>
    <button @click="cambiaTestoRef()">cliccami</button>
    <hr>
    <p>esempio rendering dichiarativo con l'utilizzo di reactive: <span>{{ testoReactive.text }}</span></p>
    <button @click="cambiaTestoReactive()">cliccami</button>
    <hr>
    <p>{{ testoEsercizio }}</p>
    <button @click="cambiaTestoEsercizio()">cliccami</button>
    <p>{{ testoEsercizio.split('').reverse().join('').toUpperCase() }}</p>
  </div>
</template>

<style scoped>
span{
  color: red;
}
</style>
