<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Adding person</title>
</head>
<body>
<form action="addPersonSpring" method="post">

    <label for="carName">Person name:</label>
    <input type="text" id="carName" name="personName" value="${addPersonName}"/><br>

    <label for="personAge">Person age:</label>
    <input type="number" id="personAge" name="personAge" value="${addPersonAge}"/><br>
    <br>

    <button type="submit">save changes</button>
</form>

${message}

<form action="admin" method="get">
    <button type="submit">cencel</button>
</form>

</body>
</html>
