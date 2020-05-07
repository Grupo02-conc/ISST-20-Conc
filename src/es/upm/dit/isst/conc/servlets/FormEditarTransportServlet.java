package es.upm.dit.isst.conc.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.conc.dao.AyudaDAOImplementation;
import es.upm.dit.isst.conc.dao.ClientDAOImplementation;
import es.upm.dit.isst.conc.dao.TransportDAOImplementation;
import es.upm.dit.isst.conc.model.Ayuda;
import es.upm.dit.isst.conc.model.Client;
import es.upm.dit.isst.conc.model.Transport;

/**
 * Servlet implementation class FormEditarTransportSolicitudServlet.java
 */
@WebServlet("/FormEditarTransportServlet")
public class FormEditarTransportServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public FormEditarTransportServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	  
    	
    	String nReserva = req.getParameter("nReserva");
		String type = req.getParameter("type");
		String date = req.getParameter("date");
		String destination = req.getParameter("destination");
		String addComments = req.getParameter("addComments");

    	

		
		Transport t = TransportDAOImplementation.getInstance().read(nReserva);
		t.setType(type);
		t.setDate(date);
		t.setDestination(destination);
		t.setAddComments(addComments);
		TransportDAOImplementation.getInstance().update(t);
		
		
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
    	List<Transport> transports = (List<Transport>) TransportDAOImplementation.getInstance().readAll();
    	req.getSession().setAttribute("transportes", transports); 
    	req.getSession().setAttribute("clientes", clientes);
             
              getServletContext().getRequestDispatcher("/SolicitudEditada.jsp")
             .forward(req,resp);
	}
}
