<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
</head>
<body>

<!-- ======= Hero Section ======= -->
<section class="hero">

    <div class="container text-center">
        <div class="row">
            <div class="col-md-12">
                <a class="hero-brand" href="../../home.jsp" title="Home"><img alt="QD Logo" src="assets/img/logo.png"></a>
            </div>
        </div>

        <div class="col-md-12">
            <h1>
                Quality Digital Publications
            </h1>
            <!--     <p class="tagline">
                     Just some my progects and thoughts about tech industry
                 </p>-->
            <a class="btn btn-full scrollto" href="#about">Get more information</a>
        </div>
    </div>

</section><!-- End Hero -->

<!-- ======= Header ======= -->
<header id="header">
    <div class="container">

        <div id="logo" class="pull-left">
            <a href="../../index.jsp">
                <img src="logo-nav.png" alt=""/>
            </a>
            <!-- Uncomment below if you prefer to use a text image -->
            <!--<h1><a href="#hero">Bell</a></h1>-->
        </div>

<%--        <nav id="nav-menu-container">--%>
<%--            <ul class="nav-menu">--%>
<%--                <li><a href="#about">About me</a></li>--%>
<%--                <li><a href="#features">Features</a></li>--%>
<%--                <li><a href="#portfolio">Portfolio</a></li>--%>
<%--                <li><a href="#team">Partners</a></li>--%>
<%--                <li class="menu-has-children"><a href="">Progects</a>--%>
<%--                    <ul>--%>
<%--                        <li><a href="#">BI</a></li>--%>
<%--                        <li class="menu-has-children"><a href="#">Business software</a>--%>
<%--                            <ul>--%>
<%--                                <li><a href="#">Accounting</a></li>--%>
<%--                                <li><a href="#">Trade</a></li>--%>
<%--                                <li><a href="#">ERP</a></li>--%>
<%--                                <li><a href="#">HRM</a></li>--%>
<%--                                <li><a href="#">EDI</a></li>--%>
<%--                            </ul>--%>
<%--                        </li>--%>
<%--                        <li><a href="#">AI</a></li>--%>
<%--                        <li><a href="#">IOT</a></li>--%>
<%--                        <li><a href="#">MES</a></li>--%>
<%--                    </ul>--%>
<%--                </li>--%>
<%--                <li><a href="#contact">Contact with me</a></li>--%>
<%--            </ul>--%>

<%--        </nav>--%>

<%--        <!-- #nav-menu-container -->--%>

<%--        <nav class="nav social-nav pull-right d-none d-lg-inline">--%>
<%--            <a href="#"><i class="fa fa-twitter"></i></a> <a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i--%>
<%--                class="fa fa-linkedin"></i></a> <a href="#"><i class="fa fa-envelope"></i></a>--%>

<%--            <form class="form-inline" method="post" action="controller">--%>
<%--                <label class="sr-only" for="inlineFormInputName2">Name</label>--%>
<%--                <input type="text" name="login" class="form-control mb-2 mr-sm-2" id="inlineFormInputName2" placeholder="Username">--%>

<%--                <label class="sr-only" for="inlineFormInputGroupUsername2">Username</label>--%>
<%--                <div class="input-group mb-2 mr-sm-2">--%>
<%--                    <div class="input-group-prepend">--%>
<%--                        <div class="input-group-text"></div>--%>
<%--                    </div>--%>
<%--                    <input name="password" type="password" class="form-control" id="inlineFormInputGroupUsername2" placeholder="Password">--%>
<%--                </div>--%>

<%--                <div class="form-check mb-2 mr-sm-2">--%>
<%--                    <input class="form-check-input" type="checkbox" id="inlineFormCheck">--%>
<%--                    <label class="form-check-label" for="inlineFormCheck">--%>
<%--                        Remember me--%>
<%--                    </label>--%>
<%--                </div>--%>

<%--                <button type="submit" class="btn btn-light mb-1">Sign in</button>--%>
<%--            </form>--%>
<%--        </nav>--%>

    </div>
</header><!-- End Header -->

<main id="main">
    <h1>Person list:</h1>
    <table border="1">

        <tr>
            <th>
                Id
            </th>
            <th>
                Name
            </th>
            <th>
                Age
            </th>
            <th>
                Edit
            </th>
            <th>
                Delete
            </th>
        </tr>

        <c:forEach items="${personList}" var="person">

            <tr>
                <td>${person.id}</td>
                <td>${person.name}</td>
                <td>${person.age}</td>
                <td>
                    <form action="updatePerson" method="get">
                       <input type="hidden" name="updatePersonId" value="${person.id}"/>
                       <input type="hidden" name="updatePersonName" value="${person.name}"/>
                       <input type="hidden" name="updatePersonAge" value="${person.age}"/>
                       <button type="submit" class="btn btn-light mb-1">edit</button>
                    </form>
                </td>
                <td>
                    <form action="deletePerson" method="get">
                        <input type="hidden" name="deletePersonId" value="${person.id}"/>
                        <button type="submit" class="btn btn-light mb-1">delete</button>
                    </form>
                </td>
            </tr>

        </c:forEach>

        <form action="addPerson" method="get">
            <button type="submit" class="btn btn-light mb-1">Add user</button>
        </form>

        <form action="fullfill" method="get">
            <button type="submit" class="btn btn-light mb-1">Add def users!!!</button>
        </form>

    </table>

    <br>
</main><!-- End #main -->

<!-- ======= Footer ======= -->
<footer class="site-footer">
    <div class="bottom">
        <div class="container">
            <div class="row">

                <div class="col-lg-6 col-xs-12 text-lg-left text-center">
                    <p class="copyright-text">
                        &copy; Copyright <strong>QDPub</strong>. All Rights Reserved
                    </p>
                    <div class="credits">
                        Designed by <a href="https://QDPub.eu/">Denis Zhukouski</a>
                    </div>
                </div>

                <div class="col-lg-6 col-xs-12 text-lg-right text-center redrefa">
                    <ul class="list-inline">
                        <li class="list-inline-item">
                            <a href="../../index.jsp">Home</a>
                        </li>

                        <li class="list-inline-item">
                            <a href="#about">About me</a>
                        </li>

                        <li class="list-inline-item">
                            <a href="#features">Features</a>
                        </li>

                        <li class="list-inline-item">
                            <a href="#portfolio">Portfolio</a>
                        </li>

                        <li class="list-inline-item">
                            <a href="#team">Team</a>
                        </li>

                        <li class="list-inline-item">
                            <a href="#contact">Contact</a>
                        </li>
                    </ul>
                </div>

            </div>
        </div>
    </div>
</footer><!-- End Footer -->

<a class="scrolltop" href="#"><span class="fa fa-angle-up"></span></a>


</body>

</html>