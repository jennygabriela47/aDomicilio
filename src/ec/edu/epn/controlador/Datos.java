package ec.edu.epn.controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.modelo.servicio.ServicioMenu;

@WebServlet("/Datos")
public class Datos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Datos() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServicioMenu sm = new ServicioMenu();
		int codOrden = Integer.parseInt(request.getParameter("codPedido"));
		double subtotal = Double.parseDouble(request.getParameter("subtotal"));
		double total = Double.parseDouble(request.getParameter("total"));
		sm.updateOrden(codOrden, subtotal, total);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pageDatos.jsp");		
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
