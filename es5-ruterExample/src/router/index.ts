import FirstComponent from '@/components/FirstComponent.vue'
import HomeComponent from '@/components/HomeComponent.vue'
import ProfileComponent from '@/components/ProfileComponent.vue'
import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path:'/',
      component: FirstComponent
    },
    {
      path:'/home',
      component: HomeComponent
    },
    {
      path:'/profile',
      component: ProfileComponent
    }
  ],
})

export default router
