import ProfileComponent from '@/components/ProfileComponent.vue'
import AboutUsView from '@/view/AboutUsView.vue'
import HomeView from '@/view/HomeView.vue'
import UserDetailsView from '@/view/UserDetailsView.vue'
import UsersView from '@/view/UsersView.vue'
import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path:'/home',
      component: HomeView
    },
    {
      path:'/about-us',
      component: AboutUsView
    },
    {
      path:'/users',
      component: UsersView
    },
    {
      path:'/users/:id',
      name: 'user-details',
      component: UserDetailsView
    },
    {
      path:'/profile',
      component: ProfileComponent
    }
  ],
})

export default router