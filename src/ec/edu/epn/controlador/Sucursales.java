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
public class Sucursales extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sucursales() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ServicioSucursal s = new ServicioSucursal();
		List<String> li =	s.listarSectores();
		//3.1 PUBLICAR LOS DATOS
		request.setAttribute("comboSector", li);
		
		//3.2 INVOCAR A LA VISTA
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pageAdminSucursales.jsp");		
				rd.forward(request, response);
		
		
	}

}
