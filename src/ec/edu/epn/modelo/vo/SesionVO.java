package ec.edu.epn.modelo.vo;

public class SesionVO {
	private String usuario;
	private String clave;
	
	
	public SesionVO()
	{
		usuario="";
		clave="";
		
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}
	
	

}
