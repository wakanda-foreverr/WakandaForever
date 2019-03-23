<template>
    <div>
        <div class="limiter">
            <div class="container-login100">
                <div class="wrap-login100">
                    <form v-on:submit.prevent="loginUser" class="login100-form validate-form p-l-55 p-r-55 p-t-178">
					<span class="login100-form-title">
						Sign in
					</span>

                        <div class="wrap-input100 validate-input m-b-16" data-validate="Please enter username">
                            <input v-model="username" class="input100" type="text" name="username" placeholder="Username">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="wrap-input100 validate-input" data-validate = "Please enter password">
                            <input v-model="password" class="input100" type="password" name="pass" placeholder="Password">
                            <span class="focus-input100"></span>
                        </div>

                        <br/>

                        <div class="container-login100-form-btn">
                            <button class="login100-form-btn">
                                Sign in
                            </button>
                        </div>

                        <br/>

                    </form>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import userService from "../serivces/UserService";

    export default {
        name: "Login.vue",
        data() {
            return {
                username: '',
                password: ''
            }
        },
        methods: {
            loginUser(){
                let user = {
                    username: this.username,
                    password: this.password
                }
                userService.loginUser(user);
            }
        }
    }
</script>

<style scoped>

</style>