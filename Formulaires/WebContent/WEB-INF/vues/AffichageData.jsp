<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Affichage Data</title>
	</head>
<body>
	<p>Données utilisateur</p>
	<p>Nom: ${utilisateur.nom }</p>
	<p>Email: ${utilisateur.mail }</p>
	<p><a href="<c:url value="/inscription" />">Créer un nouvel utilisateur</a></p>
</body>
</html>