package cl.inacap.Registrocivil.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.Registrocivil.dto.IngresoSolicitud;

@Local
public interface SolicitudesDAOLocal<Solicitudes> {

	void save(IngresoSolicitud solicitud);

	List<IngresoSolicitud> getAll();
	
	 
}
