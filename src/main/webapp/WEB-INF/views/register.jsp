<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"/>
</head>
<body>
<c:import url="header.jsp"/>
<section class="login-page">
    <h2>Załóż konto</h2>
<%--    <form:form>--%>
<%--        <div class="form-group">--%>
<%--            <form:input type="email" name="email" placeholder="Email" path=""/>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <form:input type="password" name="password" placeholder="Hasło" path=""/>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <form:input type="password" name="password2" placeholder="Powtórz hasło" path=""/>--%>
<%--        </div>--%>

<%--        <div class="form-group form-group--buttons">--%>
<%--            <a href="login.html" class="btn btn--without-border">Zaloguj się</a>--%>
<%--            <button class="btn" type="submit">Załóż konto</button>--%>
<%--        </div>--%>
<%--    </form:form>--%>
</section>
<c:import url="footer.jsp"/>
<script src="<c:url value="/resources/js/app.js"/>"></script>
</body>
</html>
