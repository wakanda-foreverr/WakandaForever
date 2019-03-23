import axios from 'axios'

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
            .then(response => {console.log(response.data)});
    },
    loginUser(user) {
        return apiClient.post("/token/generateToken", user)
            .then(response => {
                console.log(response.data);

                // TODO: save the returned token

            })
            .catch(exception => {console.log(exception)});
    }
}