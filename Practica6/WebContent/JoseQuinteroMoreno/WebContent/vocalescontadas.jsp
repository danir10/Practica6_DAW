<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Integer contador = (Integer) request.getAttribute("contador");
	String palabra = (String) request.getAttribute("palabra");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practica 6 - Despliegue Aplicaciones Web</title>
<link rel="stylesheet"
	href="./bootstrap-4.0.0/css/bootstrap.min.css">
</head>
<body>
	<div class="content">
		<b>Práctica del Tema 6</b>

		<div class="container text-center">
			<div class="row">
				<div class="col-xl-12">
					<h1 class="mt-2">José Quintero Moreno</h1>
				</div>
			</div>
			<div class="col-xl-12 mt-4 text-center">
				<%
							System.out.println("Cont: " + contador + " - Palabra: " + palabra);
							if (contador != 0 || !palabra.equals("")) {
						%>
					<p>
						La palabra
						<%=palabra%>
						tiene

						<%=contador%> vocales.
					</p>
				<%
							} else {
						%>
				<p>No has introducido ninguna palabra</p>
				<%
							}
						%>
			</div>
		</div>
	</div>
	<p></p>
	<a href="index.html">Volver al Index</a>
	<script src="./bootstrap-4.0.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>