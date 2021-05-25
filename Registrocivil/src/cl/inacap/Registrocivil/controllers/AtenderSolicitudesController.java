package cl.inacap.Registrocivil.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AtenderSolicitudesController
 */
@WebServlet("/AtenderSolicitudesController.do")
public class AtenderSolicitudesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AtenderSolicitudesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<AgregarSolicitudes> agrgarsolicitudes = consolasDAO.getAll();
		
		if(request.getParameter("SolicitudEliminar") !=null) {
			String nombre = request.getParameter("SolicitudesEliminar").trim();
			
			List<AgregarSolicitudes> = busqueda = SolicitudesDAO.filterSolicitudes(Solicitudes); 
			Solicitudes solicitudesAEliminar = busqueda.isEmpty()? null:busqueda.get(0); 
			if(SolicitudesAEliminar != null) { 
				consolasDAO.delete(consolasAEliminar); 
			}
			
			
		request.getRequestDispatcher("WEB-INF/paginas/AtenderSolicitudes.jsp").forward(request, response); 
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
