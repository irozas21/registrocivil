package cl.inacap.Registrocivil.dto;

public class IngresoSolicitud {

	
	private int Rut; 
	private boolean validarRut;
	private String Nombre; 
	private String Apellido; 
	private String TipoSolicitud;
	public int getRut() {
		return Rut;
	}
	public void setRut(int rut) {
		Rut = rut;
	}
	public boolean isValidarRut() {
		return validarRut;
	}
	public void setValidarRut(boolean validarRut) {
		this.validarRut = validarRut;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getTipoSolicitud() {
		return TipoSolicitud;
	}
	public void setTipoSolicitud(String tipoSolicitud) {
		TipoSolicitud = tipoSolicitud;
	}
	
	} 
	
