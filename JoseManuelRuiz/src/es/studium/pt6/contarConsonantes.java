package es.studium.pt6;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class contarConsonantes extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse respuesta)
			throws ServletException, IOException {

		String cadena = request.getParameter("frase");
		int contadorLet = 0;

		for(int i = 0; i < cadena.length(); i ++) { 
			char car = cadena.charAt(i);
			if (car == 'A' || car == 'E' || car == 'I' || car == 'O' || car == 'U' || car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u') {
				contadorLet++;
			}
		}

		response(respuesta, "La frase tiene " + (cadena.length() - contadorLet) + " consonantes");
	}

	private void response(HttpServletResponse respuesta, String mensaje)
			throws IOException {
		PrintWriter out = respuesta.getWriter();
		out.println("<html lang=\"es\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"utf-8\">\r\n" + 
				"    <title>Práctica Tema 6</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" +
				"	<h3>Contar consantes</h3>\r\n"+ 
				"	<div class=\"container mt-3\">\r\n" + 
				"      <div class=\"row\">\r\n" + 
				"        <div class=\"col-12 text\">");
		out.println("<p> La cadena resultante es: " + mensaje + "</p></div></div></div>");
		out.println("</body>");
		out.println("</html>");
	}
}
