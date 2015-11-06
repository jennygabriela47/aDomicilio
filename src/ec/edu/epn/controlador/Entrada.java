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
import ec.edu.epn.modelo.vo.EntradaVO;

@WebServlet("/Segunda")
public class Entrada extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Entrada() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		ServicioMenu m = new ServicioMenu();
		List<EntradaVO> mn=m.listarEntradas();
		
		//3.1 PUBLICAR LOS DATOS		
		request.setAttribute("entradas", mn);
		//3.2 INVOCAR A LA VISTA
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/pageEntrada.jsp");		
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
