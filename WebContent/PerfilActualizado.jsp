<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Perfil Actualizado</title>
<link rel="stylesheet" type="text/css" href="css/perfilActualizado.css">
</head>
<body>

		<nav class="navbar sticky-top navbar-expand navbar-light bg-light">
		<a class="navbar-brand" href="FormLoginServlet">
			<img src="Images/logo.jpg" height="60"/>
		</a>
		</nav>

<img src="Images/actualizar.gif" height="250" style="margin-left:40%;margin-right:15%;display:block;margin-top:3px;margin-bottom:0%">
<div style="margin-left:35%;margin-right:15%;display:block;margin-top:14px;margin-bottom:0%">
<h1>Su perfil ha sido actualizado</h1>
</div>
<p>Pulse el botón de salir de la aplicación, haga login con su nuevo email y contraseña para comprobar que sus datos se han actualizado.</p>

<div class="botonSalir">
<%@ include file = "FormLogout.jsp" %>
</div>
</body>
</html>