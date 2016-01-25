package ec.edu.epn.modelo.servicio.rest;

import java.util.List;

import ec.edu.epn.modelo.servicio.ServicioMenu;
import ec.edu.epn.modelo.vo.PedidoVO;
import ec.edu.epn.modelo.vo.DatoClienteVO;
import ec.edu.epn.modelo.vo.comboSectorVO;

import javax.ws.rs.*;


//path del servicio
@Path(value="ConsultasREST")
@Produces("application/json")
public class ConsultasREST {

	
@GET
@Path(value="listarPedido/{codPedido}")	
	public PedidoVO  listarPedido(@PathParam("codPedido")int codPedido)
	{
	ServicioMenu list = new ServicioMenu();
	PedidoVO vo =  (PedidoVO) list.listarPedido(codPedido);

		return vo;		
	}

@GET
@Path(value="llenarDetalle/{codOrden}/{codPlato}/{cantidad}")	
	public void setPlatoPedido(@PathParam("codOrden")int codOrden, @PathParam("codPlato")int codPlato, @PathParam("cantidad")int cantidad)
	{

	ServicioMenu list = new ServicioMenu();
	list.setPlatoPedido(codOrden,codPlato,cantidad);

	}

@GET
@Path(value="eliminarPedido/{codOrden}/{codPlato}")	

public void eliminarPedido(@PathParam("codOrden")int codOrden, @PathParam("codPlato")int codPlato) {
	ServicioMenu list = new ServicioMenu();
	list.delPlatoPedido(codOrden,codPlato);
	
}
/*
@GET
@Path(value="nuevaOrden/{codUsr}/{codSuc}")	

public int nuevaOrden(@PathParam("codUsr")int codUsr, @PathParam("codSuc")int codSuc) {
	DatoClienteVO dto1 = new DatoClienteVO();
	comboSectorVO dto2 = new comboSectorVO();
	ServicioMenu list = new ServicioMenu();
	dto1.setCodigo(codUsr);
	dto2.setCodigo(codSuc);
	
	list.setOrden(dto1,dto2);
	
}

*/
}
