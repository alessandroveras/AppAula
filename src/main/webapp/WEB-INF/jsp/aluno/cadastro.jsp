<%--
  Created by IntelliJ IDEA.
  User: aless
  Date: 18/12/2021
  Time: 01:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Cadastro Alunos</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-3">
    <h2>Cadastramento de Alunos</h2>
    <form action="/aluno/incluir" method="post">
        <div class="mb-3 mt-3">
            <label>Email:</label>
            <input type="email" class="form-control" placeholder="Entre com seu e-mail" name="email"
                   value="alessandro.veras@gmail.com">
        </div>
        <div class="mb-3 mt-3">
            <label>Nome:</label>
            <input type="text" class="form-control" placeholder="Entre com seu nome" name="nome"
                   value="Alessandro Veras">
        </div>
        <div class="mb-3 mt-3">
            <label>Curso:</label>
            <div class="form-check">
                <input type="radio" class="form-check-input" name="radioCurso" value="graduacao" checked>
                <label class="form-check-label">Graduação</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" name="radioCurso" value="especializacao">
                <label class="form-check-label">Especialização</label>
            </div>
            <div class="form-check">
                <input type="radio" class="form-check-input" name="radioCurso" value="mestrado">
                <label class="form-check-label">Mestrado</label>
            </div>
        </div>
        <div class="mb-3 mt-3">
            <label>Disciplinas:</label>
            <div class="form-check">
                <input type="checkbox" class="form-check-input" name="checkDisciplinas" value="fundamentosJava">
                <label class="form-check-label">Fundamentos Java</label>
            </div>
            <div class="form-check">
                <input type="checkbox" class="form-check-input" name="checkDisciplinas" value="javaWeb" checked>
                <label class="form-check-label">Java Web</label>
            </div>
            <div class="form-check">
                <input type="checkbox" class="form-check-input" name="checkDisciplinas" value="poo">
                <label class="form-check-label">POO</label>
            </div>
        </div>
        <div class="mb-3 mt-3">
            <label class="form-label">Região:</label>
            <select class="form-select" name="regiao">
                <option>Sul</option>
                <option>Sudeste</option>
                <option selected>Centro-Oeste</option>
                <option>Norte</option>
                <option>Nordeste</option>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Cadastar</button>
    </form>
</div>
</body>
</html>
