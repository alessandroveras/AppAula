<%--
  Created by IntelliJ IDEA.
  User: aless
  Date: 18/12/2021
  Time: 01:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Cadastro de Atividades de Musculacao</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">

    <c:if test="${not empty mensagem}">
        <div class="alert alert-success alert-dismissible fade show">
            <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
            <strong>Confirmação!</strong> ${mensagem}
        </div>
    </c:if>

    <h2>Cadastramento de Usuários</h2>

    <form action="/musculacao/incluir" method="post">
        <div class="mb-3 mt-3">
            <label>Exercicio:</label>
            <input type="text" class="form-control" placeholder="Entre com o exercicio:" name="exercicio"
                   value="Supino Reto">
        </div>
        <div class="mb-3 mt-3">
            <label>GrupamentoMuscular:</label>
            <input type="text" class="form-control" placeholder="Entre com o grupamento muscular:"
                   name="grupamentoMuscular"
                   value="Peitoral">
        </div>

        <button type="submit" class="btn btn-primary">Cadastar</button>
    </form>
</div>
</body>
</html>
