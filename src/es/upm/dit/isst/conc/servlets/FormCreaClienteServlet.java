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
@WebServlet("/FormCreaClienteServlet")
public class FormCreaClienteServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public FormCreaClienteServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String tlf = req.getParameter("tlf");
		String dni = req.getParameter("dni");
		String room = req.getParameter("room");
		
		Client client = new Client();
		client.setEmail(email);
		client.setPassword(password);
		client.setName(name);
		client.setTlf(tlf);
		client.setDni(dni);
		client.setRoom(room);
		
		
		ClientDAOImplementation.getInstance().create(client);
		resp.sendRedirect (req.getContextPath() + "/NewClient.jsp");
//		List<Client> lp = new ArrayList<Client>();
//		lp.addAll((List<Client>)
//		req.getSession().getAttribute("clientes"));
//		lp.add (client);
//		req.getSession().setAttribute("cliente", lp);
//		getServletContext().getRequestDispatcher("/NewClient.jsp").forward(req,resp);
	}



}
