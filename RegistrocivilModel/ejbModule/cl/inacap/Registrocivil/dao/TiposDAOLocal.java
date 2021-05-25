package cl.inacap.Registrocivil.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.Registrocivil.dto.IngresoSolicitud;

@Local
public interface TiposDAOLocal<Solicitud> {

	void save(IngresoSolicitud solicitudes);
	List<Solicitud>getAll();
	void delete(IngresoSolicitud solicitudes); 
	
}
