package ec.edu.epn.modelo.servicio;

import ec.edu.epn.conexion.ConexionBD;

public class ServicioDatos {
	
 	public void setCliente (String nombre, String telefono, String telefonoCelular, String direccion, String referencia){
		ConexionBD con = new ConexionBD();		
		con.insertar("INSERT INTO USUARIO (NOMBRES, TELEFONO, TELEFONOCELULAR, DIRECCION, REFERENCIA) VALUES ('"+nombre+"','"+telefono+"','"+telefonoCelular+"','"+direccion+"','"+referencia+"')");		
	}
	
 	public void updatePedido (int inOrd, String lugRef){
 		ConexionBD con = new ConexionBD();	
 		con.insertar("UPDATE ORDEN SET LUGARREFERENCIA = '"+lugRef+"' WHERE CODIGOORDEN = '"+inOrd+"'");
 	}
 }

