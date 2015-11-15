package ec.edu.epn.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.modelo.servicio.ServicioMenu;
import ec.edu.epn.modelo.vo.MenuVO;

/**
 * Servlet implementation class Menus
 */
@WebServlet("/Menus")
public class Menus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Menus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServicioMenu m = new ServicioMenu();
		List<MenuVO> mn=m.listarEntradas();
		List<MenuVO> pf=m.listarPlatosFuertes();
		List<MenuVO> pos=m.listarPostres();
		List<MenuVO> be=m.listarBebidas();
		//3.1 PUBLICAR LOS DATOS		
		request.setAttribute("entradas", mn);
		request.setAttribute("platosFuertes", pf);
		request.setAttribute("postres", pos);
		request.setAttribute("bebidas", be);
		
		//3.2 INVOCAR A LA VISTA
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pageAdminMenus.jsp");		
		rd.forward(request, response);
	}

}
