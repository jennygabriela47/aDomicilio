package ec.edu.epn.modelo.vo;

public class PedidosVO {
	private String NombreP;
	private String DireccionP;
	private String LugarP;
	private String TelefonoP;
	private String SucursalP;
	
public PedidosVO(){
	NombreP="";
	DireccionP="";
	LugarP="";
	TelefonoP="";
	SucursalP="";
	
}

public String getNombreP() {
	return NombreP;
}

public void setNombreP(String nombreP) {
	NombreP = nombreP;
}

public String getDireccionP() {
	return DireccionP;
}

public void setDireccionP(String direccionP) {
	DireccionP = direccionP;
}

public String getLugarP() {
	return LugarP;
}

public void setLugarP(String lugarP) {
	LugarP = lugarP;
}

public String getTelefonoP() {
	return TelefonoP;
}

public void setTelefonoP(String telefonoP) {
	TelefonoP = telefonoP;
}

public String getSucursalP() {
	return SucursalP;
}

public void setSucursalP(String sucursalP) {
	SucursalP = sucursalP;
}


}
