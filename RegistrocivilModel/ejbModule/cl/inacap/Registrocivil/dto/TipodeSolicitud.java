package cl.inacap.Registrocivil.dto;

import java.util.List;

public class TipodeSolicitud {

	private String Solicitudes;
	private List<IngresoSolicitud>Solicitud;
	public String getSolicitudes() {
		return Solicitudes;
	}
	public void setSolicitudes(String solicitudes) {
		Solicitudes = solicitudes;
	}
	public List<IngresoSolicitud> getSolicitud() {
		return Solicitud;
	}
	public void setSolicitud(List<IngresoSolicitud> solicitud) {
		Solicitud = solicitud;
	}
	
	
	
}
