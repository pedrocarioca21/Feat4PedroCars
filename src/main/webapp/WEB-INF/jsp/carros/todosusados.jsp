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

<div class="container">
<c:if test="${not empty mensagem}">
<div class="alert alert-info alert-dismissible">
	<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
	<strong>${mensagem}</strong>
</div>
</c:if>

  <h2>Contagem de carros: ${usados.size()}</h2>
  <h3><a href="/telacadcarro">Incluir novo carro</a></h3>


<c:if test="${not empty usados}">
	
	<form action="/todosusadorOrdenar" method="post">
		<div class="input-group">
			<select name="sortBy" class="form-control">
				<option value="placa">Placa</option>
				<option value="modelo">Modelo</option>
				<option value="montadora">Montadora</option>
				<option value="anoMod">Ano modelo</option>
			</select>
			<div class="input-group-btn">
				<button class="btn btn-default" type="submit"><i class="glyphicon-sort-by-alphabet"></i></button>
			</div>
		
		
		</div>
	
	
	
	</form>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Id</th>
				<th>Placa</th>
				<th>Modelo</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
			<tbody>

				<c:forEach var="usado" items="${usados}">
					<tr>
						<td>${usado.id}</td>
						<td>${usado.placa}</td>
						<td>${usado.modelo}</td>
						<td><a href="/consultarCarro/${usado.id}/">Detalhes</a></td>
						<td><a href="/delCarro/${usado.id}/">Excluir</a></td>
					</tr>
				</c:forEach>
				

			</tbody>
	</table>
</c:if>
				<c:if test="${empty usados}">
					<h4>Nenhum carro cadastrado.</h4>
				</c:if>

	

</div>

</body>
</html>