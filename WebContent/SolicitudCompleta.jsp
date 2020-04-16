<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Solicitud Completa</title>
<link rel="stylesheet" type="text/css" href="css/solicitudCom.css">
</head>
<body>
		<nav class="navbar sticky-top navbar-expand navbar-light bg-light">
		<a class="navbar-brand" href="FormLoginServlet">
			<img src="Images/logo.jpg" height="60"/>
		</a>
		</nav>
<div class="solicitud" style="margin-left:35%;margin-right:15%;display:block;margin-top:70px;margin-bottom:0%">
<h2 ><img src="Images/tick.png" height="60" align="center"/>Solicitud realizada con exito.</h2>
</div>

<h3 style="margin-left:35%;margin-right:15%;display:block;margin-top:0px;margin-bottom:0%">En un breve plazo de tiempo el servicio estará contratado. </h3>

<div class="vtc" style="margin-left:38%;margin-right:2%;display:block;margin-top:2%;margin-bottom:2%">
<img src="Images/solCanc.jpg" height="200"/>
</div>
<div class="atras">
<%@ include file = "FormBack.jsp" %>
</div>
</body>
</html>