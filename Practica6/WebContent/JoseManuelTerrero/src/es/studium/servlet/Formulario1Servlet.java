package es.studium.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "/Formulario1Servlet", urlPatterns = { "/form1" })
public class Formulario1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Formulario1Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession(true);
		ServletContext servletContext = getServletContext();
		RequestDispatcher requestDispatcher = null;

		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");

		if (nombre.isEmpty() || apellidos.isEmpty() || nombre == null || apellidos == null) {
			requestDispatcher = servletContext.getRequestDispatcher("/formulario1.jsp");
			requestDispatcher.forward(request, response);
		} else {
			session.setAttribute("nombre", new StringBuilder(nombre).reverse().toString());
			session.setAttribute("apellidos", new StringBuilder(apellidos).reverse().toString());

			requestDispatcher = servletContext.getRequestDispatcher("/respuesta1.jsp");
			requestDispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
