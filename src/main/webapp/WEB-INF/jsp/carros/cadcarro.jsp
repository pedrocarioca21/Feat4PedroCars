<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <title>Cadastrar carro</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<c:import url="/WEB-INF/jsp/menuNavBar.jsp"/>
<div>

<div class="container">

  <h2>Cadastrar veículos</h2>
  <p>Insira as informações do veículo nos campos para cadastrar em nossa base:</p>
  <form action="/cadcarro" method="post">
    <div class="form-group">
      <label>Placa:</label>
      <input type="text" class="form-control" placeholder="Ex: KXH-9932" name="placa">
    </div>
    <div class="form-group">
      <label>Montadora:</label>
      <input type="text" class="form-control" placeholder="Ex: Fiat" name="montadora">
    </div>
    <div class="form-group">
      <label>Modelo:</label>
      <input type="text" class="form-control" placeholder="Ex: Uno" name="modelo">
    </div>
    <div class="form-group">
      <label>Ano (modelo):</label>
      <input type="text" class="form-control" placeholder="Ex: 2014" name="anoMod">
    </div>
    <button type="submit" class="btn btn-default">Cadastrar</button>
  </form>
</div>


</div>

</body>
</html>