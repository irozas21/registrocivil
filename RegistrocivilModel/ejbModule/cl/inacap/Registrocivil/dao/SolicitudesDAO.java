package cl.inacap.Registrocivil.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.Registrocivil.dto.IngresoSolicitud;
import cl.inacap.Registrocivil.dto.TipodeSolicitud;

/**
 * Session Bean implementation class SolicitudesDAO
 */
@Stateless
@LocalBean
public class SolicitudesDAO implements SolicitudesDAOLocal {

	private static List<TipodeSolicitud> TipodeSolicitud = newArrayList<>(); 
	/**
     * Default constructor. 
     * @return 
     */
    public Object Solicitud() {
        // TODO Auto-generated constructor stub
    	return Solicitud();
    }

	
	@Override
	public void save(IngresoSolicitud solicitud) {
		solicitud.add(solicitud);
		
	}

	public List<IngresoSolicitud> getAll() {
		return null Solicitud(); 
			
		return Solicitud.stream().filter(S-s>.getNombre().contains(nombre)).collect(Collectors.toList());
	}

}
