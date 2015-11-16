package ec.edu.epn.modelo.servicio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.epn.conexion.ConexionBD;
import ec.edu.epn.modelo.vo.CategoriaVO;
import ec.edu.epn.modelo.vo.RegistroVO;

public class ServicioCategoria {
	public List<CategoriaVO> llenarCategoria( ){
		ConexionBD con = new ConexionBD();		
		List<CategoriaVO> categoria = new ArrayList<CategoriaVO>(); 		
		
		ResultSet rs = con.consultar("select * from CATEGORIA");
		
		
		try {
			while(rs.next()){
				CategoriaVO i=new CategoriaVO();
				i.setCodigoCategoria(rs.getInt(1));
				i.setNombreCategoria(rs.getString(2));
				
				categoria.add(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		return categoria; 
	}
	
}
