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
    <title>Cadastro Professores</title>
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

<%--    <form action="/cep" class="form-inline" method="post">--%>
<%--        <div class="mb-3 mt-3">--%>
<%--            <label>Busca por CEP:</label>--%>
<%--            <input type="text" class="form-control" placeholder="Entre com o cep" name="cep" value="24415530">--%>
<%--        </div>--%>
<%--        <button type="submit" class="btn btn-primary">Buscar</button>--%>
<%--    </form>--%>

    <h2>Cadastramento de Professores</h2>

    <form action="/professor/incluir" method="post">
        <div class="mb-3 mt-3">
            <label>Nome:</label>
            <input type="text" class="form-control" placeholder="Entre com seu nome:" name="nome"
                   value="Professor2">
        </div>
        <div class="mb-3 mt-3">
            <label>Email:</label>
            <input type="email" class="form-control" placeholder="Entre com seu e-mail:" name="email"
                   value="professor2@bodytech.com">
        </div>
        <div class="mb-3 mt-3">
            <label>CPF:</label>
            <input type="text" class="form-control" placeholder="Entre com seu cpf:" name="cpf"
                   value="222.222.222.22">
        </div>

        <c:import url="/WEB-INF/jsp/endereco.jsp"/>

        <button type="submit" class="btn btn-primary">Cadastar</button>
    </form>
</div>
</body>
</html>
