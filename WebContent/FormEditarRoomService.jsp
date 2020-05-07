<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Room Service</title>
</head>
<body>


<c:forEach items="${roomService}" var="roomServicei">
  <c:choose>
  <c:when test="${roomServicei.nReserva == nRoomService}">
  <div class="registro">
	<form action="FormEditarRoomServiceServlet">
	<select name="nReserva" style="visibility:hidden" >
		<option>${nRoomService}</option>
	</select>
	<input type="text" class="habitacion" name="forRoom" value="${roomServicei.forRoom}">
	<select name="myType">
		<option value="Seleccionar">Selecciona una opción</option> 
   		<option value="Compra de flores">Compra de flores</option> 
   		<option value="Cockteleria de autor">Cockteleria de autor</option>
   		<option value="Servicio de tintoreria">Servicio de tintoreria</option>
   		<option value="Compra de jamon">Compra de jamon</option>
   		<option value="Servicio de peluqueria y barberia">Servicio de peluqueria y barberia</option> 
	</select>
	<input type="text" class="descripcion" name="description" value= "${roomServicei.description}"> 
	<input type="date" class="fecha" name="date" value= "${roomServicei.date}">
	<input type="text" class="comentarios" name="addComents" value= "${roomServicei.addComents}">
	<button class="botonRegistro">Editar el Room Service</button>
	<select name="status" style="display:none"><option value="1"></option></select>
	<select name="estado" style="display:none"><option value="Solicitado"></option></select>
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