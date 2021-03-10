package es.studium.DAW6LuisAmador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletLuisAmador", urlPatterns = { "/ServletLuisAmador" })
public class ServletLuisAmador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static String mayusculas(String inputCadena)
	{
		return inputCadena.toUpperCase();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String inputCadena = request.getParameter("cadena");
		String cadenaTrasnformada = mayusculas(inputCadena);
		PrintWriter out = response.getWriter();
		try {
			if (inputCadena.isEmpty() || inputCadena == null) {
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<title>Haciendo algo</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h2>¡Cadena vacía o nula!</h2>");
				out.println("<h3>Introduce una cadena de texto</h3>");
				out.println("<button onclick='goBack()'>Volver Atrás</button>");
				out.println("</body>");
				out.println("<script>");
				out.println("function goBack() {");
				out.println("window.history.back();");
				out.println("}");
				out.println("</script>");
				out.println("</body>");
				out.println("</html>");
			} else {
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<title>Haciendo algo</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h2>Esta es tu cadena transformada:</h2>");
				out.println("<h3>"+ cadenaTrasnformada +"</h3>");
				out.println("<button onclick='goBack()'>Volver Atrás</button>");
				out.println("<br/>");
				out.println("<br/>");
				out.println("<form action='index.html'>");
				out.println("<input type='submit' value='Ir al Inicio'/>");
				out.println("</form>");
				out.println("</body>");
				out.println("<script>");
				out.println("function goBack() {");
				out.println("window.history.back();");
				out.println("}");
				out.println("</script>");
				out.println("</body>");
				out.println("</html>");
			}
		} finally {
			out.close();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}