package fr.formulaires.forms;

import java.util.HashMap;
import java.util.Map;

public final class ValidationInscription {
	
	private static final String CHAMP_NOM    = "nom";
	private static final String CHAMP_EMAIL  = "email";
    private static final String CHAMP_PASS   = "motdepasse";
    private static final String CHAMP_CONF   = "confirmation";
    
    private String              resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();

    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }
    
}
