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
                        text: 'Temperature values movement chart',
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
        created() {
            this.fetchTemperature();
            this.fetchHumidity();
        },
        mounted() {
            this.renderChart();
        },
        methods: {
             renderChart() {
                 this.fetchTemperature().then(result => {
                     this.chartData.series = [{
                             name: 'temperature',
                             data: result
                         }];
                     this.chartData.xaxis = {
                         title: {
                             text: 'Value data per row',
                             style: {
                                 fontSize: "16px"
                             }
                         }
                     };
                     var apexCharts = new ApexCharts(this.$refs.line, this.chartData);
                     apexCharts.render();
                 });
             },
            async fetchTemperature() {
                 const {data} = await DataRepository.get();
                 this.temperatureData = data.map(row => row.temperature).slice(0, 60);
                 return this.temperatureData;
            },
            async fetchHumidity(){
                const {data} = await DataRepository.get();
                this.humidityData = data.map(row => row.humidity);
                return this.humidityData;
            }
        }
    }
</script>

<style scoped>

</style>
