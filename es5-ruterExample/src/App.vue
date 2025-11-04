<script setup lang="ts">
import Header from './components/Header.vue';

</script>

<template>
  <main>
    <Header></Header>
    <main>
      <h1>H1 dentro App.vue</h1>
      <router-view />
    </main>
  </main>
</template>
