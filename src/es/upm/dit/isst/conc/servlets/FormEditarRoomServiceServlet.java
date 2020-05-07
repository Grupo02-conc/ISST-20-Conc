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
import es.upm.dit.isst.conc.dao.RoomServiceDAOImplementation;
import es.upm.dit.isst.conc.model.Ayuda;
import es.upm.dit.isst.conc.model.Client;
import es.upm.dit.isst.conc.model.RoomService;

/**
 * Servlet implementation class FormEditarRoomServiceSolicitudServlet.java
 */
@WebServlet("/FormEditarRoomServiceServlet")
public class FormEditarRoomServiceServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public FormEditarRoomServiceServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	  
    	
    	String nReserva = req.getParameter("nReserva");
    	String forRoom = req.getParameter("forRoom");
    	String type = req.getParameter("myType");
    	String description = req.getParameter("description");
    	String date = req.getParameter("date");
    	String addComents = req.getParameter("addComents");
    	

		
		RoomService t = RoomServiceDAOImplementation.getInstance().read(nReserva);
		t.setForRoom(forRoom);
		t.setType(type);
		t.setDescription(description);
		t.setDate(date);
		t.setAddComents(addComents);
		RoomServiceDAOImplementation.getInstance().update(t);
		
		
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
    	List<RoomService> roomServices = (List<RoomService>) RoomServiceDAOImplementation.getInstance().readAll();
    	req.getSession().setAttribute("roomService", roomServices); 
    	req.getSession().setAttribute("clientes", clientes);
             
              getServletContext().getRequestDispatcher("/SolicitudEditada.jsp")
             .forward(req,resp);
	}
}
