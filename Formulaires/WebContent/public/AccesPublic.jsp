<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Accès Public</title>
	</head>
	<body>
		<p>
			Vous n'avez pas accès à l'espace restreint : vous devez vous <a href="<c:url value="/connexion"/>">connecter</a> d'abord. 
		</p>
	</body>
</html>