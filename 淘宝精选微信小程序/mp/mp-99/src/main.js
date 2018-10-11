import Vue from 'vue'
import App from './App'
import Http from './utils/http'

Vue.config.productionTip = false
App.mpType = 'app'

Vue.prototype.$http = Http

const app = new Vue(App)
app.$mount()
