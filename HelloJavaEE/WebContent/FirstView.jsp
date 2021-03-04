<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
<body>
	<form method='POST' action='FirstJSP.jsp'>
    	<label for='txtLogin'>Login :</label><input id='txtLogin' name='txtLogin' type='text' autofocus autocomplete='off'/><br/>
        <label for='txtPassword'>Password :</label><input name='txtPassword' type='password'/><br/>
        <br/>
        <input name='btnConnect' type='submit' value='Se connecter' /><br/>
    </form>
</body>
</html>