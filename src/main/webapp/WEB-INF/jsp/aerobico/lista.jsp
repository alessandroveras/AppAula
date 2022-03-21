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
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
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

    <h2>Cadastramento de Atividades Aerobicas</h2>

    <form action="/aerobico" method="get">
        <button type="submit" class="btn btn-primary">Novo</button>
    </form>

    <hr>

    <c:if test="${not empty lista}">

        <h2>Total de Atividades Aerobicas: ${lista.size()}</h2>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Id</th>
                <th>Descricao</th>
                <th>DuracaoMinutos</th>
                <th>Intensidade</th>
                <th>Supervisionada</th>
                <th>Equipamento</th>
                <th>CoolDownTime</th>
                <th>UsarCarga</th>
                <th>CaloriasPorMinuto</th>
                <th></th>

            </tr>
            </thead>
            <tbody>
            <c:forEach var="aerobico" items="${lista}">
                <tr>
                    <td>${aerobico.id}</td>
                    <td>${aerobico.descricao}</td>
                    <td>${aerobico.duracaoMinutos}</td>
                    <td>${aerobico.intensidade}</td>
                    <td>${aerobico.supervisionada}</td>
                    <td>${aerobico.equipamento}</td>
                    <td>${aerobico.coolDownMinutos}</td>
                    <td>${aerobico.usarCarga}</td>
                    <td>${aerobico.caloriasPorMinuto}</td>
                    <td><a href="/aerobico/${aerobico.id}/excluir">Excluir</a></td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </c:if>

    <c:if test="${empty lista}">
        <h2>Não existem atividades aerobicas cadastradas!!!</h2>
    </c:if>

</div>
<script type="text/javascript">
    window.setTimeout(function () {
        $(".alert-success").fadeTo(500, 0).slideUp(500, function () {
            $(this).remove();
        });
    }, 3000);
</script>
</body>

</html>
