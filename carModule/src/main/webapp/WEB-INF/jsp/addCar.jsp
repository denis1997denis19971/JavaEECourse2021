<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Adding car</title>
</head>
<body>

<form action="addCar" method="post">

    <label for="carName">Car name:</label>
    <input type="text" id="carName" name="carName" value=""/><br>

    <label for="carBrand">Car brand:</label>
    <input type="text" id="carBrand" name="carBrand" value=""/><br>

    <label for="carSpeed">Car speed:</label>
    <input type="number" id="carSpeed" name="carSpeed" value=""/><br>

    <label for="carAge">Car age:</label>
    <input type="number" id="carAge" name="carAge" value=""/><br>

    <label for="carPrice">Car price:</label>
    <input type="number" id="carPrice" name="carPrice" value=""/><br>
    <br>

    <button type="submit">save changes</button>
</form>

<form action="homePage" method="get">
    <button type="submit">cencel</button>
</form>

</body>
</html>
