<template>
    <div id="chartLine">
        <div id="chart" ref="line"></div>
    </div>
</template>

<script>
    import ApexCharts from "apexcharts";

    export default {
        mounted() {
            new ApexCharts(this.$refs.line, {
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
                series: [{
                    name: 'temperature',
                    data: [10, -20, 20, -10 ,30, 40]
                }],
                title: {
                    text: 'Temperature and humidity',
                    align: 'left',
                    style: {
                        fontSize: "16px",
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
                        stops: [0, 100, 100, 100]
                    },
                },
                xaxis: {
                    categories: [50, 51, 52, 53],
                    title: {
                        text: 'Humidity'
                    }
                },
                yaxis: {
                    min: -20,
                    max: 40,
                    title: {
                        text: 'Temperature',
                    },
                }
            }).render();
        }
    }
</script>

<style scoped>

</style>
