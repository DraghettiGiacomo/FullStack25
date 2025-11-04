<script setup lang="ts">
import type { User } from '@/data/users';
import { useRouter } from 'vue-router';

defineProps<{
    users: User[];
}>();
const router = useRouter();
function navigateToUser(userId: number){
    //router.push(`users/${userId}`)
    router.push({
        name: 'user-details',
        params: {
            id: userId
        }
    })
}
</script>

<template>
    <ul>
        <li v-for="user in users" @click="navigateToUser(user.id)">
            <span>{{ user.name }}</span><br>
            <span>{{ user.username }}</span>
        </li>
    </ul>
</template>

<style>
li{
    cursor: pointer;
}
</style>