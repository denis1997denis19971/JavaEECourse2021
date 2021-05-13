<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>update Person Page</title>
</head>
<body>
<form action="updatePage" method="post">
    <label for="personId">Person id:</label>
    <input type="number" id="personId" name="personId" value="${updatePersonId}"/><br>

    <label for="personName">Person name:</label>
    <input type="text" id="personName" name="personName" value="${updatePersonName}"/><br>

    <label for="personAge">Person age:</label>
    <input type="number" id="personAge" name="personAge" value="${updatePersonAge}"/><br>
    <br>

    <button type="submit">Apply</button>
</form>
</body>
</html>
