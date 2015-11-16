package ec.edu.epn.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.epn.modelo.servicio.ServicioListarPedidos;
import ec.edu.epn.modelo.vo.PedidosVO;

/**
 * Servlet implementation class ListaPedidos
 */
@WebServlet("/ListaPedidos")
public class ListaPedidos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaPedidos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServicioListarPedidos m = new ServicioListarPedidos();
		List<PedidosVO> u=m.listarPedidos();
		
		//3.1 PUBLICAR LOS DATOS		
		request.setAttribute("pedidos", u);
		//3.2 INVOCAR A LA VISTA
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pageAdminPedido.jsp");		
		rd.forward(request, response);
	}

}
