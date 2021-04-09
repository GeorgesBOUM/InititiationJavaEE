package fr.formulaires.forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import fr.formulaires.beans.Utilisateur;

public class ConnexionValidation {
	
	private static final String CHAMP_EMAIL  = "email";
    private static final String CHAMP_PASS   = "motdepasse";
    
    private String              resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();
    
    public Utilisateur validerConnexion() {
		
    	Utilisateur utilisateur = new Utilisateur();
    	
    	
    	
    	return utilisateur;
	}
    
    private void setErreur(String champ, String message) {
		this.erreurs.put(champ, message);
	}
    
    private String getValeurChamp(HttpServletRequest request, String champ) {
		String valeur = request.getParameter(champ).trim();
		if (valeur == null || valeur.length() == 0) {
			return null;
		} else {
			return valeur;
		}
	}
}
