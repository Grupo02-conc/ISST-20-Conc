<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Ocio</title>
</head>
<body>


<c:forEach items="${ocio}" var="ocioi">
  <c:choose>
  <c:when test="${ocioi.nReserva == nOcio}">
  <div class="registro">
	<form action="FormEditarOcioServlet">
	<select name="nReserva" style="visibility:hidden" >
		<option>${nOcio}</option>
	</select>
	<select name="actividad">
		<option value="Seleccionar">Selecciona una opción</option> 
   		<option value="Entradas para espéctaculo">Entradas para espectaculo</option> 
   		<option value="Entrenador personal">Entrenador personal</option> 
   		<option value="Reserva de restaurante">Reserva de restaurante</option>
   		<option value="Visita a bodega">Visita a bodega</option>
   		<option value="Tirarse en paracaídas">Tirarse en paracaidas</option>
   		<option value="Visita a joyerías">Visita a joyerías</option>
   		
	</select>
	<input type="text" class="fecha" name="fecha" value= "${ocioi.fecha}"> 
	<input type="text" class="precio" name="precio" value= "${ocioi.precio}">
	<input type="text" class="comentarios" name="addComents" value= "${ocioi.addComents}">
	<button class="botonRegistro">Editar</button>
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