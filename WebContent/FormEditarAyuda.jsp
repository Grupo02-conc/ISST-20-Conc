<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Solicitud</title>
</head>
<body>


<c:forEach items="${ayudas}" var="ayudai">
  <c:choose>
  <c:when test="${ayudai.nAyuda == nSolicitud}">
  <div class="registro">
	<form action="FormEditarAyudaServlet">

	<select name="nAyuda" style="visibility:hidden" >
		<option>${nSolicitud}</option>
	</select>
	<input type="text" class="descripcion" name="des" value="${ayudai.descripcion}" >
	<select name="descripcion" style="visibility:hidden"><option value="${ayudai.descripcion}"> Descripcion </option></select>
	<select name="forClient" style="visibility:hidden"><option value="${cliente.dni}"> DNI </option></select>
	
	<button class="botonRegistro">Editar Solicitud</button>

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
