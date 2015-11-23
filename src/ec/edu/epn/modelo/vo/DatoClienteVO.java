package ec.edu.epn.modelo.vo;

public class DatoClienteVO {

	private int codigo;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private String contrasenia;
	
	public DatoClienteVO()	{
		codigo=0;
		nombre="";
		apellido="";
		telefono="";
		correo="";
		contrasenia="";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}	
}
