package es.studium.AlternarMayusculasMinusculas;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author José María Ruiz Pérez
 * @version 1.0   07/03/2021
 * description  Servlet class which functionality is to alternate a lower case with an upper case in a string POSTED in a form
 * 
 */
@WebServlet("/AlternarMayusculasMinusculas")
public class AlternarMayusculasMinusculas extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlternarMayusculasMinusculas() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
         PrintWriter out = response.getWriter();

         out.println("<html>");
         out.println("<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"
         		+ "<title>Alternar Cadena</title></head>");         
         out.println("<body>");

         out.println("Cadena de texto transformada:");
         String cadenaForm = request.getParameter("cadena");
         cadenaForm.toLowerCase();
         String cadenaFinal = "";
         for( int i = 0; i < cadenaForm.length(); i++ ) {
        	 if(i%2==0) {
        		 cadenaFinal = cadenaFinal + cadenaForm.toUpperCase().charAt(i);
        	 }else {
        		 cadenaFinal = cadenaFinal + cadenaForm.toLowerCase().charAt(i);
        	 }
         }
         out.println(cadenaFinal);
         
         out.println("</body>");
         out.println("</html>");           
    }

}
