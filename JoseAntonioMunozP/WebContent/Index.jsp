<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String resultado=(String)request.getAttribute("error");%>
<!DOCTYPE html>
<html lang="es">
<head>
		<meta charset="UTF-8">
		<title>Práctica web--Calculador</title>
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<link rel="stylesheet" href="./bootstrap-4.3.1-dist/css/bootstrap.min.css">
</head>
<body>
<form method="POST" action="/JoseAntonioMunozP/SevletCalculo">
	<div class="container">
		<div class="row">
			<div class="col-12 text-center mt-3">
				<h1>José Antonio Muñoz Periáñez</h1>
				<h2>Operación</h2>
			</div>
		</div>
		<div class="row">
		
			<div class="col-12 col-sm-6 col-md-4 mt-3 text-center">
				<label for="operadorElegido">Operador</label> 
				<select name="operadorElegido" class="form-control">
					<option value="suma">Suma</option>
					<option value="-">Resta</option>
					<option value="/">División</option>
					<option value="*">Multiplicar</option>
				</select>
			</div>
			<div class="col-12 col-sm-6 col-md-4 text-center mt-3">
				<label for="numerador1Elegido">Número 1</label> 
				<input type="number"min=0 class="form-control" id="numerador1Elegido" name="numerador1Elegido">
			</div>
			<div class="col-12 col-sm-12 col-md-4 text-center mt-3">
				<label for="numerador2Elegido">Número 2</label> 
				<input type="number"min=0 class="form-control" id="numerador2Elegido" name="numerador2Elegido">
			</div>
			
		</div>
		<div class="row">
			<div class="col-12 col-sm-12 mt-2 text-center mt-3">				
				<input type="submit" class="btn btn-lg btn-success" id="enviar">							
			</div>			
		</div>
		<div class="row">
			<div class="col-12 mt-3 text-center text-white bg-danger">
				<%if(resultado!=null){ %>
					<%=resultado %>
				<%} %>
			</div>
		</div>
	</div>
	</form>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="./bootstrap-4.3.1-dist/js/bootstrap.bundle.min.js"></script>	
</body>
</html>