<script lang="ts" setup>
const props = defineProps<{
    msg: string,
    num: number
}>();
</script>

<template>
    <div class="box">
        <p>{{msg || 'non è presente il messaggio'}}</p>
        <p>contatore: {{ num }}</p>
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