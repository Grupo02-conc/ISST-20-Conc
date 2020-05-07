<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>PERFIL</title>
<link rel="stylesheet" type="text/css" href="css/gestionPerfil.css">
</head>
<body>
<nav class="navbar sticky-top navbar-expand navbar-light bg-light">
	<a class="navbar-brand" href="FormLoginServlet">
			<img src="Images/logo.jpg" height="60"/>
	</a>
</nav>

<h1 align="center">Perfil<img src="Images/perfil.png" height="60"></h1>
<div class="textPerfil">
<h2>Datos del perfil</h2>
</div>

<h3>Su email es: ${cliente.email}</h3>
<h3>Su nombre es: ${cliente.name}</h3>
<h3>Su dni es: ${cliente.dni}</h3>
<h3>Su habitacion es: ${cliente.room}</h3>
<h3>Su telefono es: ${cliente.tlf}</h3>

<div class="textPerfil2">
<h2>Actualizar datos del perfil</h2>
</div>
<div>
<%@ include file = "FormActualizaPerfil.jsp" %>
</div>


<div>
<h2>Introducir tarjeta de crédito</h2>
</div>
<%@ include file = "FormIntroducirTarjeta.jsp" %>


<div class="atras">
<%@ include file = "FormBack.jsp" %>
</div>

</body>
</html>