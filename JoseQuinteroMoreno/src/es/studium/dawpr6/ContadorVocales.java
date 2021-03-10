package es.studium.dawpr6;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContadorVocales extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		String palabra = req.getParameter("palabra");
		String word = palabra;
		palabra = palabra.toUpperCase();
		int i = 0;
		int contador = 0;
		
		for(i = 0; i < palabra.length(); i++)
		{
			if (palabra.charAt(i) == 'A' || palabra.charAt(i) == 'E' || palabra.charAt(i) == 'I' || palabra.charAt(i) == 'O' || palabra.charAt(i) == 'U') {
				contador++;
			}
		}
		
		req.setAttribute("contador", contador);
		req.setAttribute("palabra", word);
		
		ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/vocalescontadas.jsp");
        requestDispatcher.forward(req, resp);
        
	}
}
