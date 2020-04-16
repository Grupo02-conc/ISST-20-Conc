<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>ROOM SERVICE</title>
<link rel="stylesheet" type="text/css" href="css/room.css">
</head>
<body>
<nav class="navbar sticky-top navbar-expand navbar-light bg-light">
	<a class="navbar-brand" href="FormLoginServlet">
			<img src="Images/logo.jpg" height="60"/>
	</a>
</nav>

<h1 align="center" >Room Service<img src="Images/habitacion.png" height="60"></h1>
<br>
<div class="textRoom">
<h2>Registrar un nuevo servicio de habitacion</h2>
</div>
<%@ include file = "FormCreaRoomService.jsp" %>
<div class="textRoom2">
<h2>Servicios de habitacion activos</h2>
</div>

<table border="1" align="center">
<tr>
  <td height="25" width="200" align="center"><strong>Tipo de servicio</strong></td>
  <td height="25" width="200" align="center"><strong>Fecha de entrega prevista</strong></td>
  <td height="25" width="200" align="center"><strong>Estado del servicio</strong></td>
</tr>

<c:forEach items="${roomService}" var="roomServicei">
  <c:choose>
  <c:when test="${roomServicei.forClient == cliente.dni}">
  <tr>
  <td>${roomServicei.type}</td><td>${roomServicei.date}</td><td>${roomServicei.estado}</td>
  <td>
  <c:choose>
	<c:when test="${roomServicei.status == '1'}">
		<%@ include file = "FormCancelarRoomService.jsp" %>
	</c:when>
	<c:when test="${roomServicei.status == '4'}">
		<%@ include file = "FormVerRoomServiceFinalizado.jsp" %>
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