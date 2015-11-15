package ec.edu.epn.modelo.servicio;

import ec.edu.epn.conexion.ConexionBD;

public class ServicioRegistro {

	public void registroUsuario (String nombre, String apellidoU, String emailU, String telefonoU, String claveU){
		ConexionBD con = new ConexionBD();		
		con.insertar("INSERT INTO USUARIO (NOMBRES, TELEFONO, TELEFONOCELULAR, DIRECCION, REFERENCIA) VALUES ('"+nombre+"','"+apellidoU+"','"+emailU+"','"+telefonoU+"','"+claveU+"')");		
	}
	

}
