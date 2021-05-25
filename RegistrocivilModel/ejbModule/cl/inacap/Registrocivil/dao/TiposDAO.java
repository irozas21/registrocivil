package cl.inacap.Registrocivil.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.Registrocivil.dto.IngresoSolicitud;

/**
 * Session Bean implementation class TiposDAO
 */
@Stateless
@LocalBean
public class TiposDAO implements TiposDAOLocal {

	private static List<Solicitudes> solicitud = new arrayList<>();
    /**
     * Default constructor. 
     */
    public TiposDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(IngresoSolicitud solicitudes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List getAll() {
		return Solicitudes.stream().filter(S->s).getNombre().toLowerCase().contains(nombre.tolowerCase()))
	.collect(collectors.toList());
	

	@Override
	public void delete(IngresoSolicitud solicitudes) {
		// TODO Auto-generated method stub
		
		
	
		
	}

}
