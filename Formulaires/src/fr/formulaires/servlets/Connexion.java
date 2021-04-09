package fr.formulaires.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Connexion
 */
@WebServlet(name = "connexion", urlPatterns = { "/connexion" })
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String VUE_FORMULAIRE = "/WEB-INF/vues/Connexion.jsp";
	private static final String VUE_AFFICHAGE_DATA = "/WEB-INF/vues/AffichageData.jsp";
	
	public static final String ATT_USER = "utilisateur";
    public static final String ATT_CONNEXION = "connexion";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
