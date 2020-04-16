package es.upm.dit.isst.conc.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.conc.dao.ClientDAOImplementation;
import es.upm.dit.isst.conc.dao.TransportDAOImplementation;
import es.upm.dit.isst.conc.model.Client;
import es.upm.dit.isst.conc.model.Transport;


/**
 * Servlet implementation class Form1TransportServlet
 */
@WebServlet("/TransportServlet")
public class TransportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransportServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
		List<Transport> transports = (List<Transport>) TransportDAOImplementation.getInstance().readAll();
		req.getSession().setAttribute("transports", transports);	//Para poder sacarlo en el .jsp
		req.getSession().setAttribute("clientes", clientes);
        getServletContext().getRequestDispatcher("/Transporte.jsp").forward(req,resp);
    }
}
