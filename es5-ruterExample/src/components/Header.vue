<template>
    <header>
        <nav>
            <router-link to="/home">home</router-link><br>
            <router-link to="/profile">profile</router-link><br>
            <router-link to="/users">users</router-link>
        </nav>
    </header>
</template>

<style>
.router-link-active {
  color: rgb(94, 0, 182);
  font-weight: bold;
}
</style>