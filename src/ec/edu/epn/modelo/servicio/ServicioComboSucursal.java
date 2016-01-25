package ec.edu.epn.modelo.servicio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.epn.conexion.ConexionBD;
import ec.edu.epn.modelo.vo.comboSectorVO;

public class ServicioComboSucursal {
	
	public List<comboSectorVO> llenarSucursal(){
		ConexionBD con = new ConexionBD();		
		List<comboSectorVO> sucursal = new ArrayList<comboSectorVO>(); 		
		
		ResultSet rs = con.consultar("select CODIGOSUCURSAL,nombresucursal from SUCURSAL");
		
		
		try {
			while(rs.next()){
				comboSectorVO i=new comboSectorVO();
				i.setCodigo(rs.getInt(1));
				i.setNombre(rs.getString(2));
				
				
				sucursal.add(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		return sucursal; 
	}
	
}
