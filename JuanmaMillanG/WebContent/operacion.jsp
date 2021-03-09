<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Solución</title>
</head>
<body style="background-color:powderblue;">
<p style="text-align:center;">
<%if (request.getParameter("cuadrado")!=null)
        {
    out.println("El resultado del cuadrado del número " + request.getParameter("numero") + " es: "+"<b>" + request.getParameter("cuadrado") + "</b>");}%>
</p>
</body>
</html>