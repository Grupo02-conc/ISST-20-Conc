package es.upm.dit.isst.conc.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormLogoutServlet
 */
@WebServlet("/FormLogoutServlet")
public class FormLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormLogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().removeAttribute("admin");
		req.getSession().removeAttribute("transports");
		req.getSession().removeAttribute("transport");
		req.getSession().removeAttribute("cliente");
		req.getSession().removeAttribute("clientes");
        req.getSession().invalidate();
		getServletContext().getRequestDispatcher("/index.html").forward(req,resp);
	}


}
