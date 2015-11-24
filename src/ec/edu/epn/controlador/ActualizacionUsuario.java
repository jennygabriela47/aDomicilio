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

import ec.edu.epn.modelo.servicio.ServicioMenu;
import ec.edu.epn.modelo.vo.DatoClienteVO;
import ec.edu.epn.modelo.vo.RegistroVO;
import ec.edu.epn.modelo.servicio.ServicioActualizarDatos;

/**
 * Servlet implementation class ActualizacionUsuario
 */
@WebServlet("/ActualizacionUsuario")
public class ActualizacionUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizacionUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String telefono = request.getParameter("telefono");
		String clave = request.getParameter("clave");
		HttpSession hs = request.getSession();
		
		if(clave != null  && !clave.equals("")){
			ServicioActualizarDatos sad = new ServicioActualizarDatos();
			int idUsuario = Integer.parseInt((String) hs.getAttribute("idusuario"));
			sad.actualizarUsuario(idUsuario, telefono, clave);	
			DatoClienteVO dc = sad.getUsuario(idUsuario);
			hs.setAttribute("usuario", dc);	
		}
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pageActualizarUsuario.jsp");
		rd.forward(request, response);
	}


}
