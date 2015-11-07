package ec.edu.epn.modelo.vo;

public class DatoClienteVO {

	private String nombre;
	private String telefono;
	private String telefonoCelular;
	private String direccion;
	private String referencia;
	
	public DatoClienteVO()
	{
		nombre="";
		telefono="";
		telefonoCelular="";
		direccion="";
		referencia="";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefonoCelular() {
		return telefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
}
