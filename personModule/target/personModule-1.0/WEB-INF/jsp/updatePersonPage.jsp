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
    <title>update Person Page</title>
</head>
<body>
<form action="updatePage" method="post">
    <input type="number" name="personId" value="${updatePersonId}"/>
    <input type="text" name="personName" value="${updatePersonName}"/>
    <input type="number" name="personAge"value="${updatePersonAge}"/>
    <button type="submit">Apply</button>
</form>
</body>
</html>
