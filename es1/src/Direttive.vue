<script setup lang="ts">
import {reactive, ref} from 'vue'
const titleClass = ref("red")
const disableInput =  ref(true)
const typeInput = ref("number")
const boolean = ref(true)
const spara = () => {alert("BANG!!!")}
const cambiaClass = () => {
  titleClass.value === "red" ? titleClass.value = "green" : titleClass.value = "red"
}
const textModel  = ref("")
const checkboxModel  = ref(false)
const arr = ref<String[]>(["pippo", "pluto", "paperino", "topolino", "minnie", "clarabella", "basettoni", "eta beta"])
const arr2 = ref([
  {
    nome: "pippo",
    id: 1,
    cognome: "topolino"
  },
  {
    nome: "pluto",
    id: 2,
    cognome: "topolino"
  },
  {
    nome: "paperino",
    id: 3,
    cognome: "paperino"
  },
  {
    nome: "topolino",
    id: 4,
    cognome: "topolino"
  },
  {
    nome: "minnie",
    id: 5,
    cognome: "topolino"
  },
  {
    nome: "clarabella",
    id: 6,
    cognome: "topolino"
  },
  {
    nome: "basettoni",
    id: 7,
    cognome: "topolino"
  },
  {
    nome: "eta beta",
    id: 8,
    cognome: "topolino"
  },
  {
    nome: "paperina",
    id: 9,
    cognome: "paperino"
  }
])
</script>

<!-- DIRETTIVE -->
<!-- v-bind -> : BINDA GLIA TTRIBUTI HTML PER RENDERLI DINAMICI - per abbreviare lo si può scrivere anche con i due punti -->
<!-- v-on -> @ CATTURA EVENTI - per abbreviare lo si può scrivere anche con la chiocciola -->
<!-- v-if CONDIZIONE DA METTERE NELI TAG HTML -->
<!-- v-else-if -->
<!-- v-else -->
<!-- v-show MOSTRA O NASCONDE I TAG HTML -->
<!-- V-SHOE E V-IF SONO DIFFERRENTI NEL MOSTRARE I TAG NEL FRONTEND V-IF NON LI MOSTRA V-SHOW LI MOSTRA MA CON DISPLAY:NONE -->
<!-- v-model ABBREVIAZIONE DELL'UNIONE DEL v-bind E v-on PER LEGGERE I VALORI DEI CAMPI INPUT -->
<!-- v-for FA DEI CICLI -->


<template>
  <h1>DIRETTIVE</h1>
  <h2>v-bind(:) v-on(@)</h2>
  <h3 :class="titleClass">make me red</h3>
  <button @click="cambiaClass">cliccami per cambiare colore</button>
  <h3 class="blue">make me red</h3>
  <label>Inserisci quello che vuoi: <input :type="typeInput" :disabled="disableInput" /></label>
  <hr>
  <h2>v-on</h2>
  <button @click="spara">spara</button>
  <hr>
  <h2>v-if v-else-if v-else v-show</h2>
  <p v-if="boolean">Il booleano è true</p>
  <p v-show="boolean">Il booleano è true</p>
  <hr>
  <h2>v-model</h2>
  <input v-model="textModel" placeholder="Type here"/>
  <p>testo del textmodel: {{ textModel }}</p>
  <input type="checkbox" v-model="checkboxModel" />
  <p>{{ checkboxModel ? "Selezionato" : "Non selezionato" }}</p>
  <hr>
  <h2>v-for</h2>
  <ul>
    <h3>v-for arrey di stringhe</h3>
    <li v-for="e in arr">{{ e }}</li>
  </ul>
  <ul>
    <h3>v-for arrey di oggetti</h3>
    <li v-for="e in arr2">
      <h4>{{ e.nome }}</h4>
      <p>{{ e.id }}</p>
      <p>{{ e.cognome }}</p>
    </li>
  </ul>
</template>

<style scoped>
.blue{
  color: blue;
}
.red{
  color: red;
}
.green{
  color: green;
}
</style>
