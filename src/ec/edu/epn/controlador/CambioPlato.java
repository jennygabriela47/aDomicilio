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

import ec.edu.epn.modelo.servicio.ServicioActualizarDatos;
import ec.edu.epn.modelo.servicio.ServicioCambioPlato;
import ec.edu.epn.modelo.servicio.ServicioListarUsuario;
import ec.edu.epn.modelo.vo.MenuVO;
import ec.edu.epn.modelo.vo.RegistroVO;

/**
 * Servlet implementation class CambioPlato
 */
@WebServlet("/CambioPlato")
public class CambioPlato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CambioPlato() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServicioCambioPlato sa = new ServicioCambioPlato();
		List<MenuVO> mn=sa.listarPlato();
		
		//3.1 PUBLICAR LOS DATOS		
			request.setAttribute("entrada", mn);
						
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/modificarPlato.jsp");
		rd.forward(request, response);
	
	}

}
