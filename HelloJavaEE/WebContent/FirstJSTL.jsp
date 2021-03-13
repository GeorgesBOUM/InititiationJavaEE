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
</body>
</html>