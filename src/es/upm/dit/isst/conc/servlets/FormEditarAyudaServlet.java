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
import es.upm.dit.isst.conc.dao.AyudaDAOImplementation;
import es.upm.dit.isst.conc.model.Ayuda;
import es.upm.dit.isst.conc.model.Client;
import es.upm.dit.isst.conc.model.Ayuda;

/**
 *
 */
@WebServlet("/FormEditarAyudaServlet")
public class FormEditarAyudaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public FormEditarAyudaServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	  
    	
    	String nAyuda = req.getParameter("nAyuda");
		String des = req.getParameter("des");
		String descripcion = req.getParameter("descripcion");
		String dni = req.getParameter("forClient");
		String estado = "solicitado";

		
		Ayuda a = AyudaDAOImplementation.getInstance().read(descripcion);
		AyudaDAOImplementation.getInstance().delete(a);
		
		Ayuda ayuda = new Ayuda();
		ayuda.setDescripcion(des);
		ayuda.setnAyuda(nAyuda);
		ayuda.setEstado(estado);
		ayuda.setDni(dni);
		ayuda.setStatus(1);
		
		AyudaDAOImplementation.getInstance().create(ayuda);
		
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
    	List<Ayuda> ayudas = (List<Ayuda>) AyudaDAOImplementation.getInstance().readAll();
    	req.getSession().setAttribute("ayudas", ayudas); 
    	req.getSession().setAttribute("clientes", clientes);
             
              getServletContext().getRequestDispatcher("/SolicitudEditada.jsp")
             .forward(req,resp);
	}
}
