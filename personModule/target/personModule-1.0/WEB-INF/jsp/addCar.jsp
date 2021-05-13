<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<%@ page import="java.util.*" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
<head>
    <title>Adding car</title>
</head>
<body>
<%--/*        private int id;
private String name;
private String brand;
private int speed;
private int age;
private int price;*/--%>



    <form action="addCar" method="post">
        <input type="text" name="carName" value=""/>
        <input type="text" name="carBrand" value=""/>
        <input type="number" name="carSpeed" value=""/>
        <input type="number" name="carAge" value=""/>
        <input type="number" name="carPrice" value=""/>

        <button type="submit">save changes</button>
    </form>

    <form action="user" method="get">
        <button type="submit">cencel</button>
    </form>
<%
    if (request.getAttribute("errormessage") != null)
        out.println(request.getAttribute("errormessage"));
%>
</body>
</html>
