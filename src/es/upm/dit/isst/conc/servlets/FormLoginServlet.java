package es.upm.dit.isst.conc.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.conc.dao.*;
import es.upm.dit.isst.conc.model.*;


/**
 * Servlet implementation class FormLoginServlet
 */
@WebServlet("/FormLoginServlet")
public class FormLoginServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormLoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	private final String ADMIN_EMAIL = "root";
	private final String ADMIN_PASSWORD = "root";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String dni = req.getParameter("dni");
		String room = req.getParameter("room");
		
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
		List<Ayuda> ayudas = (List<Ayuda>) AyudaDAOImplementation.getInstance().readAll();
		Client client = ClientDAOImplementation.getInstance().login(dni, room);
		if( ADMIN_EMAIL.equals(dni) && ADMIN_PASSWORD.equals(room) ) {
			req.getSession().setAttribute("admin", true);
			req.getSession().setAttribute("clientes", clientes);
			getServletContext().getRequestDispatcher("/Admin.jsp").forward(req,resp);

		} else if ( null != client ) {
			req.getSession().setAttribute("cliente", ClientDAOImplementation.getInstance().read(client.getEmail()));
			req.getSession().setAttribute("ayudas", ayudas);
			getServletContext().getRequestDispatcher("/Client.jsp").forward(req,resp);
		} else {
			getServletContext().getRequestDispatcher("/index.html").forward(req,resp);
		}
	}


}
