<template>
    <div class="dashboard-main-wrapper">
        <div class="ecommerce-widget">
            <div class="row">
                <div class="col-12">
                    <div class="card">
                        <!--<ChartLine options="" series=""></ChartLine>-->
                        <!--<chart-line></chart-line>-->
                        <data-table></data-table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    // import ChartLine from "./ChartLine";
    import DataTable from "./Datatable";

    export default {
        // components: {ChartLine, DataTable}
        components: {DataTable}
    }

</script>

<style scoped>

</style>
