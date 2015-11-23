package ec.edu.epn.modelo.servicio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.epn.conexion.ConexionBD;
import ec.edu.epn.modelo.vo.SucursalVO;


public class ServicioSucursal {
	
	public List<SucursalVO> listarSucursales(){
		ConexionBD con = new ConexionBD();		
		List<SucursalVO> sucursal = new ArrayList<SucursalVO>(); 		
		
		ResultSet rs = con.consultar("select NOMBRESUCURSAL, DIRECCIONSUCURSAL from SUCURSAL");
		
		try {
			while(rs.next()){
				SucursalVO i=new SucursalVO();
				i.setNombreS(rs.getString(1));
				i.setDireccionS(rs.getString(2));
				
				sucursal.add(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		return sucursal; 
	}
	

}
