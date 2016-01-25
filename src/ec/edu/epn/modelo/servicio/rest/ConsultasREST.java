package ec.edu.epn.modelo.servicio.rest;

import java.util.ArrayList;
import java.util.List;
import ec.edu.epn.modelo.servicio.ServicioMenu;
import ec.edu.epn.modelo.servicio.ServicioSesion;
import ec.edu.epn.modelo.vo.DatoClienteVO;
import ec.edu.epn.modelo.vo.SesionVO;
import ec.edu.epn.modelo.vo.comboSectorVO;
import javax.ws.rs.*;


//path del servicio
@Path(value="ConsultasREST")
@Produces("application/json")
public class ConsultasREST {

//LOGIN
	@GET
	@Path("/sesion/{usuario}")
	
	public DatoClienteVO sesion (@PathParam("usuario")String usr)
	{
		ServicioSesion es = new ServicioSesion();
		DatoClienteVO edto = es.getUsuario(usr);
		return edto;
	}
	@GET
	@Path("/login/{usuario}/{clave}")
	
	public boolean login (@PathParam("usuario")String usr, @PathParam("clave")String psw)
	{
		ServicioSesion es = new ServicioSesion();
		boolean edto = es.ingresar(usr,psw);
		return edto;
	}
	
	@GET
	@Path("/listarUsuarios")	
		public List<SesionVO> listarUsuarios()
		{
		List<SesionVO> list = new ArrayList<SesionVO>();
		ServicioSesion es = new ServicioSesion();
		
		list = es.listarSesion();		
		
		return list;
		}


/////////////	
/*
@GET
@Path("/listarPedido/{codPedido}")	
	public List<PedidoVO> listarPedido(@PathParam("codPedido")int codPedido)
	{
	List<PedidoVO> list = new ArrayList<PedidoVO>();
	ServicioMenu es = new ServicioMenu();
	
	list = es.listarPedido(codPedido);		
	
	return list;
	}

	*/

//LLENAR UN DETALLE
@GET
@Path("/llenarDetalle/{codOrden}/{codPlato}/{cantidad}")	
	public void setPlatoPedido(@PathParam("codOrden")int codOrden, @PathParam("codPlato")int codPlato, @PathParam("cantidad")int cantidad)
	{

	ServicioMenu list = new ServicioMenu();
	list.setPlatoPedido(codOrden,codPlato,cantidad);

	}
//ELIMINAR UN PEDIDO
@GET
@Path("/eliminarPedido/{codOrden}/{codPlato}")	

public void eliminarPedido(@PathParam("codOrden")int codOrden, @PathParam("codPlato")int codPlato) {
	ServicioMenu list = new ServicioMenu();
	list.delPlatoPedido(codOrden,codPlato);
	
}

//NUEVA ORDEN

@GET
@Path("/nuevaOrden/{codUsr}/{codSuc}")	

public void nuevaOrden(@PathParam("codUsr")int codUsr, @PathParam("codSuc")int codSuc) {
	DatoClienteVO dto1 = new DatoClienteVO();
	comboSectorVO dto2 = new comboSectorVO();
	ServicioMenu list = new ServicioMenu();
	dto1.setCodigo(codUsr);
	dto2.setCodigo(codSuc);
	
	list.setOrden(codUsr, codSuc);
	
}

}
