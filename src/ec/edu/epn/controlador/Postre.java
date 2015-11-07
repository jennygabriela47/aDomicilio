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

@WebServlet("/Postre")
public class Postre extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Postre() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServicioMenu m = new ServicioMenu();
		List<MenuVO> mn=m.listarPostres();
		
		//3.1 PUBLICAR LOS DATOS		
		request.setAttribute("postres", mn);
		//3.2 INVOCAR A LA VISTA
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pagePostre.jsp");		
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
