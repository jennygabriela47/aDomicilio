package ec.edu.epn.modelo.vo;

public class RegistroVO {
	private String nombreU;
	private String apellidoU;
	private String emailU;
	private String telefonoU;
	private String claveU;
	
	
	public RegistroVO()
	{
		nombreU="";
		apellidoU="";
		emailU="";
		telefonoU="";
		claveU="";
	}


	public String getNombreU() {
		return nombreU;
	}


	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
	}


	public String getApellidoU() {
		return apellidoU;
	}


	public void setApellidoU(String apellidoU) {
		this.apellidoU = apellidoU;
	}


	public String getEmailU() {
		return emailU;
	}


	public void setEmailU(String emailU) {
		this.emailU = emailU;
	}


	public String getTelefonoU() {
		return telefonoU;
	}


	public void setTelefonoU(String telefonoU) {
		this.telefonoU = telefonoU;
	}


	public String getClaveU() {
		return claveU;
	}


	public void setClaveU(String claveU) {
		this.claveU = claveU;
	}

}
