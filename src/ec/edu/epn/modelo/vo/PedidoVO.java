package ec.edu.epn.modelo.vo;

public class PedidoVO {
	
	private int codigoPlato;
	private int codigoCategoria;
	private String nombrePlato;
	private String descripcionPlato;
	private double precio;
	private int cantidad;

	public PedidoVO()
	{
		codigoPlato = 0;
		codigoCategoria = 0;
		nombrePlato = "";
		descripcionPlato = "";
		precio = 0.0;
		cantidad = 0;
	}

	public int getCodigoPlato() {
		return codigoPlato;
	}

	public void setCodigoPlato(int codigoPlato) {
		this.codigoPlato = codigoPlato;
	}

	public int getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	public String getDescripcionPlato() {
		return descripcionPlato;
	}

	public void setDescripcionPlato(String descripcionPlato) {
		this.descripcionPlato = descripcionPlato;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
