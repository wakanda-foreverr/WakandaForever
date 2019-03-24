<template>
  <div class="dashboard-main-wrapper">
    <img width="100%" height="100%" alt="Vue logo" src="../assets/background.jpg" />
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
