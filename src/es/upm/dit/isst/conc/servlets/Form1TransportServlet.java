package es.upm.dit.isst.conc.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.conc.dao.TransportDAOImplementation;
import es.upm.dit.isst.conc.model.Transport;


/**
 * Servlet implementation class Form1TransportServlet
 */
@WebServlet("/Form1TransportServlet")
public class Form1TransportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
     * @see HttpServlet#HttpServlet()
     */
	
    public Form1TransportServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nReserva = req.getParameter("nReserva");
		String dni = req.getParameter("dni");
		String type = req.getParameter("type");
		String date = req.getParameter("date");
		String destination = req.getParameter("destination");
		String addComments = req.getParameter("addComments");
		String status = req.getParameter("status");
		String estado = req.getParameter("estado");

		
		
		Transport transport = new Transport();
		transport.setnReserva(nReserva);
		transport.setDNI(dni);
		transport.setType(type);
		transport.setDate(date);
		transport.setDestination(destination);
		transport.setAddComments(addComments);
		transport.setStatus(status);
		transport.setEstado(estado);
		
		
		TransportDAOImplementation.getInstance().create(transport);
//		List<Transport> lp = new ArrayList<Transport>();
//		lp.addAll((List<Transport>)
//		req.getSession().getAttribute("Servicio de habitacion"));
//		lp.add (transport);
//		req.getSession().setAttribute("Servicio de habitacion", lp);
//		getServletContext().getRequestDispatcher("/Transporte.jsp").forward(req,resp);
		getServletContext().getRequestDispatcher("/SolicitudCompleta.jsp").forward(req,resp);
	}
	
	
	
	

}
