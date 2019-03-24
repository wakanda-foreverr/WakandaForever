<template>
        <div class="dashboard-main-wrapper">
            <div class="ecommerce-widget">
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <h5 class="card-header">API Docs</h5>
                            <div class="card-body p-0">
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead class="bg-light">
                                        <tr class="border-0">
                                            <th class="border-0">#</th>
                                            <th class="border-0">Endpoint Url</th>
                                            <th class="border-0">Parameters</th>
                                            <th class="border-0">Type</th>
                                            <th class="border-0">Description</th>
                                        </tr>
                                        </thead>
                                        <tbody>

                                        <tr>
                                            <td>1</td>
                                            <td>/data/all/</td>
                                            <td> - </td>
                                            <td>GET</td>
                                            <td>Returns all data collected by the sensors</td>
                                        </tr>

                                        <tr>
                                            <td>2</td>
                                            <td>/data/all/{id}</td>
                                            <td>id</td>
                                            <td>GET</td>
                                            <td>Returns specific row of data collected by the sensors</td>
                                        </tr>
                                        <tr>
                                            <td>3</td>
                                            <td>/data/save/</td>
                                            <td> - </td>
                                            <td>POST</td>
                                            <td>Saves the data collected by the sensors in the database</td>
                                        </tr>
                                        <tr>
                                            <td>4</td>
                                            <td> - </td>
                                            <td> - </td>
                                            <td> - </td>
                                            <td> - </td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</template>

<script>
    export default {
        name: "Docs.vue"
    }
</script>

<style scoped>

</style>