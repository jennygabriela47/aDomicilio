package ec.edu.epn.modelo.servicio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.epn.conexion.ConexionBD;
import ec.edu.epn.modelo.vo.DatoClienteVO;
import ec.edu.epn.modelo.vo.SesionVO;

public class ServicioSesion {
	
	public List<SesionVO> listarSesion(){
		ConexionBD con = new ConexionBD();		
		List<SesionVO> sesion = new ArrayList<SesionVO>(); 		
		
		ResultSet rs = con.consultar("select NOMBREUSUARIO, CONTRASENIA from USUARIO");
		
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
	
	public boolean ingresar(String usr,String psw){
		boolean ingresar = false;
		
		ConexionBD con = new ConexionBD();		
		
		ResultSet rs = con.consultar("select CORREOUSUARIO, CONTRASENIA from USUARIO WHERE CORREOUSUARIO like '"+usr+"'");
		
		try {
			while(rs.next()){
/*				SesionVO i=new SesionVO();
				i.setUsuario(rs.getString(1));
				i.setClave(rs.getString(2));	*/
				
				if(usr.equals(rs.getString(1)) && psw.equals(rs.getString(2))){
					ingresar = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}						
		
		return ingresar;
	}
	
	public DatoClienteVO getUsuario(String usr){
		DatoClienteVO dc = new DatoClienteVO();
		
		ConexionBD con = new ConexionBD();		
		
		ResultSet rs = con.consultar("select * from USUARIO WHERE CORREOUSUARIO like '"+usr+"'");
		
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


