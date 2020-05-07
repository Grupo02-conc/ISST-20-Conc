<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cliente</title>
<link rel="stylesheet" type="text/css" href="css/cliente.css">
</head>

<nav class="navbar sticky-top navbar-expand navbar-light bg-light">
	<a class="navbar-brand" href="FormLoginServlet">
			<img src="Images/logo.jpg" height="50"/>
	</a>
</nav>

<h1 class="titulo">Usted es: ${cliente.name}</h1>
<br>
<br>
<br>
<br>
<div class="text" >
<h2 >Soy Alberto Gaglia,<br> su asistente personal para facilitarle la vida.</h2>

<h2>¿Puedo ayudarle en algo?</h2>
<%@ include file = "FormAyuda.jsp" %>


<body>
<br>
<h2>Solicitudes realizadas:</h2>
<table border="1">
<tr>
  <td height="25" width="180" align="center"><strong>Solicitud</strong></td>
  <td height="25" width="180" align="center"><strong>Estado</strong></td>
</tr>
<c:forEach items="${ayudas}" var="ayudai">
<c:choose>
<c:when test="${ayudai.dni == cliente.dni}">
<tr>
<td height="25" width="200" align="center">${ayudai.descripcion}</td><td height="25" width="200" align="center">${ayudai.estado}</td>
<td>
<c:choose>
	<c:when test="${ayudai.status == 1}">
		<%@ include file = "FormCancelarSolicitud.jsp" %>
		<%@ include file = "EditarSolicitud.jsp" %>
	</c:when>

	<c:when test="${ayudai.status == 4}">
		<%@ include file = "FormVerSolicitudFinalizada.jsp" %>
	</c:when>
</c:choose>
</td>

</tr>
</c:when>
</c:choose>
</c:forEach>
</table>

</div>
<div class="botones" >
<h2 class="pregunta" align="right">¿Que desea usted hacer?</h2>
	<div class="perfil" align="right" style="border-radius: 10px">
	<nav class="navbar sticky-top navbar-expand navbar-light bg-light">
		<a class="navbar-brand" href="PerfilServlet">
			<img src="Images/perfil.png" height="80"/>
		</a>
	</nav>
	</div>
	
<div class="ocio" align="right" > -->
<nav class="navbar sticky-top navbar-expand navbar-light bg-light"> 
 		<a class="navbar-brand" href="OcioServlet"> 
 			<img src="Images/ocio.png" height="80"/> 
 		</a> 
 	</nav> 
 	</div> 
	
	<div class="room" align="right" >
	<nav class="navbar sticky-top navbar-expand navbar-light bg-light">
		<a class="navbar-brand" href="RoomServiceServlet">
			<img src="Images/habitacion.png" height="80"/>
		</a>
	</nav>
	</div>
	
	<div class="transporte" align="right" >
	<nav class="navbar sticky-top navbar-expand navbar-light bg-light">
		<a class="navbar-brand" href="TransportServlet">
			<img src="Images/transporte.png" height="80"/>
		</a>
	</nav>
	</div>
</div>




<%@ include file = "FormLogout.jsp" %>
</body>
</html>