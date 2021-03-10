<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<title>Resultado Práctica 6 - Álvaro Santos Breval</title>
</head>
<body>
	<div class="container text-center">
		<h1>Resultado:</h1>
		<br>
		<p class="text-center">
			<%
				if (request.getParameter("resultado") != null)
			{
				out.println("La multiplicación de " + request.getParameter("numero1") + "x" + request.getParameter("numero2") + " es: "
				+ request.getParameter("resultado"));
			}
			%>
		
		<hr></hr>
		<br> <a href="index.html">Volver a inicio</a>
	</div>
</body>
</html>