package ec.edu.epn.modelo.servicio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.epn.conexion.ConexionBD;
import ec.edu.epn.modelo.vo.MenuVO;

public class ServicioCambioPlato {

	public List<MenuVO> listarPlato(){
		ConexionBD con = new ConexionBD();		
		List<MenuVO> plato = new ArrayList<MenuVO>(); 		
		
		ResultSet rs = con.consultar("select p.NOMBREPLATO,p.DESCRIPCIONPLATO,p.PRECIO from PLATO p join CATEGORIA c on p.CODIGOCATEGORIA = c.CODIGOCATEGORIA where c.CODIGOCATEGORIA='1'");
		
		try {
			while(rs.next()){
				MenuVO i=new MenuVO();
				i.setNombrePlato(rs.getString(1));
				i.setDescripcionPlato(rs.getString(2));
				i.setPrecio(rs.getDouble(3));
				plato.add(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		return plato; 
	}
	
	public void updatePlato (int codigoP, String nombreP, String descripcionP, double precioP){
		ConexionBD con = new ConexionBD();		
		con.insertar("UPDATE PLATO SET NOMBREPLATO='"+nombreP+"', DESCRIPCIONPLATO='"+descripcionP+"', PRECIO='"+precioP+"' WHERE CODIGOPLATO='"+codigoP+"'");		
	}

	
	

}
