import axios from 'axios';
import cookie from 'vue-cookie';

const baseDomain = "http://80.240.21.133";
const baseURL = `${baseDomain}:7777`;

export default axios.create({
    baseURL,
    headers: {
        "Authorization": "Bearer " + cookie.get("token"),
        "Access-Control-Allow-Origin": "*",
        "Content-Type": "application/x-www-form-urlencoded"
    }
});
