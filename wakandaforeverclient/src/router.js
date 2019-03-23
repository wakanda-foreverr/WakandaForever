import Vue from "vue";
import Router from "vue-router";
import Home from "./views/Home.vue";

Vue.use(Router);

export default new Router({
  mode: "history",
  base: process.env.BASE_URL,
  routes: [
    {
      path: "/",
      name: "home",
      component: Home
    },
    {
      path: "/signin",
      name: "signin",
      component: () => import("./views/Login.vue")
    },
    {
      path: "/signup",
      name: "signup",
      component: () => import("./views/Register.vue")
    },
    {
      path: "/logout",
      name: "logout",
      component: () => import("./views/Logout.vue")
    },
    {
      path: "/dashboard",
      name: "dashboard",
      component: () => import("./views/UserDashBoard.vue")
    }
  ]
});
