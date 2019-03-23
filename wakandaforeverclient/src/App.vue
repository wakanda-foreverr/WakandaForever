<template>
  <div id="app">
    <div id="nav">
      <router-link id="home" to="/">Home</router-link> |
      <router-link class="hidden" id="signin" to="/signin">Sign in</router-link> |
      <router-link class="hidden" id="signup" to="/signup">Sign up</router-link> |
      <router-link class="hidden" id="logout" to="/logout">Logout</router-link>
    </div>
    <router-view />
  </div>
</template>

<script>
  import cookie from "vue-cookie";

  export default {
    mounted() {
      let signInLink = document.getElementById("signin");
      let signUpLInk = document.getElementById("signup");
      let logoutLink = document.getElementById("logout");

      if(cookie.get("token")){
        logoutLink.classList.remove("hidden");
      }
      else{
        signUpLInk.classList.remove("hidden");
        signInLink.classList.remove("hidden");
      }

    }
  }
</script>

<style src="./assets/css/main.css"/>
<style src="./assets/css/util.css"/>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}

.hidden {
    visibility: hidden;
}
</style>