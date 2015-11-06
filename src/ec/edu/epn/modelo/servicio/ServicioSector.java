package ec.edu.epn.modelo.servicio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ec.edu.epn.conexion.ConexionBD;

public class ServicioSector {
	
	public List<String> listarSectores(){
		ConexionBD con = new ConexionBD();
		List<String> sectores = new ArrayList<String>();
		String sector = "";
		
		ResultSet rs = con.consultar("select * from sector");
		
		try {
			while(rs.next()){
				sector = rs.getString("NOMBRESECTOR");
				sectores.add(sector);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return sectores; 
	}
}
