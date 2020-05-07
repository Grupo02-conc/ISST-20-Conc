package es.upm.dit.isst.conc.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.conc.dao.TarjetaDAOImplementation;
import es.upm.dit.isst.conc.dao.ClientDAOImplementation;

import es.upm.dit.isst.conc.model.Tarjeta;
import es.upm.dit.isst.conc.model.Client;


/**
 * Servlet implementation class FormCreaProfesorServlet
 */
@WebServlet("/FormIntroducirTarjetaServlet")
public class FormIntroducirTarjetaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public FormIntroducirTarjetaServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	
    	
    	String numero = req.getParameter("numero");
    	String caducidad = req.getParameter("caducidad");
    	String codigo = req.getParameter("codigo");
    	String dni = req.getParameter("forClient");
		
    	Tarjeta tarjeta = new Tarjeta();
    	tarjeta.setNumero(numero);
    	tarjeta.setCaducidad(caducidad);
    	tarjeta.setCodigo(codigo);
    	tarjeta.setDni(dni);
		
		TarjetaDAOImplementation.getInstance().create(tarjeta);
		/*List<Tarjeta> lp = new ArrayList<Tarjeta>();
		lp.addAll((List<Tarjeta>)
		req.getSession().getAttribute("Tarjetas"));
		lp.add (Tarjeta);
		req.getSession().setAttribute("Tarjeta", lp);*/
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
		List<Tarjeta> tarjetas = (List<Tarjeta>) TarjetaDAOImplementation.getInstance().readAll();

		req.getSession().setAttribute("tarjetas", tarjetas);	//Para poder sacarlo en el .jsp
		req.getSession().setAttribute("clientes", clientes);
		getServletContext().getRequestDispatcher("/TarjetaRegistrada.jsp").forward(req,resp);
	}



}