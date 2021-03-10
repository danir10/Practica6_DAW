<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Solución</title>
</head>
<body style="background-color:powderblue;">
<p style="text-align:center;">
<%if (request.getParameter("cuadrado")!=null)
        {
    out.println("El resultado del cuadrado del número " + request.getParameter("numero") + " es: "+"<b>" + request.getParameter("cuadrado") + "</b>");}%>
    
    <p style="text-align:center;"><a class="btn btn-danger" href="index.html">Volver</a></p>

</body>
</html>