package ec.edu.epn.modelo.servicio;

import ec.edu.epn.conexion.ConexionBD;
import ec.edu.epn.modelo.vo.RegistroVO;

public class ServicioActualizarDatos {
	public void updateUsuario (String codUsuario, String emailU, String telefonoU, String claveU){
		ConexionBD con = new ConexionBD();		
		con.insertar("UPDATE USUARIO SET EMAIL='"+emailU+"', TELEFONOL='"+telefonoU+"', CLAVE='"+claveU+"' WHERE CODIGOUSUARIO='"+codUsuario+"'");		
	}

}
