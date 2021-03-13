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
</body>
</html>