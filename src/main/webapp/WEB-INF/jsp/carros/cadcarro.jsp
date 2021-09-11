<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <title>Pedro Car's</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<c:import url="/WEB-INF/jsp/menuNavBar.jsp"/>

<c:set var="titulo" value="Cadastro de Veículos" />
<c:set var="rota" value="/cadcarro" />
<c:set var="metodo" value="post" />
<c:set var="botao" value="Cadastrar" />
<c:set var="editavel" value="true" />


<c:if test="${not empty carroDetalhado }">
	<c:set var="titulo" value="Consulta de Veículo" />
	<c:set var="rota" value="/voltar" />
	<c:set var="metodo" value="get" />
	<c:set var="botao" value="Voltar" />
	<c:set var="editavel" value="false" />
</c:if>


<div>

<div class="container">

  <h2>${titulo}</h2>
  
  <form action="${rota}" method="${metodo}">

	<div class="form-group">
		<label>Vendedor:</label>
		<select  name="usuario.id" class="form-control">
			<c:forEach var="user" items="${usuarios}">
				<option value="${user.id}">${user.nome}</option>
			</c:forEach>
		</select>
	</div>

    <div class="form-group">
      <label>Placa:</label>
      <input type="text" contenteditable="${editavel}" class="form-control" value="${carroDetalhado.placa}" placeholder="Ex: KXH-9932" name="placa">
    </div>
    <div class="form-group">
      <label>Montadora:</label>
      <input type="text" contenteditable="${editavel}" class="form-control" value="${carroDetalhado.montadora}" placeholder="Ex: Fiat" name="montadora">
    </div>
    <div class="form-group">
      <label>Modelo:</label>
      <input type="text" contenteditable="${editavel}" class="form-control" value="${carroDetalhado.modelo}" placeholder="Ex: Uno" name="modelo">
    </div>
    <div class="form-group">
      <label>Ano (modelo):</label>
      <input type="text" contenteditable="${editavel}" class="form-control" value="${carroDetalhado.anoMod}" placeholder="Ex: 2014" name="anoMod">
    </div>
    <button type="submit" class="btn btn-default">${botao}</button>
  </form>
</div>


</div>

</body>
</html>