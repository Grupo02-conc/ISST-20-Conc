package es.upm.dit.isst.conc.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.conc.dao.*;
import es.upm.dit.isst.conc.model.*;


/**
 * Servlet implementation class FormCancelarSolicitudServlet.java
 */
@WebServlet("/EditarSolicitudServlet")
public class EditarSolicitudServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public EditarSolicitudServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	  
    	
    	String nAyuda = req.getParameter("nAyuda");
    	
		
		
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
    	List<Ayuda> ayudas = (List<Ayuda>) AyudaDAOImplementation.getInstance().readAll();
    	req.getSession().setAttribute("ayudas", ayudas); 
    	req.getSession().setAttribute("clientes", clientes);
    	req.getSession().setAttribute("nSolicitud", nAyuda);
             
              getServletContext().getRequestDispatcher("/FormEditarAyuda.jsp")
             .forward(req,resp);
	}
}