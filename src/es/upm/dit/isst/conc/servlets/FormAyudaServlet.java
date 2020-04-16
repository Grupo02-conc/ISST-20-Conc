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

import es.upm.dit.isst.conc.model.Ayuda;
import es.upm.dit.isst.conc.model.Client;


/**
 * Servlet implementation class FormCreaProfesorServlet
 */
@WebServlet("/FormAyudaServlet")
public class FormAyudaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public FormAyudaServlet() {
        super();
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String descripcion = req.getParameter("descripcion");
		String dni = req.getParameter("forClient");
		String estado = "solicitado";
		
		Ayuda ayuda = new Ayuda();
		ayuda.setDescripcion(descripcion);
		ayuda.setEstado(estado);
		ayuda.setDni(dni);
		ayuda.setStatus(1);
		
		AyudaDAOImplementation.getInstance().create(ayuda);
		/*List<Ayuda> lp = new ArrayList<Ayuda>();
		lp.addAll((List<Ayuda>)
		req.getSession().getAttribute("Ayudas"));
		lp.add (ayuda);
		req.getSession().setAttribute("Ayuda", lp);*/
		List<Client> clientes = (List<Client>) ClientDAOImplementation.getInstance().readAll();
		List<Ayuda> ayudas = (List<Ayuda>) AyudaDAOImplementation.getInstance().readAll();

		req.getSession().setAttribute("ayudas", ayudas);	//Para poder sacarlo en el .jsp
		req.getSession().setAttribute("clientes", clientes);
		getServletContext().getRequestDispatcher("/AyudaRegistrada.jsp").forward(req,resp);
	}



}