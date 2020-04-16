<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/admin.css">
		<title>Admin</title>
	</head>
	
	<body>
		<nav class="navbar sticky-top navbar-expand navbar-light bg-light">
		<a class="navbar-brand" href="FormLoginServlet">
			<img src="Images/logo.jpg" height="50"/>
		</a>
		</nav>
	<div align="center">
	<h1 class="administrador" style="margin-left:auto;margin-right:auto;display:block;margin-top:-30px;margin-bottom:0%">Administrador</h1>
	<p align="left" class="texto" style="margin-left:auto;margin-right:auto;display:block;margin-top:5%;margin-bottom:0%;font-size:20px"><b>Número de clientes activos: </b>${fn:length(clientes)}</p>

	<h3 class="text-center">Clientes</h3>
	<br>
	
		<table class="table table-hover table-bordered">
			<tr align="center">
			
       <th  >Nombre y Apellidos</th>
       <th >Email</th>
       <th >DNI</th>
       <th >Teléfono</th>
        <th >Habitación</th>
    </tr>
		
		<c:forEach items="${clientes}" var="clientei">

	<tr>
		
		<td height="25" width="200" align="center">${clientei.name}</td>
		<td height="25" width="200" align="center">${clientei.email}</td>
		<td height="25" width="200" align="center">${clientei.dni}</td>
		<td height="25" width="150" align="center">${clientei.tlf}</td>
		<td height="25" width="150" align="center">${clientei.room}</td>
	</tr>

	</c:forEach>
	</table>
	
	<br>

	<div class="textoRegistro">
		<h3>Registrar un nuevo Cliente</h3>
		<%@ include file = "FormCreaClient.jsp" %>

	<!-- <h4 class="text.Salir">Salir de la aplicaciÃƒÂ³n</h4> -->
		
		<%@ include file = "FormLogout.jsp"%>
	</div>
	</div>
	</body>
	</html>