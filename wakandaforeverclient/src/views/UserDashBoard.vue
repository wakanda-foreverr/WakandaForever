<template>
    <div class="dashboard-main-wrapper">
            <!-- ============================================================== -->
            <!-- navbar -->
            <!-- ============================================================== -->
            <div class="dashboard-header">
                <nav class="navbar navbar-expand-lg bg-white fixed-top">
                    <a class="navbar-brand" href="index.html">Wakanda Forever</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse " id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto navbar-right-top">
                            <li class="nav-item dropdown nav-user">
                                <a class="nav-link nav-user-img" href="#" id="navbarDropdownMenuLink2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><img src="assets/images/avatar-1.jpg" alt="" class="user-avatar-md rounded-circle"></a>
                                <div class="dropdown-menu dropdown-menu-right nav-user-dropdown" aria-labelledby="navbarDropdownMenuLink2">
                                    <div class="nav-user-info">
                                        <h5 class="mb-0 text-white nav-user-name">John Abraham </h5>
                                        <span class="status"></span><span class="ml-2">Available</span>
                                    </div>
                                    <a class="dropdown-item" href="#"><i class="fas fa-user mr-2"></i>Account</a>
                                    <a class="dropdown-item" href="#"><i class="fas fa-cog mr-2"></i>Setting</a>
                                    <a class="dropdown-item" href="#"><i class="fas fa-power-off mr-2"></i>Logout</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
            <div class="ecommerce-widget">
            <div class="row">
                <div class="col-xl-9 col-lg-12 col-md-6 col-sm-12 col-12">
                    <div class="card">
                        <h5 class="card-header">Sensors Data</h5>
                        <div class="card-body p-0">
                            <div class="table-responsive">
                                <table class="table">
                                    <thead class="bg-light">
                                    <tr class="border-0">
                                        <th class="border-0">#</th>
                                        <th class="border-0">Image</th>
                                        <th class="border-0">Temperature</th>
                                        <th class="border-0">Humidity</th>
                                        <th class="border-0">Sound</th>
                                        <th class="border-0">.....</th>
                                        <th class="border-0">.....</th>
                                        <th class="border-0">.....</th>
                                        <th class="border-0">.....</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>
                                            <div class="m-r-10"><img src="assets/images/product-pic.jpg" alt="user" class="rounded" width="45"></div>
                                        </td>
                                        <td>Product #1 </td>
                                        <td>id000001 </td>
                                        <td>20</td>
                                        <td>$80.00</td>
                                        <td>27-08-2018 01:22:12</td>
                                        <td>Patricia J. King </td>
                                        <td><span class="badge-dot badge-brand mr-1"></span>InTransit </td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>
                                            <div class="m-r-10"><img src="assets/images/product-pic-2.jpg" alt="user" class="rounded" width="45"></div>
                                        </td>
                                        <td>Product #2 </td>
                                        <td>id000002 </td>
                                        <td>12</td>
                                        <td>$180.00</td>
                                        <td>25-08-2018 21:12:56</td>
                                        <td>Rachel J. Wicker </td>
                                        <td><span class="badge-dot badge-success mr-1"></span>Delivered </td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>
                                            <div class="m-r-10"><img src="assets/images/product-pic-3.jpg" alt="user" class="rounded" width="45"></div>
                                        </td>
                                        <td>Product #3 </td>
                                        <td>id000003 </td>
                                        <td>23</td>
                                        <td>$820.00</td>
                                        <td>24-08-2018 14:12:77</td>
                                        <td>Michael K. Ledford </td>
                                        <td><span class="badge-dot badge-success mr-1"></span>Delivered </td>
                                    </tr>
                                    <tr>
                                        <td>4</td>
                                        <td>
                                            <div class="m-r-10"><img src="assets/images/product-pic-4.jpg" alt="user" class="rounded" width="45"></div>
                                        </td>
                                        <td>Product #4 </td>
                                        <td>id000004 </td>
                                        <td>34</td>
                                        <td>$340.00</td>
                                        <td>23-08-2018 09:12:35</td>
                                        <td>Michael K. Ledford </td>
                                        <td><span class="badge-dot badge-success mr-1"></span>Delivered </td>
                                    </tr>
                                    <tr>
                                        <td colspan="9"><a href="#" class="btn btn-outline-light float-right">View Details</a></td>
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
    // import dashBoardService from "../serivces/DashboardService";

    export default {
        name: "UserDashBoard"
        // ,
        // created() {
        //     dashBoardService.getAllData();
        // }
    }
</script>

<style scoped>

</style>