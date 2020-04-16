package es.upm.dit.isst.conc.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.conc.dao.*;
import es.upm.dit.isst.conc.model.*;


/**
 * Servlet implementation class FormCancelarSolicitudServlet.java
 */
@WebServlet("/FormCancelarRoomServiceServlet")
public class FormCancelarRoomServiceServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public FormCancelarRoomServiceServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	  
    	
    	String nReserva = req.getParameter("nReserva");
    	

		
		RoomService t = RoomServiceDAOImplementation.getInstance().read(nReserva);
		t.setStatus("2");
		t.setEstado("Cancelado");
		RoomServiceDAOImplementation.getInstance().update(t);
		
		
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
    	List<RoomService> roomServices = (List<RoomService>) RoomServiceDAOImplementation.getInstance().readAll();
    	req.getSession().setAttribute("roomService", roomServices); 
    	req.getSession().setAttribute("clientes", clientes);
             
              getServletContext().getRequestDispatcher("/SolicitudCancelada.jsp")
             .forward(req,resp);
	}
}