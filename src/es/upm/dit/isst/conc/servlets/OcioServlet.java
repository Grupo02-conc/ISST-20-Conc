package es.upm.dit.isst.conc.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.conc.dao.ClientDAOImplementation;
import es.upm.dit.isst.conc.dao.OcioDAOImplementation;
import es.upm.dit.isst.conc.model.Client;
import es.upm.dit.isst.conc.model.Ocio;

/**
 * Servlet implementation class OcioServlet
 */
@WebServlet("/OcioServlet")
public class OcioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OcioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
		List<Ocio> ocios = (List<Ocio>) OcioDAOImplementation.getInstance().readAll();
		request.getSession().setAttribute("ocios", ocios);	//Para poder sacarlo en el .jsp
		request.getSession().setAttribute("clientes", clientes);
		getServletContext().getRequestDispatcher("/Ocio.jsp").forward(request,response);
	}

	
}
