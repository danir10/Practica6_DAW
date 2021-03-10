<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String resultado=(String)request.getAttribute("resultado");%>
<% String operandos=(String)request.getAttribute("operandos");%>
<!DOCTYPE html>
<html lang="es">
<head>
		<meta charset="UTF-8">
		<title>Práctica web--Calculador</title>
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<link rel="stylesheet" href="./bootstrap-4.3.1-dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container text-center">
	<div class="row">
		<div class="col-12">
			<h1 class="mt-2">José Antonio Muñoz Periáñez</h1>
				<h2 class="mt-3">Resultado</h2>
		</div>
	</div>
		<div class="row bg-success text-white mt-2">
			<div class="col-12 mt-3">
				<p>El resultado es: <%= resultado %></p>
			</div>			
		</div>
		<div class="row bg-success text-white">
			<div class="col-12">
				<p>La operación ha sido: <%=operandos %></p>
			</div>			
		</div>
		<div class="row">
			<div class="col-12  mt-3">
				<a class="btn btn-lg btn-danger" href="/JoseAntonioMunozP/">Ir hacia atrás</a>
			</div>			
		</div>
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="./bootstrap-4.3.1-dist/js/bootstrap.bundle.min.js"></script>	
</body>
</html>