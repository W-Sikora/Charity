<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>Document</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
</head>

<body>
<c:import url="header.jsp"/>

<section class="login-page">
    <h2>Załóż konto</h2>
    <form action="<c:url value="/registration"/>" method="post">
        <div class="form-group">
            <label>
                <input type="text" name="name" placeholder="imię">
            </label>
        </div>
        <div class="form-group">
            <label>
                <input type="text" name="lastName" placeholder="nazwisko">
            </label>
        </div>
        <div class="form-group">
            <label>
                <input type="email" name="email" placeholder="email">
            </label>
        </div>
        <div class="form-group">
            <label>
                <input type="password" name="password" placeholder="hasło">
            </label>
        </div>
        <div class="form-group form-group--buttons">
            <button class="btn" type="submit">Załóż konto</button>
        </div>
        <sec:csrfInput/>
    </form>
</section>

<c:import url="footer.jsp"/>

<script src="<c:url value="/resources/js/app.js"/>"></script>
</body>
</html>
