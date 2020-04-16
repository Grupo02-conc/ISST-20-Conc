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
import es.upm.dit.isst.conc.model.Ayuda;
import es.upm.dit.isst.conc.model.Client;

/**
 * Servlet implementation class FormCancelarSolicitudServlet.java
 */
@WebServlet("/FormCancelarSolicitudServlet")
public class FormCancelarSolicitudServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public FormCancelarSolicitudServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	  
    	
    	String descripcion = req.getParameter("descripcion");
    	
    	/*Ayuda ayuda = AyudaDAOImplementation.getInstance().read(descripcion);
		AyudaDAOImplementation.getInstance().delete(ayuda);*/
		
		Ayuda ay = AyudaDAOImplementation.getInstance().read(descripcion);
		ay.setStatus(2);
		ay.setEstado("cancelado");
		AyudaDAOImplementation.getInstance().update(ay);
		
		
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
		List<Ayuda> ayudas = (List<Ayuda>) AyudaDAOImplementation.getInstance().readAll();
		req.getSession().setAttribute("ayudas", ayudas);	//Para poder sacarlo en el .jsp
		req.getSession().setAttribute("clientes", clientes);
             
              getServletContext().getRequestDispatcher("/SolicitudCancelada.jsp")
             .forward(req,resp);
	}
}