<script lang="ts" setup>
import { ref } from 'vue';
const props = defineProps<{
    id: number
}>();
const emit = defineEmits(['increment'])
const contatore = ref(0)
function handleincrement(){
  contatore.value++
  emit('increment', contatore.value, props.id)
}
</script>

<template>
<div class="box">
        <button @click="handleincrement">Incrementa</button> 
        <span>{{ contatore }}</span>
    </div>
</template>

<style>
.box{
    padding: 10px;
    border: 1px solid #ccc;
    margin-bottom: 8px;
    border-radius: 6px;
}
</style>