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
    <title>Cadastro Aulas</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<c:set var="botao" value=""/>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">

    <h2>Cadastramento de Aulas</h2>

    <form action="/aula/incluir" method="post">
        <div class="mb-3 mt-3">>
            <c:if test="${not empty professores}">
                <label>Professores:</label>
                <select class="form-control" name="professor.id">
                    <c:forEach var="professor" items="${professores}">
                        <option value="${professor.id}">${professor.nome}</option>
                    </c:forEach>
                </select>
            </c:if>
            <c:if test="${empty professores}">
                <c:set var="botao" value="disabled"/>
                <label>Não existem professores cadastrados!!!</label>
            </c:if>
        </div>
        <div class="mb-3 mt-3">
            <label>Data:</label>
            <input type="text" class="form-control" placeholder="Entre com a data da aula: " name="data"
                   value="21/03/2022 14:00">
        </div>
        <div class="mb-3 mt-3">
            <label>Duracao</label>
            <input type="number" class="form-control" placeholder="Entre com a duracao da aula: " name="duracao"
                   value=60>
        </div>
        <div class="mb-3 mt-3">
            <c:if test="${not empty atividades}">
                <label>Atividades:</label>
                <c:forEach var="atividade" items="${atividades}">
                    <div class="checkbox">
                        <label><input type="checkbox" value="${atividade.id}" name="atividadesId">${atividade.descricao}
                        </label>
                    </div>
                </c:forEach>
            </c:if>

            <c:if test="${empty atividades}">
                <c:set var="botao" value="disabled"/>
                <label>Não existem atividades cadastradas!!!</label>
            </c:if>
        </div>

        <button ${botao} type="submit" class="btn btn-primary">Cadastar</button>
    </form>
</div>
</body>
</html>
