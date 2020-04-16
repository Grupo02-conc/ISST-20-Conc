<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ocio</title>
<link rel="stylesheet" type="text/css" href="css/ocio.css">
</head>
<body>
<nav class="navbar sticky-top navbar-expand navbar-light bg-light">
	<a class="navbar-brand" href="FormLoginServlet">
			<img src="Images/logo.jpg" height="60"/>
	</a>
</nav>

<h1 align="center" >Servicios de Ocio<img src="Images/ocio.png" height="60"></h1>
<div class="textOcio">
<h2>Registrar una actividad</h2>
</div>
<%@ include file = "FormCreaOcio.jsp" %>

<div class="textOcio2">
<h2> Actividades de ocio reservadas </h2>
</div>
<table border="1" align="center">
<tr>
  <td height="25" width="100" align="center"><strong>Fecha</strong></td>
  <td height="25" width="400" align="center"><strong>Actividad</strong></td>
  <td height="25" width="100" align="center"><strong>Precio</strong></td>
  <td height="25" width="100" align="center"><strong>Estado de la solicitud</strong></td>
 
</tr>

<c:forEach items="${ocios}" var="ocioi">
<c:choose>
<c:when test="${ocioi.dni == cliente.dni}">
<tr>
<td>${ocioi.fecha}</td><td>${ocioi.actividad}</td><td>${ocioi.precio}</td><td>${ocioi.estado}</td>
<td>
<c:choose>
	<c:when test="${ocioi.status == '1'}">
		<%@ include file = "FormCancelarOcio.jsp" %>
	</c:when>
	<c:when test="${ocioi.status == '4'}">
		<%@ include file = "FormVerOcioFinalizado.jsp" %>
	</c:when>
</c:choose>
</td>
</tr>
</c:when>
</c:choose>
</c:forEach>
</table>


<div class="atras">
<%@ include file = "FormBack.jsp" %>
</div>

</body>
</html>	