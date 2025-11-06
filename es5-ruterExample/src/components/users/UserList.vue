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
            <span><b>{{ user.name }}</b></span><br>
            <span>{{ user.username }}</span>
        </li>
    </ul>
</template>

<style>
ul{
    margin: 0;
    padding: 0;
}
li{
    list-style: none;
    cursor: pointer;
    margin-bottom: 1em;
    padding: 1em;
    border: 1px solid gray;
    border-radius: 1em;
}
li:hover{
    border: 1px solid greenyellow;
}
li span:last-child{
    color: gray;
}
</style>