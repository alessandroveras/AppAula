<%--
  Created by IntelliJ IDEA.
  User: aless
  Date: 18/12/2021
  Time: 03:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>AppAulas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
</head>
<body>

<div class="container mt-3">

    <c:if test="${not empty mensagem}">
        <div class="alert alert-success alert-dismissible fade show">
            <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
            <strong>Confirmação!</strong> ${mensagem}
        </div>
    </c:if>

    <h2>Cadastramento de Professores</h2>

    <form action="/professor" method="get">
        <button type="submit" class="btn btn-primary">Novo</button>
    </form>

    <hr>

    <c:if test="${not empty lista}">


        <h2>Total de professores: ${lista.size()}</h2>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Nome</th>
                <th>E-mail</th>
                <th>CPF</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="professor" items="${lista}">
                <tr>
                    <td>${professor.nome}</td>
                    <td>${professor.email}</td>
                    <td>${professor.cpf}</td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </c:if>
    <c:if test="${empty lista}">
        <h2>Não existem professores cadastrados!!!</h2>
    </c:if>
</div>
</body>
</html>
