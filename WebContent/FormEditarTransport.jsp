<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Transporte</title>
</head>
<body>


<c:forEach items="${transport}" var="transporti">
  <c:choose>
  <c:when test="${transporti.nReserva == nTransport}">
  <div class="registro">
	<form action="FormEditarTransportServlet">

	<select name="nReserva" style="visibility:hidden" >
		<option>${nTransport}</option>
	</select>
	<select name="type">
		<option value="Seleccionar">Selecciona una opción</option> 
   		<option value="Taxi">Taxi</option> 
   		<option value="VTC">VTC</option> 
   		<option value="Avion">Avion</option> 
   		<option value="Helicoptero">Helicoptero</option> 
	</select>
 	<input type="text" class="fecha" name="date" value="${transporti.date}" >
 	<input type="text" class="destino" name="destination" value="${transporti.destination}">
	<input type="text" class="comentario" name="addComments" value="${transporti.addComments}" style="WIDTH: 350px; HEIGHT:15px">
	
	<button class="botonSolicitud">Editar solicitud</button>

	</form>
</div>
  </c:when>
  </c:choose>
</c:forEach>

<div class="atras">
<%@ include file = "FormBack.jsp" %>
</div>
</body>
</html>
