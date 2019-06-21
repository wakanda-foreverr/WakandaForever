<template>
<div>
    <!--TODO: fix [Vue warn]: Duplicate keys detected: 'N/A'. This may cause an update error.-->
    <h5 class="card-header">Sensors Data</h5>
    <div class="card-body p-0">
        <div class="table-responsive">
            <table class="table">
                <thead class="bg-light">
                <tr class="border-0">
                    <th class="border-0">Row #</th>
                    <th class="border-0">Sound</th>
                    <th class="border-0">Temperature</th>
                    <th class="border-0">Humidity</th>
                    <th class="border-0">Air Pressure</th>
                    <th class="border-0">Fire</th>
                    <th class="border-0">Light</th>
                    <th class="border-0">Soil Moisture</th>
                    <th class="border-0">Water level</th>
                    <th class="border-0">Air Quality</th>
                    <th class="border-0">Created</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="data in this.allData">
                    <td v-bind:key="row">{{data.id}}</td>
                    <td v-bind:key="sound">{{data.sound}}</td>
                    <td v-bind:key="temperature">{{data.temperature}}</td>
                    <td v-bind:key="humidity">{{data.humidity}}</td>
                    <td v-bind:key="airPressure">{{data.sound}}</td>
                    <td v-bind:key="fire">{{data.fire}}</td>
                    <td v-bind:key="light">{{data.light}}</td>
                    <td v-bind:key="soilMoisture">{{data.soilMoisture}}</td>
                    <td v-bind:key="waterLevel">{{data.waterLevel}}</td>
                    <td v-bind:key="airQuality">{{data.airQuality}}</td>
                    <td v-bind:key="createdAt">{{data.createdAt}}</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
</template>

<script>
    import {RepositoryFactory} from "../factories/repositoryFactory";
    const DataRepository = RepositoryFactory.get("data");

    export default {
        name: "data-table",
        data() {
            return {
                allData: [],
                row: 0,
                sound: "N/A",
                temperature: "N/A",
                humidity: "N/A",
                airPressure: "N/A",
                fire: "N/A",
                light: "N/A",
                soilMoisture: "N/A",
                waterLevel: "N/A",
                airQuality: "N/A",
                createdAt: null
            }
        },
        created() {
            this.fetch();
        },
        methods: {
            async fetch (){
                const {data} = await DataRepository.get();
                this.allData = data;
            }
        }
    }
</script>

<style scoped>

</style>
