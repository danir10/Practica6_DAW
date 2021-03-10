package es.studium.contarCaracteres;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet(name = "ContarCaracteresServlet" )
@WebServlet("/ContarCaracteresServlet")
public class ContarCaracteresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ContarCaracteresServlet() {
        super();
    }


    protected void montarHTMLCabecera(PrintWriter out) {
    	out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Contador de caracteres</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Contando...</h2>");
    }
    
    protected void montarHTMLCabeceraCierre(PrintWriter out) {
		out.println("</body>");
		out.println("</html>");
	
    }
    
    protected void montarHTML(PrintWriter out, String texto,String textoEspacio,int caracteres,int caracteresEspacio) {
    	
		out.println("<form method='post' action='ContarCaracteresServlet'>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>Introduce el texto:</td>");
		out.println("<td><textarea name='texto'>" + textoEspacio +"</textarea></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>El texto sin espacios contiene <input value='" + caracteres + "' name='contador' type='text' disabled /> caracteres</td>");
		out.println("<br />");
		out.println("<td>El texto con espacios contiene <input value='" + caracteresEspacio + "' name='contadorEspacios' type='text' disabled /> caracteres</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<br />");
		out.println("<input type='submit' name='Enviar' /> ");
		out.println("</form>");

    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		String texto; // el texto para contar sin espacios
		texto = request.getParameter("texto");
		String textoEspacio; // el texto para contar con espacios
		textoEspacio = request.getParameter("texto");
		int caracteres; // numero de caracteres sin espacios
		caracteres = texto.replaceAll(" ","").length();
		int caracteresEspacio; // numero de caracteres con espacios
		caracteresEspacio = textoEspacio.length();
		
		montarHTMLCabecera(out);
		montarHTML(out, texto, textoEspacio, caracteres, caracteresEspacio);
		montarHTMLCabeceraCierre(out);
		
		out.close();
		
		
			
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
