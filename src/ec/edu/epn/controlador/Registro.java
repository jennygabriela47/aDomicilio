package ec.edu.epn.controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.modelo.servicio.ServicioRegistro ;
import ec.edu.epn.modelo.vo.DatoClienteVO;

/**
 * Servlet implementation class Registro
 */
@WebServlet("/Registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServicioRegistro sr = new ServicioRegistro ();
/*		DatoClienteVO dc = new DatoClienteVO();
		
		dc.setNombre(request.getParameter("nombre"));
		dc.setApellido(request.getParameter("apellido"));
		dc.setTelefono(request.getParameter("telefono"));
		dc.setCorreo(request.getParameter("email"));
		dc.setContrasenia(request.getParameter("clave"));*/		
		
		String nombreU = request.getParameter("nombre");
		String apellidoU = request.getParameter("apellido");
		String telefonoU = request.getParameter("telefono");
		String emailU = request.getParameter("email");
		String claveU = request.getParameter("clave");
		
		
		
		sr.registroUsuario(nombreU, apellidoU, telefonoU, emailU, claveU);
				
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pageRegistro.jsp");		
		rd.forward(request, response);
	}
	
	

}
