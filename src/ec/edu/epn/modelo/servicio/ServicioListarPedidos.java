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
		
		ResultSet rs = con.consultar("select Nombres, telefono, telefonocelular, direccion, referencia from USUARIO");
		
		try {
			while(rs.next()){
				PedidosVO i=new PedidosVO();
				i.setNombreP(rs.getString(1));
				i.setDireccionP(rs.getString(2));
				i.setLugarP(rs.getString(3));
				i.setTelefonoP(rs.getString(4));
				i.setSucursalP(rs.getString(5));
				pedidos.add(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		return pedidos; 
	}

}
