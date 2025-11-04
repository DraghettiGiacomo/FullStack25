<script setup lang="ts">
import UserList from '@/components/users/UserList.vue';
import { fetchAllUser, type User } from '@/data/users';
import { onMounted, ref } from 'vue';

const allUsers = ref<User[]>([])

onMounted(() => {
    allUsers.value = fetchAllUser();
})
</script>

<template>
    <p>sono la view user</p>
    <UserList :users="allUsers"/>
</template>