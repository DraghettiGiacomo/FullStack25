<script setup lang="ts">
import type { User } from '@/data/users';

defineProps<{
    user: User
}>()
</script>

<template>
    <p>{{ user.name }}</p>
</template>