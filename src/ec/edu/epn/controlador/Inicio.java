package ec.edu.epn.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.modelo.servicio.ServicioSector;


/**
 * Servlet implementation class ListarSector
 */
@WebServlet("/Inicio")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Inicio() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServicioSector s = new ServicioSector();
		List<String> li =	s.listarSectores();
		//3.1 PUBLICAR LOS DATOS
		request.setAttribute("comboSector", li);
		//3.2 INVOCAR A LA VISTA
		
		
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pageInicio.jsp");
		rd.forward(request, response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
