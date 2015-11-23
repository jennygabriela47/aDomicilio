package ec.edu.epn.modelo.servicio;

import java.sql.ResultSet;
import java.sql.SQLException;

import ec.edu.epn.conexion.ConexionBD;
import ec.edu.epn.modelo.vo.DatoClienteVO;
import ec.edu.epn.modelo.vo.RegistroVO;

public class ServicioActualizarDatos {
	
	public ServicioActualizarDatos(){
		
	}
	
	public void updateUsuario (String codUsuario, String emailU, String telefonoU, String claveU){
		ConexionBD con = new ConexionBD();		
		con.insertar("UPDATE USUARIO SET EMAIL='"+emailU+"', TELEFONOL='"+telefonoU+"', CLAVE='"+claveU+"' WHERE CODIGOUSUARIO='"+codUsuario+"'");		
	}
	
	public void actualizarUsuario (int idUsr,String tel, String psw){
		ConexionBD con = new ConexionBD();
		con.insertar("UPDATE USUARIO SET TELEFONOUSUARIO = '"+tel+"', CONTRASENIA = '"+psw+"' WHERE CODIGOUSUARIO = '"+idUsr+"'");
	}
	
	public DatoClienteVO getUsuario(int usrid){
		DatoClienteVO dc = new DatoClienteVO();
		
		ConexionBD con = new ConexionBD();		
		
		ResultSet rs = con.consultar("select * from USUARIO WHERE CODIGOUSUARIO = '"+usrid+"'");
		
		try {
			while(rs.next()){
				dc.setCodigo(rs.getInt(1));
				dc.setNombre(rs.getString(2));
				dc.setApellido(rs.getString(3));
				dc.setTelefono(rs.getString(4));
				dc.setCorreo(rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}						
		
		return dc;
	}

}
