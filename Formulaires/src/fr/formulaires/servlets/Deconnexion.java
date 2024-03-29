package fr.formulaires.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Deconnexion
 */
@WebServlet(name = "deconnexion", urlPatterns = { "/deconnexion" })
public class Deconnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String DECONNEXION = "/public/Deconnexion.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deconnexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		
		System.out.println("chemin dans Deconnexion --> " + request.getContextPath() + DECONNEXION);
		session.invalidate();
		//response.sendRedirect(request.getContextPath() + DECONNEXION);
		request.getRequestDispatcher(DECONNEXION).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
