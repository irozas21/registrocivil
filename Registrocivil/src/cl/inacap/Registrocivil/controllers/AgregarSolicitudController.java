package cl.inacap.Registrocivil.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgregarSolicitudController
 */
@WebServlet("/AgregarSolicitudController.do")
public class AgregarSolicitudController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarSolicitudController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/vistas/AgregarSolicitud.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		List<String> errores = new ArrayList<>(); 
		
		String rut = request.getParameter("rut-txt").trim();
		if(rut.isEmpty()) {
			errores.add("Debe Ingresar un Rut Valido");
		}
		String nombredecliente = request.getParameter("Nombredelcliente-txt").trim();
		if(Nombredelcliente.isEmpty()) {
			errores.add("Debe ingresar un nombre");
			
		}
				
		String tipodesolicitud = request.getParameter("tipodesolicitud-select").trim();
		if(tipodesolicitud.isEmpty()) {
			errores.add("Debe Seleccionar una solicitud"); 
		}
		if(errores.isEmpty()) { 
		} else {
			
			request.setAttribute("Mensaje","Numero de solicitud"); 
		} else {		
			request.setAtribute("ERROR","DEBE INGRESAR NUEVAMENTE LOS DATOS");
			}

		}	
}
