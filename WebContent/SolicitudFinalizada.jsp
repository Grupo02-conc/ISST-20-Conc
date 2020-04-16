<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Solicitud Finalizada</title>
<link rel="stylesheet" type="text/css" href="css/solicitudFinal.css">
</head>
<body>

	<nav class="navbar sticky-top navbar-expand navbar-light bg-light">
		<a class="navbar-brand" href="FormLoginServlet">
			<img src="Images/logo.jpg" height="60"/>
		</a>
	</nav>
<img src="Images/alberto.png" height="200" style="margin-left:83%;margin-right:0%;display:block;margin-top:0%;margin-bottom:auto">
<h1>¡Su solicitud ya ha sido realizada!</h1>

<h2>Esta gestión ha sido llevada a cabo por nuestro empleado Alberto Gaglia.</h2>

<h3 class="textFin">Le haremos el cargo a la tarjeta que nos facilito.</h3>
<img src="Images/tarjeta.png" height="100" class="tarjeta">
<h3 class="textFin2">Si desea dar una propina a nuestro empleado Alberto, lo puede hacer a continuación:</h3>

<form action="FormPropinaServlet">
	<input type="text" class="cantidad" name="dinero" placeholder="Importe propina">
	<button class="botonPropina">Dar propina</button>
</form>

<div class="atras">
<%@ include file = "FormBack.jsp" %>
</div>

</body>
</html>