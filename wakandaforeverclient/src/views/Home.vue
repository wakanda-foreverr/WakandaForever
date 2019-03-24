<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png" />
    <HelloWorld msg="Welcome to Your Vue.js App" />
  </div>
</template>

<script>
// @ is an alias to /src
import cookie from 'vue-cookie';

export default {
  name: "home",
  methods: {
    onLoad(){
      if(cookie.get("token")){
          this.$router.push('/dashboard');
      }
    }
  },
  mounted() {
    this.onLoad()
  }
};
</script>
