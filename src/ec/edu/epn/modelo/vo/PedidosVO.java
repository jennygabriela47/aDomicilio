package ec.edu.epn.modelo.vo;

	public class PedidosVO {
		private String nombreP;
		private String apellidoP;
		private String telefonoP;
		private String totalP;
		private String lugarReferenciaP;
		private String sucursal;
		
	public PedidosVO(){		
		nombreP="";
		apellidoP="";
		telefonoP="";
		totalP="";
		lugarReferenciaP="";
		sucursal="";
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getTelefonoP() {
		return telefonoP;
	}

	public void setTelefonoP(String telefonoP) {
		this.telefonoP = telefonoP;
	}

	public String getTotalP() {
		return totalP;
	}

	public void setTotalP(String totalP) {
		this.totalP = totalP;
	}

	public String getLugarReferenciaP() {
		return lugarReferenciaP;
	}

	public void setLugarReferenciaP(String lugarReferenciaP) {
		this.lugarReferenciaP = lugarReferenciaP;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

}
