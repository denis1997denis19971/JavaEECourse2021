<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 21.03.2021
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Info</title>
</head>
<body>
    <%
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String subject = request.getParameter("subject");
    String message = request.getParameter("message");

    out.println("Name: " + name + "\n");
    out.println("email: " + email + "\n");
    out.println("subject: " + subject + "\n");
    out.println("message: " + message + "\n");

    %>
</body>
</html>
