<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 22.04.2021
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body style="background-color: ghostwhite;">

<div>
    <img src="${pageContext.request.contextPath}/img/bs.jpg" alt="картинка"/>
</div>

<h3>Cars page</h3>
<table border="1" style="border-style: dashed; border-color: cadetblue; color:black">
    <tr>
        <th>
            Id
        </th>
        <th>
            Name
        </th>
        <th>
            Brand
        </th>
        <th>
            Speed
        </th>
        <th>
            Age
        </th>
        <th>
            Price
        </th>
        <th>
            Add
        </th>
        <th>
            Edit
        </th>
        <th>
            Delete
        </th>
    </tr>
    <c:forEach items="${carList}" var="car">
        <tr>
            <td>${car.id}</td>
            <td>${car.name}</td>
            <td>${car.brand}</td>
            <td>${car.speed}</td>
            <td>${car.age}</td>
            <td>${car.price}</td>
            <td>
                <form action="addCarSpring" method="get">
                    <input type="hidden" name="addCarName" value="${car.name}"/>
                    <input type="hidden" name="addCarBrand" value="${car.brand}"/>
                    <input type="hidden" name="addCarSpeed" value="${car.speed}"/>
                    <input type="hidden" name="addCarAge" value="${car.age}"/>
                    <input type="hidden" name="addCarPrice" value="${car.price}"/>
                    <button type="submit">Add car</button>
                </form>
            </td>
            <td>
                <form action="updateCarSpring" method="get">
                    <input type="hidden" name="updateCarId" value="${car.id}"/>
                    <input type="hidden" name="updateCarName" value="${car.name}"/>
                    <input type="hidden" name="updateCarBrand" value="${car.brand}"/>
                    <input type="hidden" name="updateCarSpeed" value="${car.speed}"/>
                    <input type="hidden" name="updateCarAge" value="${car.age}"/>
                    <input type="hidden" name="updateCarPrice" value="${car.price}"/>
                    <button type="submit" class="btn btn-light mb-1">car update</button>
                </form>
            </td>
            <td>
                <form action="deleteCarSpring" method="get">
                    <input type="hidden" name="deleteCarId" value="${car.id}"/>
                    <button type="submit" class="btn btn-light mb-1">car delete</button>
                </form>
            </td>
        </tr>

    </c:forEach>
</table>

<form action="addCarSpring" method="get">
    <input type="hidden" name="addCarName" value=""/>
    <input type="hidden" name="addCarBrand" value=""/>
    <input type="hidden" name="addCarSpeed" value="0"/>
    <input type="hidden" name="addCarAge" value="0"/>
    <input type="hidden" name="addCarPrice" value="0"/>
    <button type="submit">Add car</button>
</form>
<br>
ID:<b>${curid}</b><br>
NAME:<i>${curname}</i><br>
CURS:<i>${officialrate}</i><br>
KRAT:<b>${scale}</b><br>
</body>
</html>
