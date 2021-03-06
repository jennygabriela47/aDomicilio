package ec.edu.epn.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD  {

	private Connection conexion = null;
	private String servidor = "localhost";
	private String usuario = "moviles";
	private String password = "moviles";
	private String url = "jdbc:sqlserver://" + servidor + ":1433";
	
	public ConexionBD() 
	{
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			this.conexion = DriverManager.getConnection(url,usuario,password);
			if (conexion != null) 
			{
				System.out.println("Conexion a Base de Datos " + url + " . . . . .Ok");
			} 
			else 
			{
				System.out.println("Conexion FALLIDA " + url);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public ResultSet consultar(String sql) 
	{
		ResultSet resultado;
		try 
		{
			//System.out.println(sql);
			Statement sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			resultado = sentencia.executeQuery(sql);
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
			return null;
		}
		return resultado;
	}
	
	public void insertar(String sql) 
	{
		try 
		{
			System.out.println(sql);
			Statement sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			sentencia.executeUpdate(sql);
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
}
