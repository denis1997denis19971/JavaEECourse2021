<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<%@ page import="java.util.*" %>

<html>
<head>
    <title>Adding person</title>
</head>
<body>
    <form action="addPersonSpring" method="post">
        <input type="text" name="personName" value="${addPersonName}"/>
        <input type="number" name="personAge" value="${addPersonAge}"/>
        <button type="submit">save changes</button>
    </form>

    ${message}

    <form action="admin" method="get">
        <button type="submit">cencel</button>
    </form>

</body>
</html>
