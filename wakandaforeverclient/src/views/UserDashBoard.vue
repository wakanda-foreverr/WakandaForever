<template>
    <div class="dashboard-main-wrapper">
            <div class="ecommerce-widget">
            <div class="row">
                <div class="col-12">
                    <div class="card">
                        <h5 class="card-header">Sensors Data</h5>
                        <div class="card-body p-0">
                            <div class="table-responsive">
                                <table class="table">
                                    <thead class="bg-light">
                                    <tr class="border-0">
                                        <th class="border-0">Sound</th>
                                        <th class="border-0">Temperature</th>
                                        <th class="border-0">Humidity</th>
                                        <th class="border-0">Air Pressure</th>
                                        <th class="border-0">Fire</th>
                                        <th class="border-0">Light</th>
                                        <th class="border-0">Soil Moisture</th>
                                        <th class="border-0">Water level</th>
                                        <th class="border-0">Air Quality</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <td>Row</td>
                                        <td>Row</td>
                                        <td>Row</td>
                                        <td>Row</td>
                                        <td>Row</td>
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
    import dashBoardService from "../serivces/DashboardService";

    export default {
        name: "UserDashBoard",
        data: function() {
            return {
                allData: [{
                    sound: "0"
                }]
            }
        },
        methods: {
            getAllData(){
                this.allData = dashBoardService.getAllData();
                console.log(this.allData);
            }
        },
        mounted(){
            this.getAllData();
        }
    }
</script>


<style scoped>

</style>