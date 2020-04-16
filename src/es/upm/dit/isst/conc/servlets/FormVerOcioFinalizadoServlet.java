


package es.upm.dit.isst.conc.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.conc.dao.OcioDAOImplementation;
import es.upm.dit.isst.conc.dao.ClientDAOImplementation;
import es.upm.dit.isst.conc.model.Ocio;
import es.upm.dit.isst.conc.model.Client;

/**
 * Servlet implementation class FormCancelarSolicitudServlet.java
 */
@WebServlet("/FormVerOcioFinalizadoServlet")
public class FormVerOcioFinalizadoServlet  extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public FormVerOcioFinalizadoServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  
    	String nReserva = req.getParameter("nReserva");
    	
    	/*Transport ayuda = TransportDAOImplementation.getInstance().read(descripcion);
		TransportDAOImplementation.getInstance().delete(ayuda);*/
		
		Ocio t = OcioDAOImplementation.getInstance().read(nReserva);
		t.setStatus("5");
		t.setEstado("Completado");
		OcioDAOImplementation.getInstance().update(t);
//		TransportDAOImplementation.getInstance().delete(t);
		
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
		List<Ocio> ocios = (List<Ocio>) OcioDAOImplementation.getInstance().readAll();
		req.getSession().setAttribute("ocios", ocios);	//Para poder sacarlo en el .jsp
		req.getSession().setAttribute("clientes", clientes);
             
              getServletContext().getRequestDispatcher("/SolicitudFinalizada.jsp")
             .forward(req,resp);
	}
}

