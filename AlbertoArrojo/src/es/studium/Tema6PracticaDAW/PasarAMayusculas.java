package es.studium.Tema6PracticaDAW;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PasarAMayusculas")
public class PasarAMayusculas extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("text/html;charset=UTF-8");
	request.setCharacterEncoding("UTF-8");
	
	String texto = request.getParameter("texto");

	PrintWriter out;

	out = response.getWriter();
	out.println("<html>");
	out.println("<head><title>Tema 6 DAW - Alberto Arrojo Carrasco</title>  <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\' crossorigin='anonymous'></head>");
	out.println("<body>");
	out.println(
		"<p class='lead text-center mt-5'>La palabra que escribiste se ha pasado al Servlet por el método POST y el resultado es: <strong>" + funcionMayusculas(texto) + "</strong><br></p>");
	out.println("<div class='text-center'>");
	out.println("<a href='./index.html' class='btn btn-primary'>Volver</a>");
	out.println("</div>");
	out.println("</body></html>");
	

    }
    
    public String funcionMayusculas(String texto) {
	return texto.toUpperCase();
    }

}
