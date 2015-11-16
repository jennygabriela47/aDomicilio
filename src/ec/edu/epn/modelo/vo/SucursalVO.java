package ec.edu.epn.modelo.vo;

public class SucursalVO {
	private String NombreS;
	private String DireccionS;
	
	public SucursalVO(){
		NombreS="";
		DireccionS="";
	}

	public String getNombreS() {
		return NombreS;
	}

	public void setNombreS(String nombreS) {
		NombreS = nombreS;
	}

	public String getDireccionS() {
		return DireccionS;
	}

	public void setDireccionS(String direccionS) {
		DireccionS = direccionS;
	}

}
