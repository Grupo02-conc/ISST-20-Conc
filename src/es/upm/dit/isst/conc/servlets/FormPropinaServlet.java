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
@WebServlet("/FormPropinaServlet")
public class FormPropinaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public FormPropinaServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
		List<Ayuda> ayudas = (List<Ayuda>) AyudaDAOImplementation.getInstance().readAll();
		req.getSession().setAttribute("ayudas", ayudas);	//Para poder sacarlo en el .jsp
		req.getSession().setAttribute("clientes", clientes);
             
              getServletContext().getRequestDispatcher("/PropinaDada.jsp")
             .forward(req,resp);
	}



}