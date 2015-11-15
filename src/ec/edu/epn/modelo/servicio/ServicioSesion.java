package ec.edu.epn.modelo.servicio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.epn.conexion.ConexionBD;
import ec.edu.epn.modelo.vo.SesionVO;

public class ServicioSesion {
	
	public List<SesionVO> listarSesion(){
		ConexionBD con = new ConexionBD();		
		List<SesionVO> sesion = new ArrayList<SesionVO>(); 		
		
		ResultSet rs = con.consultar("select NOMBRES, TELEFONO from USUARIO");
		
		try {
			while(rs.next()){
				SesionVO i=new SesionVO();
				i.setUsuario(rs.getString(1));
				i.setClave(rs.getString(2));
				
				sesion.add(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		return sesion; 
	}
 }


