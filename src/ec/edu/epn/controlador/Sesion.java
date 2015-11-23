package ec.edu.epn.controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.epn.modelo.servicio.ServicioSesion;
import ec.edu.epn.modelo.vo.DatoClienteVO;

/**
 * Servlet implementation class Sesion
 */
@WebServlet("/Sesion")
public class Sesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sesion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	ServicioSesion ss = new ServicioSesion();
	String nombre = request.getParameter("usuario");
	String clave = request.getParameter("clave");
	
	if(nombre != null && !nombre.equals("")){
		if(ss.ingresar(nombre, clave)){
			HttpSession hs = request.getSession();
			DatoClienteVO dc = new DatoClienteVO();
			dc = ss.getUsuario(nombre);
			hs.setAttribute("usuario", dc);	
			String idusuario = String.valueOf(dc.getCodigo());			
			hs.setAttribute("idusuario", idusuario);		
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/Inicio");		
		rd.forward(request, response);
	}
	else{
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pageInicioSesion.jsp");		
		rd.forward(request, response);
	}
	
}


}
