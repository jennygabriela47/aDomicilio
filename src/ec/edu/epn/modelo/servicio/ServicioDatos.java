package ec.edu.epn.modelo.servicio;

import java.sql.*;
import ec.edu.epn.conexion.ConexionBD;

public class ServicioDatos {
	
	public void insertar() throws ClassNotFoundException,SQLException
	{
		//Daniel fijaraste que se inserte datos porq solo estabamos probadno si funconaba pero no sabemos
		ConexionBD cn = new ConexionBD();
	
		String consulta = "INSERT INTO USUARIO (NOMBRES, TELEFONO, TELEFONOCELULAR, DIRECCION, REFERENCIA) VALUES (?,?,?,?,?)";
		PreparedStatement st1 = cn.getConexion().prepareStatement(consulta);
		st1.setString(1, "");
		st1.setString(2, "");
		st1.setString(3, "");
		st1.setString(4, "");
		st1.setString(5, "");
		st1.executeUpdate();
	}
	
}

