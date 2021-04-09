<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Page Membre</title>
		<link type="text/css" rel="stylesheet" href="styles/inscription.css" />
	</head>
	<body>
		<p>
			<span class="succes">Bienvenu ${sessionScope.session.nom }. </span><br>
			Votre adresse mail est ${sessionScope.session.mail }.
		</p>
		<c:import url="/inc/BoutonDeconnexion.jsp"></c:import>
	</body>
</html>