<script setup lang="ts">
import type { User } from '@/data/users';

defineProps<{
    user: User
}>()
</script>

<template>
    <div class="carUser">
        <p>{{ user.name }}</p>
        <p>{{ user.username }}</p>
        <p>{{ user.email }}</p>
        <p>{{ user.address.street }}, {{ user.address.city }}, {{ user.address.zipcode }}</p>
        <p>{{ user.website }}</p>
        <router-link class="buttonBack" to="/users">Torna agli utenti</router-link>
    </div>
</template>

<style>
p{
    margin: 0;
    padding: 0;
}
.carUser{
    border: 1px solid rgb(102, 0, 102);
    padding: 1em;
    border-radius: 1em;
    width: fit-content;
    display: flex;
    flex-direction: column;
    gap: 0.6em;
}
.buttonBack{
    border: 1px solid rgb(102, 0, 102);
    background-color: rgba(128, 0, 128, 0.4);
    padding: 0.5em 1em;
    color: purple;
    text-decoration: none;
    text-align: center;
    border-radius: 0.5em;
}
</style>