import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";

Vue.config.productionTip = false;

var VueCookie = require('vue-cookie');
Vue.use(VueCookie);

window.$ = require('jquery')
window.JQuery = require('jquery')

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount("#app");
