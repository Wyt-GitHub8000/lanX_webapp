import Vue from 'vue'
import Vuex from 'vuex'
import playerMessage from './player-store'

Vue.use(Vuex)

export default new Vuex.Store({
  modules: {
      playerMessage
  }
})
