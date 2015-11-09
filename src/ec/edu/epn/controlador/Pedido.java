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

@WebServlet("/Pedido")
public class Pedido extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Pedido() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
								
		HttpSession hs = request.getSession();
		String codPedido = request.getParameter("codPedido");
		hs.setAttribute("codPedido", codPedido);
		int codPedidoInt = Integer.parseInt(codPedido);
		
		ServicioMenu sm = new ServicioMenu();
		
		for(int i=1;i<=sm.numPlatos();i++){
			String param = request.getParameter("cantidad"+i);
			if(param != null){
				if(!param.equals("")){					
					int cantidad = Integer.parseInt(param);
					
					sm.setPlatoPedido(codPedidoInt, i, cantidad);
				}				
			}
		}
		
		for(int i=1;i<=sm.numPlatos();i++){
			String param = request.getParameter("borrar"+i);
			if(param != null){
				if(!param.equals("")){					
					int cantidad = Integer.parseInt(param);
					sm.delPlatoPedido(codPedidoInt, i);
				}				
			}
		}
		
		List<PedidoVO> ls = new ArrayList<PedidoVO>();
		ls = sm.listarPedido(codPedidoInt);
		
		request.setAttribute("pedido", ls);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/pageSegunda.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
