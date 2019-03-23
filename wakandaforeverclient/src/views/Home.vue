<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png" />
    <HelloWorld msg="Welcome to Your Vue.js App" />
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from "@/components/HelloWorld.vue";
import cookie from 'vue-cookie';

export default {
  name: "home",
  components: {
    HelloWorld
  },
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
