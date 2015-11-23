package ec.edu.epn.modelo.servicio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.epn.conexion.ConexionBD;
import ec.edu.epn.modelo.vo.PedidosVO;

public class ServicioListarPedidos {
	
	public List<PedidosVO> listarPedidos(){
		ConexionBD con = new ConexionBD();		
		List<PedidosVO> pedidos = new ArrayList<PedidosVO>(); 		
		
		ResultSet rs = con.consultar("select u.NOMBREUSUARIO, u.APELLIDOUSUARIO, u.TELEFONOUSUARIO, o.TOTAL, o.LUGARREFERENCIA, s.NOMBRESUCURSAL from ORDEN o INNER JOIN USUARIO u ON o.CODIGOUSUARIO = u.CODIGOUSUARIO INNER JOIN SUCURSAL s ON o.CODIGOSUCURSAL = s.CODIGOSUCURSAL");
		
		try {
			while(rs.next()){
				PedidosVO i=new PedidosVO();
				i.setNombreP(rs.getString(1));
				i.setApellidoP(rs.getString(2));
				i.setTelefonoP(rs.getString(3));
				i.setTotalP(rs.getString(4));
				i.setLugarReferenciaP(rs.getString(5));
				i.setSucursal(rs.getString(6));
				pedidos.add(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		return pedidos; 
	}
	
	public List<PedidosVO> listarPedidosBuscar(String sucursal){
		ConexionBD con = new ConexionBD();		
		List<PedidosVO> pedidos = new ArrayList<PedidosVO>(); 		
		
		ResultSet rs = con.consultar("select u.NOMBREUSUARIO, u.APELLIDOUSUARIO, u.TELEFONOUSUARIO, o.TOTAL, o.LUGARREFERENCIA, s.NOMBRESUCURSAL from ORDEN o INNER JOIN USUARIO u ON o.CODIGOUSUARIO = u.CODIGOUSUARIO INNER JOIN SUCURSAL s ON o.CODIGOSUCURSAL = s.CODIGOSUCURSAL WHERE s.NOMBRESUCURSAL LIKE '%"+sucursal+"%'");
		
		try {
			while(rs.next()){
				PedidosVO i=new PedidosVO();
				i.setNombreP(rs.getString(1));
				i.setApellidoP(rs.getString(2));
				i.setTelefonoP(rs.getString(3));
				i.setTotalP(rs.getString(4));
				i.setLugarReferenciaP(rs.getString(5));
				i.setSucursal(rs.getString(6));
				pedidos.add(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		return pedidos; 
	}

}
