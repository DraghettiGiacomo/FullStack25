<script setup lang="ts"></script>

<template>
  <main>
    <nav>
      <router-link to="/">first</router-link><br>
      <router-link to="/home">home</router-link><br>
      <router-link to="/profile">profile</router-link>
    </nav>
    <h1>H1 dentro App.vue</h1>
    <router-view />
  </main>
</template>

<style>
.router-link-active {
  color: rgb(94, 0, 182);
  font-weight: bold;
}
</style>
