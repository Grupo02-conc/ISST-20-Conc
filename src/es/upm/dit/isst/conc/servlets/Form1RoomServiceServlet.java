package es.upm.dit.isst.conc.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.conc.dao.RoomServiceDAOImplementation;
import es.upm.dit.isst.conc.model.RoomService;


/**
 * Servlet implementation class Form1RoomServiceServlet
 */
@WebServlet("/Form1RoomServiceServlet")
public class Form1RoomServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
     * @see HttpServlet#HttpServlet()
     */
	
    public Form1RoomServiceServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String nReserva = req.getParameter("nReserva");
		String forClient = req.getParameter("forClient");
		String forRoom = req.getParameter("forRoom");
		String type = req.getParameter("type");
		String description = req.getParameter("description");
		String date = req.getParameter("date");
		String addComents = req.getParameter("addComents");
		String status = req.getParameter("status");
		String estado = req.getParameter("estado");
		
		
		RoomService roomService = new RoomService();
		roomService.setnReserva(nReserva);
		roomService.setForClient(forClient);
		roomService.setForRoom(forRoom);;
		roomService.setType(type);
		roomService.setDescription(description);
		roomService.setDate(date);
		roomService.setAddComents(addComents);
		roomService.setStatus(status);
		roomService.setEstado(estado);
		
		
		RoomServiceDAOImplementation.getInstance().create(roomService);
//		List<RoomService> lp = new ArrayList<RoomService>();
//		lp.addAll((List<RoomService>)
//		req.getSession().getAttribute("Servicio de habitacion"));
//		lp.add (roomService);
//		req.getSession().setAttribute("Servicio de habitacion", lp);
		getServletContext().getRequestDispatcher("/SolicitudCompleta.jsp").forward(req,resp);
	}
	
	
	
	

}
