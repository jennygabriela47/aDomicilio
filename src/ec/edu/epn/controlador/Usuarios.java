package ec.edu.epn.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.modelo.servicio.ServicioListarUsuario;
import ec.edu.epn.modelo.servicio.ServicioMenu;
import ec.edu.epn.modelo.vo.MenuVO;
import ec.edu.epn.modelo.vo.RegistroVO;

/**
 * Servlet implementation class Usuarios
 */
@WebServlet("/Usuarios")
public class Usuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Usuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServicioListarUsuario m = new ServicioListarUsuario();
		List<RegistroVO> u=m.listarUsuario();
		
		//3.1 PUBLICAR LOS DATOS		
		request.setAttribute("usuario", u);
		//3.2 INVOCAR A LA VISTA
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pageAdminUsuarios.jsp");		
		rd.forward(request, response);
	}

	}

