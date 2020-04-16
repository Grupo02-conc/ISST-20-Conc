package es.upm.dit.isst.conc.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.conc.dao.TransportDAOImplementation;
import es.upm.dit.isst.conc.dao.ClientDAOImplementation;
import es.upm.dit.isst.conc.model.Transport;
import es.upm.dit.isst.conc.model.Client;

/**
 * Servlet implementation class FormCancelarSolicitudServlet.java
 */
@WebServlet("/FormCancelarTransporteServlet")
public class FormCancelarTransporteServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public FormCancelarTransporteServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	  
    	
    	String nReserva = req.getParameter("nReserva");
    	
    	/*Transport ayuda = TransportDAOImplementation.getInstance().read(descripcion);
		TransportDAOImplementation.getInstance().delete(ayuda);*/
		
		Transport t = TransportDAOImplementation.getInstance().read(nReserva);
		t.setStatus("2");
		t.setEstado("Cancelado");
		TransportDAOImplementation.getInstance().update(t);
		
		
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
		List<Transport> transports = (List<Transport>) TransportDAOImplementation.getInstance().readAll();
		req.getSession().setAttribute("transportes", transports);	//Para poder sacarlo en el .jsp
		req.getSession().setAttribute("clientes", clientes);
             
              getServletContext().getRequestDispatcher("/SolicitudCancelada.jsp")
             .forward(req,resp);
	}
}