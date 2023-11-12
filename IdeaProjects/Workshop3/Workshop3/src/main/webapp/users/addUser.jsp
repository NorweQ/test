<%--
  Created by IntelliJ IDEA.
  User: norweq
  Date: 10.11.2023
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Users_CRUD</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="<c:url value="/theme/css/sb-admin-2.css"/>" rel="stylesheet">

</head>

<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">

    <%@ include file="header.jsp" %>

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

            <!-- Topbar -->
            <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                <!-- Sidebar Toggle (Topbar) -->
                <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                    <i class="fa fa-bars"></i>
                </button>

            </nav>
            <!-- End of Topbar -->

            <!-- Begin Page Content -->
            <div class="container-fluid">
                <!-- Page Heading -->
                <div class="d-sm-flex align-items-center justify-content-between mb-4">
                    <h1 class="h3 mb-0 text-gray-800">Add User</h1>
                </div>

                <div>
                    <%--TUTAJ TREŚĆ STRONY--%>
                    <form action="/addUser" method="post">
                        <table>
                            <tr>
                                <td><label for="username">Imię:</label></td>
                                <td><input type="text" id="username" name="username"></td>
                            </tr>
                            <tr>
                                <td><label for="email">Email:</label></td>
                                <td><input type="email" id="email" name="email"></td>
                            </tr>
                            <tr>
                                <td><label for="password">Hasło:</label></td>
                                <td><input type="text" id="password" name="password"></td>
                            </tr>
                            <tr>
                                <td> <input type="submit" value="Add"></td>
                            </tr>
                        </table>
                    </form>
                </div>

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- End of Main Content -->

        <%@ include file="footer.jsp" %>

    </div>
    <!-- End of Content Wrapper -->

</div>
<!-- End of Page Wrapper -->

</body>
</html>
