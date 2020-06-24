<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookies Sessions</title>
</head>
<body>
	<h1> Cookies from Browser </h1>
	<br>
	<%
		Cookie[] cookie = request.getCookies();
		out.print("Username "+ cookie[0].getValue());
		String password = (String)session.getAttribute("Password");
		out.print("Password "+ password);
	%>
</body>
</html>