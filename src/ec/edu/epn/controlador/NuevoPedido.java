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
import ec.edu.epn.modelo.vo.PedidoVO;

/**
 * Servlet implementation class PedidoInicio
 */
@WebServlet("/NuevoPedido")
public class NuevoPedido extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NuevoPedido() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs = request.getSession();
		String sucursalStr = request.getParameter("idsucursal");
		int sucursalInt = Integer.parseInt(sucursalStr);
		String idusuarioStr = (String) hs.getAttribute("idusuario");
		int idusuarioInt = Integer.parseInt(idusuarioStr);
		
		ServicioMenu sm = new ServicioMenu();
		
		int codPedidoInt = sm.setOrden(idusuarioInt, sucursalInt);
		String codPedido = String.valueOf(codPedidoInt);
		hs.setAttribute("codPedido", codPedido);
		
		List<PedidoVO> ls = new ArrayList<PedidoVO>();
		ls = sm.listarPedido(codPedidoInt);
		
		request.setAttribute("pedido", ls);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pageSegunda.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
