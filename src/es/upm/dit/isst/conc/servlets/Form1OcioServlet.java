package es.upm.dit.isst.conc.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import es.upm.dit.isst.conc.dao.OcioDAOImplementation;
import es.upm.dit.isst.conc.model.Ocio;


/**
 * Servlet implementation class FormOcioServlet
 */
@WebServlet("/Form1OcioServlet")
public class Form1OcioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form1OcioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
    	String nReserva = req.getParameter("nReserva");
    	String dni = req.getParameter("forClient");
    	String actividad = req.getParameter("actividad");
		String fecha = req.getParameter("fecha");
		String precio = req.getParameter("precio");
		String addComents = req.getParameter("addComents");
		String status = req.getParameter("status");
		String estado = req.getParameter("estado");
		
		Ocio ocio = new Ocio();
		ocio.setnReserva(nReserva);
		ocio.setDni(dni);
		ocio.setActividad(actividad);
		ocio.setFecha(fecha);
		ocio.setPrecio(precio);
		ocio.setAddComents(addComents);
		ocio.setStatus(status);
		ocio.setEstado(estado);
		
		OcioDAOImplementation.getInstance().create(ocio);
		/*List<Ocio> lp = new ArrayList<Ocio>();
		lp.addAll((List<Ocio>)
		req.getSession().getAttribute("ocios"));
		lp.add (ocio);
		req.getSession().setAttribute("ocio", lp);*/
		getServletContext().getRequestDispatcher("/SolicitudCompleta.jsp").forward(req,resp);
	}
   

}