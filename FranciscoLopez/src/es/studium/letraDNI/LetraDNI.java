//Código de Francisco López
package es.studium.letraDNI;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LetraDNI
 */
@WebServlet("/controller")
public class LetraDNI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LetraDNI() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		if(request.getParameter("num")!=null) {
			int numeroDNI = Integer.parseInt(request.getParameter("num"));
			
			int resto = numeroDNI%23;
			String letra = "";
			
			switch(resto){
	        case 0: letra = "T";
	        break;
	        case 1: letra = "R";
	        break;
	        case 2: letra = "W";
	        break;
	        case 3: letra = "A";
	        break;
	        case 4: letra = "G";
	        break;
	        case 5: letra = "M";
	        break;
	        case 6: letra = "Y";
	        break;
	        case 7: letra = "F";
	        break;
	        case 8: letra = "P";
	        break;
	        case 9: letra = "D";
	        break;
	        case 10: letra = "X";
	        break;
	        case 11: letra = "B";
	        break;
	        case 12: letra = "N";
	        break;
	        case 13: letra = "J";
	        break;
	        case 14: letra = "Z";
	        break;
	        case 15: letra = "S";
	        break;
	        case 16: letra = "Q";
	        break;
	        case 17: letra = "V";
	        break;
	        case 18: letra = "H";
	        break;
	        case 19: letra = "L";
	        break;
	        case 20: letra = "C";
	        break;
	        case 21: letra = "K";
	        break;
	        case 22: letra = "E";
	        break;
			}
			
			PrintWriter out = response.getWriter();
			
			out.println("<html>");
			out.println("<head><title>Letra DNI - Francisco López</title>  <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css' rel='stylesheet'>");
			out.print("<style>h1{margin-top:3rem;}</style>");
			out.println("</head>");
			out.println("<body>");
			out.println("<div class='container'>");
				out.println("<div class='row'>");
					out.println("<div class='col-12'>");
						out.println("<h1>La letra de tu dni es: "+letra+"</h1>");
						out.println("<h2>DNI completo: "+(numeroDNI+letra)+"</h2>");
					out.println("</div>");
				out.println("</div>");
				out.println("<div class='row'>");
					out.println("<div class='col-12'>");
						out.println("<a href='./index.html' class='btn btn-warning'>Volver</a>");
					out.println("</div>");
				out.println("</div>");
			out.println("</div>");
			out.println("</body></html>");
		}
	}

}
