<template>
    <div class="dashboard-main-wrapper">
        <div class="ecommerce-widget">
            <div class="row">
                <div class="col-12">
                    <div class="card">
                        <chart-line></chart-line>
                        <hr/>
                        <data-table></data-table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import ChartLine from "./ChartLine";
    import DataTable from "./Datatable";

    export default {
        components: {ChartLine, DataTable}
    }

</script>

<style scoped>

</style>
