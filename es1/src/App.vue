<script setup lang="ts">
import {reactive, ref} from 'vue'
interface Todo {
  id: number,
  todo: string,
  modify: boolean
}
const arr = ref<Todo[]>([])
const vInput = ref("")
const vModify = ref()
let contatore = 0
const idEliminati = ref<number[]>([])
function add(){
  let idToAssign = 0
  if(idEliminati.value.length > 0){
    idToAssign = idEliminati.value[0]
    idEliminati.value.shift()
  } else {
    idToAssign = contatore
    contatore++
  }
  let oggett: Todo = {
    id: idToAssign,
    todo: vInput.value,
    modify: false
  }
  arr.value.push(oggett)
  vInput.value = ""
}
function remove(e: Todo){
  arr.value = arr.value.filter(obj => obj.id !== e.id)
  idEliminati.value.push(e.id);
  idEliminati.value.sort();
}
</script>

<template>
  <h1>ESERCIZIO TODOL LIST</h1>
  <input type="text"
  placeholder="new todo"
  v-model="vInput"
  />
  <button @click="add">add todo</button>
  <ul>
    <li v-for="e in arr" :key="e.id" :class="e.id % 2 === 0 ? 'barrato' : 'sottolineato'">
      <p v-if="!e.modify">{{ e.id }} - {{ e.todo }}</p>
      <input v-else v-model="e.todo" />
      <button @click="() => {e.modify = !e.modify}">{{ e.modify ? "salva" : "modifica"}}</button>
      <button v-if="!e.modify" @click="() => remove(e)">X</button>
    </li>
  </ul>
</template>

<style scoped>
li{
  display: flex;
  gap: 2em;
}
li *{
  margin: 0;
  padding: 0;
}
.barrato{text-decoration: line-through; color: blue;}
.sottolineato{text-decoration: underline; color: green;}
</style>
