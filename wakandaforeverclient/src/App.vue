<template>
    <div id="app">
        <div id="nav">
            <a class="navbar-brand" href="index.html">Demeter API</a>
            <router-link v-if="!loggedIn" id="home" to="/">Home |</router-link>
            <router-link v-if="loggedIn" id="dashboard" to="/dashboard">Dashboard |</router-link>
            <router-link id="docs" to="/docs">Documentaion |</router-link>
            <router-link v-if="loggedIn" id="logout" to="/logout">Logout</router-link>
            <router-link v-if="!loggedIn" id="signin" to="/signin">Sign in |</router-link>
            <router-link v-if="!loggedIn" id="signup" to="/signup">Sign up</router-link>
        </div>
        <router-view/>
    </div>
</template>

<script>
    import cookie from "vue-cookie";

    export default {
        data() {
            return {
                loggedIn: false
            }
        },
        mounted() {
            if (cookie.get("token")) {
                this.loggedIn = true;

            } else {
                this.loggedIn = false;
            }

        }
    }
</script>

<!--<script src="./assets/vendor/jquery/jquery-3.3.1.min.js" />-->
<!-- bootstap bundle js -->
<!--<script src="./assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>-->
<!-- slimscroll js -->
<!--<script src="./assets/vendor/slimscroll/jquery.slimscroll.js"></script>-->
<!-- main js -->
<!--<script src="./assets/libs/js/main-js.js"></script>-->
<!-- chart chartist js -->
<!--<script src="./assets/vendor/charts/chartist-bundle/chartist.min.js"></script>-->
<!-- sparkline js -->
<!--<script src="./assets/vendor/charts/sparkline/jquery.sparkline.js"></script>-->
<!-- morris js -->
<!--<script src="./assets/vendor/charts/morris-bundle/raphael.min.js"></script>-->
<!--<script src="./assets/vendor/charts/morris-bundle/morris.js"></script>-->
<!-- chart c3 js -->
<!--<script src="./assets/vendor/charts/c3charts/c3.min.js"></script>-->
<!--<script src="./assets/vendor/charts/c3charts/d3-5.4.0.min.js"></script>-->
<!--<script src="./assets/vendor/charts/c3charts/C3chartjs.js"></script>-->
<!--<script src="./assets/libs/js/dashboard-ecommerce.js"></script>-->

<!--===================================================-->

<style src="./assets/css/main.css"/>
<style src="./assets/css/util.css"/>
<style src="./assets/vendor/bootstrap/css/bootstrap.min.css"/>
<style src="./assets/vendor/fonts/circular-std/style.css"/>

<style src="./assets/libs/css/style.css"/>
<!--<style src="./assets/vendor/fonts/fontawesome/css/fontawesome-all.css" />-->
<style src="./assets/vendor/charts/chartist-bundle/chartist.css"/>
<style src="./assets/vendor/charts/morris-bundle/morris.css"/>
<!--<style rel="stylesheet" href="/src/assets/vendor/fonts/material-design-iconic-font/css/materialdesignicons.min.css">-->
<style src="./assets/vendor/charts/c3charts/c3.css"/>
<!--<style rel="stylesheet" href="/src/assets/vendor/fonts/flag-icon-css/flag-icon.min.css">-->


<style>
    #app {
        font-family: "Avenir", Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #002b80;
    }

    #nav {
        padding: 30px;
    }

    a {
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
