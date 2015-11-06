package ec.edu.epn.modelo.servicio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.epn.conexion.ConexionBD;
import ec.edu.epn.modelo.vo.EntradaVO;

public class ServicioMenu {

	public List<EntradaVO> listarEntradas(){
		ConexionBD con = new ConexionBD();
		//List<String> entradas = new ArrayList<String>();
		List<EntradaVO> entradas = new ArrayList<EntradaVO>(); 
		String entrada = "";
		
		ResultSet rs = con.consultar("select NOMBREPLATO,DESCRIPCIONPLATO,PRECIO from PLATO");
		
		try {
			while(rs.next()){
				EntradaVO i=new EntradaVO();
				i.setNombrePlato(rs.getString(1));
				i.setDescripcionPlato(rs.getString(2));
				i.setPrecio(rs.getDouble(3));
				entradas.add(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return entradas; 
	}
}
