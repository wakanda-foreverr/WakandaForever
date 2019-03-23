<template>
    <div>
        <div class="limiter">
            <div class="container-login100">
                <div class="wrap-login100">
                    <form v-on:submit.prevent="registerUser" class="login100-form validate-form p-l-55 p-r-55 p-t-178">
					<span class="login100-form-title">
						Register
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

                        <div class="wrap-input100 validate-input" data-validate = "Please confirm password">
                            <input class="input100" type="password" name="passconfirm" placeholder="Confirm Password">
                            <span class="focus-input100"></span>
                        </div>

                        <br/>

                        <div class="container-login100-form-btn">
                            <button type="submit" class="login100-form-btn">
                                Register
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
    export default {
        name: "Register.vue",
        data() {
            return {
                username: '',
                password: ''
            }
        },
        methods: {
            registerUser() {
                let newUser = {
                    username: this.username,
                    password: this.password
                };
                console.log(newUser);
            }
        }
    }
</script>

<style scoped>

</style>