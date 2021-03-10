package es.studium.practica6DAW;

import java.io.*;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/practicaServlet")
public class practicaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public practicaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Obtenemos un objeto Print Writer para enviar respuesta
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession(true);
		ServletContext servletContext = getServletContext();
		RequestDispatcher requestDispatcher = null;
		String nombre = request.getParameter("nombre");
		String ruta;
		String edad = request.getParameter("edad");
		if (nombre.isEmpty() || nombre == null) 
		{
			requestDispatcher = servletContext.getRequestDispatcher("/index.html");
			requestDispatcher.forward(request, response);
		} 
		else 
		{
			session.setAttribute("nombre", nombre.toUpperCase());
			requestDispatcher = servletContext.getRequestDispatcher("/resultado.jsp");
			requestDispatcher.forward(request, response);
		}
		
		if (edad.isEmpty())
		{
			request.setAttribute("error", "Los numeros están vacíos");
			ruta="/pagina.html";
		} 
		else 
		{
			session.setAttribute("edad", new StringBuilder(edad));
			requestDispatcher = servletContext.getRequestDispatcher("/resultado.jsp");
			requestDispatcher.forward(request, response);
		}
	}
		/*
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Date date = new Date();
		pw.println("<!DOCTYPE html>\n"+
		"<html>\n"+
		"<head><title>Datos</title></head>\n"+
		"<body>\n"+
		"<h2>Datos introduccidos:</h2>\n"+
		"<ul>\n"+
		"Te llamas " + request.getParameter("nombre")+""+
		" y tienes " +request.getParameter("edad")+ " años.<br>\n"+
		"Realizado el: " + date.toString() +
		"<body></html>");
		*/
	}