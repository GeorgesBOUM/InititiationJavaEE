package fr.formulaires.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formulaires.beans.Utilisateur;
import fr.formulaires.forms.ValidationInscription;

/**
 * Servlet implementation class Inscription
 */
@WebServlet("/inscription")
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String VUE_FORMULAIRE = "/WEB-INF/vues/InscriptionForm.jsp";
	private static final String VUE_AFFICHAGE_DATA = "/WEB-INF/vues/AffichageData.jsp";
	
	public static final String ATT_USER = "utilisateur";
    public static final String ATT_INSCRIPTION = "inscription";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inscription() {
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
		ValidationInscription inscription = new ValidationInscription();
		Utilisateur utilisateur = inscription.inscrireUtilisateur(request);
		
		request.setAttribute(ATT_INSCRIPTION, inscription);
		request.setAttribute(ATT_USER, utilisateur);
		
		if (inscription.getErreurs().isEmpty()) {
			request.getRequestDispatcher(VUE_AFFICHAGE_DATA).forward(request, response);
		} else {
			request.getRequestDispatcher(VUE_FORMULAIRE).forward(request, response);
		}
	}

}
