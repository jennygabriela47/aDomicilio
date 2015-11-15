package ec.edu.epn.modelo.servicio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.epn.conexion.ConexionBD;
import ec.edu.epn.modelo.vo.RegistroVO;

public class ServicioListarUsuario {
	public List<RegistroVO> listarUsuario(){
		ConexionBD con = new ConexionBD();		
		List<RegistroVO> usuario = new ArrayList<RegistroVO>(); 		
		
		ResultSet rs = con.consultar("select Nombres, telefono, telefonocelular, direccion, referencia from USUARIO");
		
		try {
			while(rs.next()){
				RegistroVO i=new RegistroVO();
				i.setNombreU(rs.getString(1));
				i.setApellidoU(rs.getString(2));
				i.setEmailU(rs.getString(3));
				i.setTelefonoU(rs.getString(4));
				i.setClaveU(rs.getString(5));
				usuario.add(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		return usuario; 
	}
	
}
