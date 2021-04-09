package fr.formulaires.forms;

import java.util.HashMap;
import java.util.Map;

public class ConnexionValidation {
	
	private static final String CHAMP_EMAIL  = "email";
    private static final String CHAMP_PASS   = "motdepasse";
    
    private String              resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();
}
