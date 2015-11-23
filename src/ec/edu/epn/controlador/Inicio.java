package ec.edu.epn.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.modelo.servicio.ServicioCategoria;
import ec.edu.epn.modelo.servicio.ServicioComboSucursal;
import ec.edu.epn.modelo.vo.comboSectorVO;

/**
 * Servlet implementation class Sucursal
 */
@WebServlet("/Inicio")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inicio() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServicioComboSucursal m = new ServicioComboSucursal();
		List<comboSectorVO> u=m.llenarSucursal();
		request.setAttribute("sucursal", u);	
		
		
		//3.2 INVOCAR A LA VISTA
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pageInicio.jsp");		
				rd.forward(request, response);
	}

}
