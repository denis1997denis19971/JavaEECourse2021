<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
<form action="updateCarSpring" method="post">

    <label for="carId">Car id:</label>
    <input type="number" id="carId" name="carId" value="${updateCarId}"/>
    <br>

    <label for="carName">Car name:</label>
    <input type="text" id="carName" name="carName" value="${updateCarName}"/>
    <br>

    <label for="carBrand">Car brand:</label>
    <input type="text" id="carBrand" name="carBrand" value="${updateCarBrand}"/>
    <br>


    <label for="carSpeed">Car speed:</label>
    <input type="number" id="carSpeed" name="carSpeed" value="${updateCarSpeed}"/>
    <br>

    <label for="carAge">Car age:</label>
    <input type="number" id="carAge" name="carAge" value="${updateCarAge}"/>
    <br>

    <label for="carPrice">Car price:</label>
    <input type="number" id="carPrice" name="carPrice" value="${updateCarPrice}"/>

    <br>
    <br>

    <button type="submit">Apply</button>
</form>


</body>
</html>
