<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>First JSTL</title>
	</head>
<body>
	<p>Viewing the first bean</p>
	<p><c:out value='Bonjour. La ${bean.name } est ${bean.state ? "active" : "inactive"}'></c:out></p>
	
	<!-- Declare and initialize variables -->
	<p>
		<c:set var="variable" value="test variable"></c:set>
		<c:out value="Voici le premier ${variable }"></c:out>
	</p>
	
	<!-- Manipulating bean w/ jstl -->
	<p>
		<c:set target="${bean }" property="state" value="true"></c:set>
		<c:out value='Now the ${bean.name } is ${bean.state ? "active" : "inactive"}'></c:out>
	</p>
	
	<!-- Conditions -->
	<p>
		<c:set var="age" value="24"></c:set>
		<c:choose>
			<c:when test="${age >= 0 && age < 12 }">Vous êtes un enfant</c:when>
			<c:when test="${age >= 12 && age < 18 }">Vous êtes un adolescent</c:when>
			<c:when test="${age >= 18 && age < 24 }">Vous êtes un jeune adulte</c:when>
			<c:when test="${age >= 24 }">Vous êtes un adulte</c:when>
			<c:otherwise>Vous êtes inclassable :-)</c:otherwise>
		</c:choose>
	</p>
</body>
</html>