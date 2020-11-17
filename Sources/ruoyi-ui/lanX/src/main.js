import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import './assets/scss/reset.scss'
import Vant from 'vant';
import 'vant/lib/index.css';
import $ from 'jquery'
import http from './api/config'
import './mock'

Vue.use(Vant)

Vue.config.productionTip = false
Vue.prototype.$ = $
Vue.prototype.http = http


new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
