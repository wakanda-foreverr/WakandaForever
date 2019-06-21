import Repository from "../repository.js";

const resource = "/data";

export default {
    get() {
        return Repository.get(`${resource}/all`);
    },
    getData(rowId) {
        return Repository.get(`${resource}/${rowId}`);
    }
};
