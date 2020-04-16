<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Propina</title>
<link rel="stylesheet" type="text/css" href="css/propina.css">
</head>
<body>
		<nav class="navbar sticky-top navbar-expand navbar-light bg-light">
		<a class="navbar-brand" href="FormLoginServlet">
			<img src="Images/logo.jpg" height="60"/>
		</a>
		</nav>
<h1 class="text">La propina ha sido realizada a favor del empleado Alberto.</h1>
<h1 class="text2"> ¡Muchas gracias de parte de Alberto Gaglia!</h1>
<img src="Images/alberto.png" height="200" style="margin-left:73%;margin-right:15%;display:block;margin-top:8%;margin-bottom:0%">
<img src="Images/gracias.gif" height="200" style="margin-left:30%;margin-right:15%;display:block;margin-top:-10%;margin-bottom:0%">
<div class="botonSalir">
<%@ include file = "FormLogout.jsp" %>
</div>
</body>
</html>