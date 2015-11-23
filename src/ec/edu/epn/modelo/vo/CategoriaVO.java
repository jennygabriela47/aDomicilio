package ec.edu.epn.modelo.vo;

public class CategoriaVO {

	private int codigoCategoria;
	private String nombreCategoria;
	
	public CategoriaVO()
	{
		codigoCategoria=0;
		nombreCategoria="";
		
	}
	public int getCodigoCategoria() {
		return codigoCategoria;
	}
	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	
	
}
