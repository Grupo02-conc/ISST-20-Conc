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
@WebServlet("/EditarRoomServiceServlet")
public class EditarRoomServiceServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public EditarRoomServiceServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	  
    	
    	String nReserva = req.getParameter("nReserva");
    	
		
		
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
    	List<RoomService> roomServices = (List<RoomService>) RoomServiceDAOImplementation.getInstance().readAll();
    	req.getSession().setAttribute("roomService", roomServices); 
    	req.getSession().setAttribute("clientes", clientes);
    	req.getSession().setAttribute("nRoomService", nReserva);
             
              getServletContext().getRequestDispatcher("/FormEditarRoomService.jsp")
             .forward(req,resp);
	}
}