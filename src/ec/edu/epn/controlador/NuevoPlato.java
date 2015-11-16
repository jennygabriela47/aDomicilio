package ec.edu.epn.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.epn.modelo.servicio.ServicioCategoria;
import ec.edu.epn.modelo.servicio.ServicioDatos;
import ec.edu.epn.modelo.servicio.ServicioListarUsuario;
import ec.edu.epn.modelo.servicio.ServicioMenu;
import ec.edu.epn.modelo.vo.CategoriaVO;
import ec.edu.epn.modelo.vo.MenuVO;
import ec.edu.epn.modelo.vo.PedidoVO;
import ec.edu.epn.modelo.vo.RegistroVO;

/**
 * Servlet implementation class NuevoPlato
 */
@WebServlet("/NuevoPlato")
public class NuevoPlato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NuevoPlato() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		ServicioMenu sd = new ServicioMenu();
		
		String nombreP = request.getParameter("nombre");
		String descripcionP = request.getParameter("descripcion");
		String precioP = request.getParameter("precio");
		double precioDO = Double.parseDouble(precioP); 
		sd.setPlato(nombreP, descripcionP, precioDO);
		*/
		
		ServicioCategoria m = new ServicioCategoria();
		List<CategoriaVO> u=m.llenarCategoria();
		request.setAttribute("categoria", u);	
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pagePlato.jsp");		
		rd.forward(request, response);
		
	}

}
