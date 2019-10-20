<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8"/>
    <title>Document</title>
</head>
<body>
<header class="header--main-page">
    <nav class="container container--70">
        <ul class="nav--actions">
            <li><a href="<c:url value="/login"/>" class="btn btn--small btn--without-border">Zaloguj</a></li>
            <li><a href="<c:url value="/registration"/>" class="btn btn--small btn--highlighted">Załóż konto</a></li>
        </ul>
        <ul>
            <li><a href="<c:url value="/"/>" class="btn btn--without-border active">Start</a></li>
            <li><a href="<c:url value="/form"/>" class="btn btn--without-border">Formularz</a></li>
            <li><a href="<c:url value="#goingon"/>" class="btn btn--without-border">O co chodzi?</a></li>
            <li><a href="<c:url value="#aboutus"/>" class="btn btn--without-border">O nas</a></li>
            <li><a href="<c:url value="#foundations"/>" class="btn btn--without-border">Fundacje i organizacje</a></li>
            <li><a href="<c:url value="#contact"/>" class="btn btn--without-border">Kontakt</a></li>
        </ul>
    </nav>
    <div class="slogan container container--90">
        <div class="slogan--item">
            <h1>
                Zacznij pomagać!<br/>
                Oddaj niechciane rzeczy w zaufane ręce
            </h1>
        </div>
    </div>
</header>
</body>
</html>