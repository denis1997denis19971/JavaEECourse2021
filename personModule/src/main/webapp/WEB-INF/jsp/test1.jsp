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
<body>

<div>
    <img src="/img/bs.jpg" alt=""/>
</div>

<h3>Users page</h3>
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
            Add
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
                <form action="addPersonSpring" method="get">
                    <input type="hidden" name="addPersonName" value="${person.name}"/>
                    <input type="hidden" name="addPersonAge" value="${person.age}"/>
                    <button type="submit">Add user</button>
                </form>
            </td>
            <td>
                <form action="updatePage" method="get">
                    <input type="hidden" name="updatePersonId" value="${person.id}"/>
                    <input type="hidden" name="updatePersonName" value="${person.name}"/>
                    <input type="hidden" name="updatePersonAge" value="${person.age}"/>
                    <button type="submit" class="btn btn-light mb-1">edit</button>
                </form>
            </td>
            <td>
                <form action="deletePageSpring" method="get">
                    <input type="hidden" name="deletePersonId" value="${person.id}"/>
                    <button type="submit" class="btn btn-light mb-1">delete</button>
                </form>
            </td>
        </tr>

    </c:forEach>
</table>

<form action="addPersonSpring" method="get">
    <input type="hidden" name="addPersonName" value=""/>
    <input type="hidden" name="addPersonAge" value=""/>
    <button type="submit">Add user</button>
</form>

</body>
</html>
