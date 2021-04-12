<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Accès Restreint 2</title>
		<link type="text/css" rel="stylesheet" href="<c:url value="/styles/inscription.css"/>" />
	</head>
	<body>
		<p>
			Vous êtes connecté(e) avec l'adresse ${sessionScope.sessionUtilisateur.mail}, vous avez bien accès à l'espace restreint numéro 2.
			<a href="<c:url value="/restreint/AccesRestreint3.jsp"/>">page suivante</a>
		</p>
		<c:import url="/inc/BoutonDeconnexion.jsp"></c:import>
	</body>
</html>