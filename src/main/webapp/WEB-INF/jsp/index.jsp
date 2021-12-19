<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>AppAula</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <img src="https://cdn-icons-png.flaticon.com/512/2936/2936886.png"
                 alt="AppAula" style="width:40px;" class="rounded-pill">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="mynavbar">
            <ul class="navbar-nav me-auto">

                <c:if test="${not empty user}">
                <li class="nav-item"><a class="nav-link" href="#">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="/usuarios">Usuario</a></li>
                <li class="nav-item"><a class="nav-link" href="/professores">Professor</a></li>
                <li class="nav-item"><a class="nav-link" href="/alunos">Aluno</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Atividade</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Musculacao</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Aerobico</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Alongamento</a></li>
                </c:if>
            </ul>
            <ul class="navbar-nav navbar-right nav-flex-icons">

                <c:if test="${empty user}">
                <li class="nav-item"><a class="nav-link " href="/usuario">Sign Up</a></li>
                <li class="nav-item"><a class="nav-link " href="/login">Login</a></li>
                </c:if>

                <c:if test="${not empty user}">
                <li class="nav-item"><a class="nav-link " href="/logout">Logout, ${user.nome}</a></li>
                </c:if>
            </ul>

        </div>
    </div>
</nav>

<div class="container mt-3">
    <h2>AppAula: Sistema de Gestao de Aulas pra Personal Trainers</h2>

</div>

</body>
</html>