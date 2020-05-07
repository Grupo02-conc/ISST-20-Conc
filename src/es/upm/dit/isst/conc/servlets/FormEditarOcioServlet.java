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
import es.upm.dit.isst.conc.dao.OcioDAOImplementation;
import es.upm.dit.isst.conc.model.Ayuda;
import es.upm.dit.isst.conc.model.Client;
import es.upm.dit.isst.conc.model.Ocio;

/**
 * Servlet implementation class FormEditarOcioSolicitudServlet.java
 */
@WebServlet("/FormEditarOcioServlet")
public class FormEditarOcioServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public FormEditarOcioServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	  
    	
    	String nReserva = req.getParameter("nReserva");
    	String actividad = req.getParameter("actividad");
    	String fecha = req.getParameter("fecha");
    	String precio = req.getParameter("precio");
    	String addComents = req.getParameter("addComents");
    	

		
		Ocio o = OcioDAOImplementation.getInstance().read(nReserva);
		o.setActividad(actividad);
		o.setFecha(fecha);
		o.setPrecio(precio);
		o.setAddComents(addComents);
		OcioDAOImplementation.getInstance().update(o);
		
		
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
    	List<Ocio> ocios = (List<Ocio>) OcioDAOImplementation.getInstance().readAll();
    	req.getSession().setAttribute("ocio", ocios); 
    	req.getSession().setAttribute("clientes", clientes);
             
              getServletContext().getRequestDispatcher("/SolicitudEditada.jsp")
             .forward(req,resp);
	}
}
