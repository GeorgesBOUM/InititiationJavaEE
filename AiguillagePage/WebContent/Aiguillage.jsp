<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Aiguillage</title>
	</head>
<body>
	<p>
		Page d'aiguillage <br>
		<a href='<c:url value="Premiere.jsp"></c:url>'>Lien vers première page</a>
	</p>
	<%--
	<c:import url="/inc/Menu.jsp"></c:import>
	<c:out value="${lienVersPremiere }"></c:out>
	<c:out value="${lienVersDeuxieme }"></c:out> 
	--%> 
<!--  
	<p>
		Page d'aiguillage
		<a href="Premiere.jsp" >lien vers première page</a>
	</p>
-->
</body>
</html>