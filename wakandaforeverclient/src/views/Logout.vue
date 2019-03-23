<template>
    <div> </div>
</template>

<script>
    import userService from "../serivces/UserService";

    export default {
        name: "Logout",
        mounted() {
            userService.logoutUser();
        }
    }
</script>

<style scoped>

</style>