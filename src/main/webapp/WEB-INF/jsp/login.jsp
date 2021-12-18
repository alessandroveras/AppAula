<%--
  Created by IntelliJ IDEA.
  User: aless
  Date: 18/12/2021
  Time: 02:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>AppAula</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-3">

    <c:if test="${not empty msg}">
        <div class="alert alert-warning">
            <strong>Atenção!</strong> ${msg}
        </div>
    </c:if>
        
    <h2>Autenticação</h2>
    <form action="/login" method="post">
        <div class="mb-3 mt-3">
            <label>E-mail:</label>
            <input type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email"
                   value="alessandro.veras@gmail.com">
        </div>

        <div class="mb-3">
            <label>Senha:</label>
            <input type="password" class="form-control" placeholder="Entre com a sua senha" name="senha"
                   value="alessandro.veras@gmail.com">
        </div>

        <button type="submit" class="btn btn-primary">Acessar</button>
    </form>
</div>
</body>
</html>
