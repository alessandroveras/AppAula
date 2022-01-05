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

    <h2>Cadastramento de Usuários</h2>

    <hr>

    <c:if test="${not empty lista}">

        <h2>Total de usuários: ${lista.size()}</h2>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>E-mail</th>
                <th>Professores</th>
                <c:if test="${user.admin}">
                    <th></th>
                </c:if>

            </tr>
            </thead>
            <tbody>
            <c:forEach var="usuario" items="${lista}">
                <tr>
                    <td>${usuario.id}</td>
                    <td>${usuario.nome}</td>
                    <td>${usuario.email}</td>
                    <td>${usuario.professores.size()}</td>

                    <c:if test="${user.admin}">
                        <c:if test="${user.id != usuario.id}">
                            <td><a href="/usuario/${usuario.id}/excluir">Excluir</a></td>
                        </c:if>
                        <c:if test="${user.id == usuario.id}">
                            <td>-</td>
                        </c:if>
                    </c:if>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </c:if>

    <c:if test="${empty lista}">
        <h2>Não existem usuários cadastrados!!!</h2>
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
