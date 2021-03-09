package es.studium.jose;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SevletCalculo
 */
@WebServlet("/SevletCalculo")
public class SevletCalculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SevletCalculo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			doPost(request,response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String operador = (String) request.getParameter("operadorElegido");
		System.out.println("El get: "+operador);
		String ruta;
		if((request.getParameter("numerador1Elegido").isEmpty())||(request.getParameter("numerador2Elegido").isEmpty())) {
			request.setAttribute("error", "Los numeros están vacíos");
			ruta="/Index.jsp";
		}else {
			int numerador1 =Integer.parseInt(request.getParameter("numerador1Elegido"));
			int numerador2 =Integer.parseInt(request.getParameter("numerador2Elegido"));
			String resultado=operadorResultado(operador,numerador1,numerador2);
			if(resultado.equals("no")) {
				request.setAttribute("error", "El operador no es compatible");
				ruta="/Index.jsp";
			}else {
				if((String) request.getAttribute("error")!=null) {
					request.removeAttribute("error");
				}
				ruta="/Resultado.jsp";
				request.setAttribute("resultado", resultado);
				if(operador.equals("suma")) {
				operador="+";
				}
				String operadores =numerador1+" "+operador+" "+numerador2+" = "+resultado;
				request.setAttribute("operandos", operadores);
			}		
			
		}		
		ServletContext servletContext = getServletContext();		
		RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(ruta);
		requestDispatcher.forward(request, response);	
	}
	private String operadorResultado(String operador, int numerador1, int numerador2) {
		String result="";
		switch(operador) {
		case "/":
			result = ""+(numerador1/numerador2);
			break;
		case "*":
			result = ""+(numerador1*numerador2);
			break;
		case "suma":
			result = ""+(numerador1+numerador2);
			break;
		case "-":
			result = ""+(numerador1-numerador2);
			break;
		default:
			result= "no";
			break;
		}
		return result;
	}
}
