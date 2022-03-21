<%--
  Created by IntelliJ IDEA.
  User: aless
  Date: 19/12/2021
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
</head>
<body>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="/app">
            <img src="https://cdn-icons-png.flaticon.com/512/2936/2936886.png"
                 alt="AppAula" style="width:40px;" class="rounded-pill">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="mynavbar">
            <ul class="navbar-nav me-auto">

                <c:if test="${not empty user}">
                    <li class="nav-item"><a class="nav-link" href="/home">Home</a></li>
                    <li class="nav-item"><a class="nav-link" href="/usuarios">Usuario</a></li>
                    <li class="nav-item"><a class="nav-link" href="/professores">Professor</a></li>
                    <li class="nav-item"><a class="nav-link" href="/atividades">Atividade</a></li>
                    <li class="nav-item"><a class="nav-link" href="/musculacoes">Musculacao</a></li>
                    <li class="nav-item"><a class="nav-link" href="/aerobicos">Aerobico</a></li>
                    <li class="nav-item"><a class="nav-link" href="#">Alongamento</a></li>
                    <li class="nav-item"><a class="nav-link" href="/aulas">Aula</a></li>
                </c:if>
            </ul>
            <ul class="navbar-nav navbar-right nav-flex-icons">

                <c:if test="${empty user}">
                    <li class="nav-item"><a class="nav-link " href="/usuario"><i class="bi-person"></i> Sign Up</a></li>
                    <li class="nav-item"><a class="nav-link " href="/login"><i class="bi-box-arrow-in-right"></i> Login</a>
                    </li>
                </c:if>

                <c:if test="${not empty user}">
                    <li class="nav-item"><a class="nav-link " href="/logout"><i class="bi-box-arrow-in-left"></i>
                        Logout, ${user.nome}</a></li>
                </c:if>
            </ul>

        </div>
    </div>
</nav>
</body>
</html>
