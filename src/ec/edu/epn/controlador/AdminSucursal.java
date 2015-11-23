package ec.edu.epn.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ec.edu.epn.modelo.servicio.ServicioSucursal;
import ec.edu.epn.modelo.vo.SucursalVO;

/**
 * Servlet implementation class Sucursales
 */
@WebServlet("/Sucursales")
public class AdminSucursal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSucursal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServicioSucursal m = new ServicioSucursal();
		List<SucursalVO> s=m.listarSucursales();
		
		//3.1 PUBLICAR LOS DATOS		
		request.setAttribute("sucursal", s);
		//3.2 INVOCAR A LA VISTA
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pageAdminSucursales.jsp");		
		rd.forward(request, response);
		
		
	}

}
