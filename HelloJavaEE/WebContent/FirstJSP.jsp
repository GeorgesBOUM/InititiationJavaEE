<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel='stylesheet' type='text/css' href='style.css'>
		<title>First JSP</title>
	</head>
<body>
	<h2>L'heure en temps réel:</h2>
	<p> <%=new Date() %></p>
	<%
		if ((request.getMethod().equals("POST") && request.getParameter("txtLogin").equals("bond") 
			&& request.getParameter("txtPassword").equals("007"))){
	%>
	<p> Connexion succeed. Welcome <%=request.getParameter("txtLogin") %></p>
	<%} else { %>
	<form method='POST' action='FirstJSP.jsp'>
    	<label for='txtLogin'>Login :</label><input id='txtLogin' name='txtLogin' type='text' autofocus autocomplete='off'/><br/>
        <label for='txtPassword'>Password :</label><input name='txtPassword' type='password'/><br/>
        <br/>
        <input name='btnConnect' type='submit' value='Se connecter' /><br/>
    </form>
	<%}%>
	
</body>
</html>