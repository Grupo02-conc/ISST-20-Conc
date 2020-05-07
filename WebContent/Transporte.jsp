<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transporte</title>
<link rel="stylesheet" type="text/css" href="css/transporte.css">
</head>
<body>
	<nav class="navbar sticky-top navbar-expand navbar-light bg-light">
		<a class="navbar-brand" href="FormLoginServlet">
			<img src="Images/logo.jpg" height="60"/>
		</a>
	</nav>

<h1 align="center" >Transporte<img src="Images/transporte.png" height="60"></h1>

<br>
<div class="textTrans">
<h3>¿Que quieres reservar?</h3>

<%@ include file = "FormCreaTransport.jsp" %>
<h3>Dni del cliente: ${cliente.dni }</h3>

<h3>Reservas: </h3>

<table border="1" align="center">
<tr>
  <td height="25" width="200" align="center"><strong>Fecha</strong></td>
  <td height="25" width="200" align="center"><strong>Servicio</strong></td>
  <td height="25" width="200" align="center"><strong>Destino</strong></td>
  <td height="25" width="200" align="center"><strong>Estado de la solicitud</strong></td>
</tr>


<c:forEach items="${transports}" var="transporti">
<c:choose>
<c:when test="${transporti.DNI == cliente.dni}">
<tr>
<td>${transporti.date}</td><td>${transporti.type}</td><td>${transporti.destination}</td><td>${transporti.estado}</td>
<td>
<c:choose>
	<c:when test="${transporti.status == '1'}">
		<%@ include file = "FormCancelarTransporte.jsp" %>
		<%@ include file = "EditarTransport.jsp" %>
		
	</c:when>
	<c:when test="${transporti.status == '4'}">
		<%@ include file = "FormVerTransporteFinalizado.jsp" %>
	</c:when>
</c:choose>
</td>
</tr>
</c:when>
</c:choose>
</c:forEach>
</table>
<br>
</div>

<div class="atras">
<%@ include file = "FormBack.jsp" %>
</div>


</body>
</html>