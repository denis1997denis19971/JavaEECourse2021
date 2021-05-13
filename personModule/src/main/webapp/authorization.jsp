<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>Главная</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <%--    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">--%>
</head>
<body>
<div>

    <form method="post" action="person">
        <label for="inlineFormInputName2">Name</label>
        <input type="text" name="loginfromauth" class="form-control mb-2 mr-sm-2" id="inlineFormInputName2"
               placeholder="Username">

        <label for="inlineFormInputGroupUsername2">Username</label>
        <div>
            <div>
                <div></div>
            </div>
            <input name="password" type="password" id="inlineFormInputGroupUsername2" placeholder="Password">
        </div>

        <div>
            <input type="checkbox" id="inlineFormCheck">
            <label for="inlineFormCheck">
                Remember me
            </label>
        </div>

        <button type="submit">Sign in</button>
    </form>
    <%--    <h3>${pageContext.request.userPrincipal.name}</h3>
        <sec:authorize access="!isAuthenticated()">
            <h4><a href="/login">Войти</a></h4>
            <h4><a href="/registration">Зарегистрироваться</a></h4>
        </sec:authorize>
        <sec:authorize access="isAuthenticated()">
            <h4><a href="/logout">Выйти</a></h4>
        </sec:authorize>
        <h4><a href="/news">Новости (только пользователь)</a></h4>
        <h4><a href="/admin">Пользователи (только админ)</a></h4>--%>
</div>
</body>
</html>