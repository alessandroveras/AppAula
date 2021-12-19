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
    <title>Cadastro Professores</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">

    <h2>Cadastramento de Professores</h2>

    <form action="/professor/incluir" method="post">
        <div class="mb-3 mt-3">
            <label>Nome:</label>
            <input type="text" class="form-control" placeholder="Entre com seu nome:" name="nome"
                   value="Alessandro Personal">
        </div>
        <div class="mb-3 mt-3">
            <label>Email:</label>
            <input type="email" class="form-control" placeholder="Entre com seu e-mail:" name="email"
                   value="alessandro@bodytech.com">
        </div>
        <div class="mb-3 mt-3">
            <label>CPF:</label>
            <input type="text" class="form-control" placeholder="Entre com seu cpf:" name="cpf"
                   value="101.002.497-06">
        </div>

        <button type="submit" class="btn btn-primary">Cadastar</button>
    </form>
</div>
</body>
</html>
