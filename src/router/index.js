import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        component: () => import('../components/common/Main.vue'),
        children: [
            {
                path: '/',
                name: 'home',
                component: ()=>import('../views/home/Home.vue')
            },
            {
                path: '/rank',
                name: 'rank',
                component: ()=>import('../views/rank/Rank.vue')
            },
            {
                path: '/news',
                name: 'news',
                component: ()=>import('../views/news/News.vue')
            },
            {
                path: '/find',
                name: 'find',
                component: ()=>import('../views/find/Find.vue')
            },
            {
                path: '/viedo',
                name: 'viedo',
                component: ()=>import('../views/viedo/Viedo.vue')
            }
        ]
    },
    {
        path: '/news/more',
        component: ()=>import('../views/news/More.vue')
    },
    {
        path: '/find/more',
        component: ()=>import('../views/find/More.vue')
    }
]

const router = new VueRouter({
    routes,
    mode: 'history'
})

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
    return originalPush.call(this, location).catch(err => err)
}
export default router
