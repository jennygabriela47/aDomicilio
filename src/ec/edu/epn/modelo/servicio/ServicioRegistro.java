package ec.edu.epn.modelo.servicio;

import ec.edu.epn.conexion.ConexionBD;

public class ServicioRegistro {
	
	public ServicioRegistro(){
		
	}

	public void registroUsuario (String nombreU, String apellidoU, String telefonoU, String emailU, String claveU){
		ConexionBD con = new ConexionBD();		
		con.insertar("INSERT INTO USUARIO (NOMBREUSUARIO,APELLIDOUSUARIO, TELEFONOUSUARIO,CORREOUSUARIO, CONTRASENIA) VALUES ('"+nombreU+"','"+apellidoU+"','"+telefonoU+"','"+emailU+"','"+claveU+"')");
	}
}
