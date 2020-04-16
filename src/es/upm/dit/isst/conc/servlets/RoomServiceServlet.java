package es.upm.dit.isst.conc.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.conc.dao.ClientDAOImplementation;
import es.upm.dit.isst.conc.dao.RoomServiceDAOImplementation;
import es.upm.dit.isst.conc.model.Client;
import es.upm.dit.isst.conc.model.RoomService;



/**
 * Servlet implementation class Form1TransportServlet
 */
@WebServlet("/RoomServiceServlet")
public class RoomServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomServiceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
    	List<RoomService> roomServices = (List<RoomService>) RoomServiceDAOImplementation.getInstance().readAll();
    	req.getSession().setAttribute("roomService", roomServices); 
    	req.getSession().setAttribute("clientes", clientes);
    	getServletContext().getRequestDispatcher("/RoomService.jsp").forward(req,resp);       
    }
}
