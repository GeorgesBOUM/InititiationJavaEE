<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Inscription</title>
		<link type="text/css" rel="stylesheet" href="styles/inscription.css">
	</head>
<body>
	<form method="post" action="inscription">
	    <fieldset>
	        <legend>Inscription</legend>
	        <p>Vous pouvez vous inscrire via ce formulaire.</p>
	
	        <label for="email">Adresse email <span class="requis">*</span></label>
	        <input type="text" id="email" name="email" value="<c:out value="${utilisateur.mail}"/>" size="20" maxlength="60" />
	        <span class="erreur">${inscription.erreurs['email']}</span>
	        <br />
	
	        <label for="motdepasse">Mot de passe <span class="requis">*</span></label>
	        <input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" />
	        <span class="erreur">${inscription.erreurs['motdepasse']}</span>
	        <br />
	
	        <label for="confirmation">Confirmation du mot de passe <span class="requis">*</span></label>
	        <input type="password" id="confirmation" name="confirmation" value="" size="20" maxlength="20" />
	        <span class="erreur">${inscription.erreurs['confirmation']}</span>
	        <br />
	
	        <label for="nom">Nom d'utilisateur</label>
	        <input type="text" id="nom" name="nom" value="<c:out value="${utilisateur.nom}"/>" size="20" maxlength="20" />
	        <span class="erreur">${inscription.erreurs['nom']}</span>
	        <br />
	
	        <input type="submit" value="Inscription" class="sansLabel" />
	        <br />
	        
	    </fieldset>
    </form>
</body>
</html>