package ec.edu.epn.modelo.vo;

public class comboSectorVO {
	
	private int codigo;
	private String nombre;
	
	public comboSectorVO()
	{
		codigo = 0;
		nombre = "";
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
	

}
