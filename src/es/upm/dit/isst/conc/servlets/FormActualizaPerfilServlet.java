package es.upm.dit.isst.conc.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.conc.dao.ClientDAOImplementation;
import es.upm.dit.isst.conc.model.Client;

/**
 * Servlet implementation class FormCreaProfesorServlet
 */
@WebServlet("/FormActualizaPerfilServlet")
public class FormActualizaPerfilServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public FormActualizaPerfilServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	
    	
    	String email = req.getParameter("email");
		
		Client Client = ClientDAOImplementation.getInstance().read(email);
		ClientDAOImplementation.getInstance().delete(Client);
		
		String new_email = req.getParameter("new_email");
		String new_password = req.getParameter("new_password");
		String name = req.getParameter("name");
		String tlf = req.getParameter("tlf");
		String dni = req.getParameter("dni");
		String room = req.getParameter("room");
		
		Client cliente = new Client();
		cliente.setEmail(new_email);
		cliente.setPassword(new_password);
		cliente.setName(name);
		cliente.setDNI(dni);
		cliente.setRoom(room);
		cliente.setTlf(tlf);
		
		
		
		
		ClientDAOImplementation.getInstance().create(cliente);
		/*List<Client> lp = new ArrayList<Client>();
		lp.addAll((List<Client>)
		req.getSession().getAttribute("clientes"));
		lp.add (cliente);
		req.getSession().setAttribute("cliente", lp);*/
		getServletContext().getRequestDispatcher("/PerfilActualizado.jsp").forward(req,resp);
	}



}
