<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Première page</title>
	</head>
<body>
	<p>
		Vous êtes sur la première page <br>
		<a href='<c:url value="/vues/Deuxieme" ></c:url>'>Lien vers la deuxième page</a><br>
	</p>
</body>
</html>