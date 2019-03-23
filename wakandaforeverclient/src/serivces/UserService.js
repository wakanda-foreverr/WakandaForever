import axios from 'axios'
import cookie from 'vue-cookie'
import router from "../router";

let apiClient = axios.create({
    baseURL: `http://80.240.21.133:7777`,
    withCredentials: false,
    headers: {
        Accept: 'application/json',
        'Content-Type': 'application/json'
    },
    timeout: 10000
});

export default {
    registerUser(user) {
        return apiClient.post("/signup", user)
            .then(response => {
                console.log(response.data)
                // todo: call loginUser()
            });
    },
    loginUser: function (user) {
        return apiClient.post("/token/generateToken", user)
            .then(response => {
                cookie.set("token", response.data.token, 1);
                apiClient.headers = {
                    'Authorization': 'Bearer ' + cookie.get("token")
                };
                apiClient.defaults.headers.common["Authorization"] = 'Bearer ' + cookie.get("token");

                apiClient.get("/users/me").then(response => {
                    console.log(response.data)
                    router.push("/dashboard")
                })
            })
            .catch(exception => {
                console.log(exception)
            });
    }
}