package fr.formulaires.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.formulaires.beans.Utilisateur;
import fr.formulaires.forms.ConnexionValidation;

/**
 * Servlet implementation class Connexion
 */
@WebServlet(name = "connexion", urlPatterns = { "/connexion" })
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String VUE_FORMULAIRE = "/WEB-INF/vues/Connexion.jsp";
	//private static final String VUE_RESULTAT = "/WEB-INF/vues/AccesRestreint.jsp";
	private static final String VUE_RESULTAT = "/restreint/AccesRestreint.jsp";
	
	public static final String ATT_USER = "utilisateur";
    public static final String ATT_CONNEXION = "connexion";
    public static final String ATT_SESSION_USER = "sessionUtilisateur";
       
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
		
		request.getRequestDispatcher(VUE_FORMULAIRE).forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ConnexionValidation connexion = new ConnexionValidation();
		Utilisateur utilisateur = connexion.validerConnexion(request);
		HttpSession session = request.getSession();
		
		request.setAttribute(ATT_CONNEXION, connexion);
		request.setAttribute(ATT_USER, utilisateur);
		
		if (connexion.getErreurs().isEmpty()) {
			session.setAttribute(ATT_SESSION_USER, utilisateur);
			//request.getRequestDispatcher(VUE_RESULTAT).forward(request, response);
			System.out.println("chemin dans Connexion --> " + request.getContextPath());
			response.sendRedirect(request.getContextPath() + VUE_RESULTAT);
		} else {
			session.setAttribute(ATT_SESSION_USER, null);
			request.getRequestDispatcher(VUE_FORMULAIRE).forward(request, response);
		}
		
	}

}
