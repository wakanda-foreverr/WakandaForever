import axios from 'axios'
import cookie from 'vue-cookie'

const apiClient = axios.create({
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
    loginUser(user) {
        return apiClient.post("/token/generateToken", user)
            .then(response => {
                cookie.set("token", response.data.token, 1);
            })
            .catch(exception => {console.log(exception)});
    }
}