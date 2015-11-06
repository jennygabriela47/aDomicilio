package ec.edu.epn.modelo.servicio;

import java.sql.PreparedStatement;

import ec.edu.epn.conexion.ConexionBD;

public class ServicioDatos {
	ConexionBD cn = new ConexionBD();
	
	String sentencia = "INSERT INTO USUARIO VALUES (?, ?, ?, ?, ?)";
	
	
}
