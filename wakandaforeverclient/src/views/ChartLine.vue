<template>
    <div id="chartLine">
        <div id="chart" ref="line"></div>
    </div>
</template>

<script>
    import ApexCharts from 'apexcharts';
    import {RepositoryFactory} from "../factories/repositoryFactory";
    const DataRepository = RepositoryFactory.get("data");

    export default {
        data(){
            return {
                temperatureData: [],
                humidityData: [],
                chartData: {
                    chart: {
                        animations: {
                            enabled: true,
                            easing: 'linear',
                            dynamicAnimation: {
                                speed: 1000
                            }
                        },
                        shadow: {
                            enabled: false,
                            color: '#bbb',
                            top: 3,
                            left: 2,
                            blur: 3,
                            opacity: 1
                        },
                        type: 'line',
                        height: 400
                    },
                    series: [],
                    title: {
                        text: 'Temperature and humidity chart',
                        align: 'left',
                        style: {
                            fontSize: '24px',
                            color: '#666'
                        }
                    },
                    fill: {
                        type: 'gradient',
                        gradient: {
                            shade: 'dark',
                            gradientToColors: ['#FDD835'],
                            shadeIntensity: 1,
                            type: 'horizontal',
                            opacityFrom: 1,
                            opacityTo: 1,
                            stops: [0, 100, 100, 200]
                        }
                    },
                    xaxis: {},
                    yaxis: {
                        min: -20,
                        max: 40,
                        title: {
                            text: 'Temperature',
                            style: {
                                fontSize: '16px'
                            }
                        }
                    }
                }
            }
        },
        mounted() {
            this.renderChart();
        },
        created() {
          this.fetchTemperature();
          this.fetchHumidity();
        },
        methods: {
             renderChart() {
                 // console.log(this.temperatureData);
                 // console.log(this.humidityData);
                 // var parsedobj = JSON.parse(JSON.stringify(this.humidityData));
                 // console.log(parsedobj);
                 var series = [{
                     name: 'Temperature',
                     data: this.temperatureData
                 }];
                 var xaxis = {
                     categories: this.humidityData,
                     title: {
                         text: 'Humidity',
                         style: {
                             fontSize: "16px"
                         }
                     }
                 };

                 this.chartData.series = series;
                 this.chartData.xaxis = xaxis;
                 var apexCharts = new ApexCharts(this.$refs.line, this.chartData);
                 apexCharts.render();
             },
             fetchTemperature() {
                DataRepository.get().then(
                    result => {
                        // console.log(data);
                        this.temperatureData = result.data.map(row => row.temperature);
                        console.log("fetchTemperature", this.temperatureData);
                        return this.temperatureData;
                    }
                );
            },
            async fetchHumidity(){
                const {data} = await DataRepository.get();
                this.humidityData = data.map(row => row.humidity);
            }
        }
    }
</script>

<style scoped>

</style>
