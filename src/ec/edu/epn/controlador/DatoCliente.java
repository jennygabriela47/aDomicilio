package ec.edu.epn.controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.modelo.servicio.ServicioDatos;
import ec.edu.epn.modelo.servicio.ServicioMenu;

/**
 * Servlet implementation class DatoCliente
 */
@WebServlet("/DatoCliente")
public class DatoCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DatoCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServicioDatos sd = new ServicioDatos();
		String nombres = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		String telefonoCelular = request.getParameter("telefonoCelular");
		String direccion = request.getParameter("direccion");
		String referencia = request.getParameter("referencia");		
		sd.setCliente(nombres, telefono, telefonoCelular, direccion, referencia);
				
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pageDatos.jsp");		
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
