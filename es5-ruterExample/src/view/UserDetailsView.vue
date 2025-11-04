<script setup lang="ts">
import UserDetails from '@/components/users/UserDetails.vue';
import { fetchUserById } from '@/data/users';
import { computed, onMounted } from 'vue';
import { useRoute } from 'vue-router';

const route = useRoute();
const user = computed(() => {
    const userId = parseInt(route.params.id as string)
    if(isNaN(userId)){
        return undefined
    }
    return fetchUserById(userId)
})
</script>

<template>
    <UserDetails v-if="user" :user="user"/>
    <div v-else>
        <h2>Utente non trovato</h2>
        <p>Non è stato possibile trovare un utente con l'ID: {{ route.params.id }}</p>
        <router-link to="/users">Torna alla lista</router-link>
    </div>
</template>