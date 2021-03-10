<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
		<title>Resultado</title>
	</head>
<body>
	<div class="container text-center">
	<h1>Datos Introduccidos:</h1>
	<p class="text-center">
					Tu nombre es:
					<%=session.getAttribute("nombre")%></p>
	<p class="text-center">
					Tu edad es:
					<%=request.getAttribute("edad")%></p>
	<a href="pagina.html">Volver a inicio</a>
	</div>
</body>
</html>