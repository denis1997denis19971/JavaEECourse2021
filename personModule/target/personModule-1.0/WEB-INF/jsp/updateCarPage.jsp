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
    <title>update car Page</title>
</head>
<body>
<%--/*        private int id;
private String name;
private String brand;
private int speed;
private int age;
private int price;*/--%>
<form action="updateCar" method="post">
    <input type="number" name="carId" value="${updateCarId}"/>
    <input type="text" name="carName" value="${updateCarName}"/>
    <input type="text" name="carBrand" value="${updateCarBrand}"/>
    <input type="number" name="carSpeed"value="${updateCarSpeed}"/>
    <input type="number" name="carAge"value="${updateCarAge}"/>
    <input type="number" name="carPrice"value="${updateCarPrice}"/>
    <button type="submit">Apply</button>
</form>


<c:forEach items="${errormessage}" var="message">
    <p>${message}</p>
</c:forEach>

</body>
</html>
