<%--
  Created by IntelliJ IDEA.
  User: aless
  Date: 21/03/2022
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container">
    <h2>Quantidade de registros</h2>
    <ul class="list-group">

        <c:forEach var="map" items="${itensMap}">
            <li class="list-group-item d-flex justify-content-between align-items-center">${map.key} <span
                    class="badge bg-primary rounded-pill">${map.value}</span></li>
        </c:forEach>
    </ul>
</div>
</body>
</html>