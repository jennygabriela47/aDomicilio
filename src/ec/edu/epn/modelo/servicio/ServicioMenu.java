package ec.edu.epn.modelo.servicio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.epn.conexion.ConexionBD;

public class ServicioMenu {

	public List<String> listarEntradas(){
		ConexionBD con = new ConexionBD();
		//List<String> entradas = new ArrayList<String>();
		ArrayList<String> entradas = new ArrayList<String>(); 
		String entrada = "";
		
		ResultSet rs = con.consultar("select NOMBREPLATO,DESCRIPCIONPLATO,PRECIO from PLATO");
		
		try {
			while(rs.next()){
				entrada = rs.getString("NOMBREPLATO");
				entrada = rs.getString("DESCRIPCIONPLATO");
				entrada = rs.getString("PRECIO");
				entradas.add(entrada);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return entradas; 
	}
}
