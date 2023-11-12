<%--
  Created by IntelliJ IDEA.
  User: norweq
  Date: 10.11.2023
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<header>
    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

        <!-- Sidebar - Brand -->
        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="#">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-laugh-wink"></i>
            </div>
            <div class="sidebar-brand-text mx-3">Users_CRUD</div>
        </a>

        <!-- Divider -->
        <hr class="sidebar-divider my-0">

        <!-- Nav bar -->
        <li class="nav-item active">
            <a href="<c:url value="/users/defult.jsp"/>" class="nav-link">
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <span>Main Page</span></a>
        </li>
        <li class="nav-item active">
            <a href="<c:url value="/users/addUser.jsp"/>" class="nav-link">
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <span>Add User</span></a>
        </li>
        <li class="nav-item active">
            <a href="<c:url value="/list"/>" class="nav-link">
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <span>Users List</span></a>
        </li>
        <li class="nav-item active">
            <a href="<c:url value="/printId"/>" class="nav-link">
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <span>Find User</span></a>
        </li>
        <%--        <li class="nav-item active">--%>
        <%--            <a href="<c:url value="/user/add"/>" class="nav-link">--%>
        <%--                <i class="fas fa-fw fa-tachometer-alt"></i>--%>
        <%--                <span>Add User</span></a>--%>
        <%--        </li>--%>

        <!-- Divider -->
        <hr class="sidebar-divider my-0">

    </ul>
    <!-- End of Sidebar -->
</header>
