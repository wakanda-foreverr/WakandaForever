import axios from 'axios'
import cookie from 'vue-cookie'

let apiClient = axios.create({
    baseURL: `http://80.240.21.133:7777`,
    withCredentials: false,
    headers: {
        Accept: 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer ' + cookie.get("token"),
        'Access-Control-Allow-Origin': '*'
    },
    timeout: 10000
});

export default {
    getAllData: function () {
        apiClient.get("/data/all/")
            .then(
            response => {
                console.log(response.data)
            }
        );
    }
}
