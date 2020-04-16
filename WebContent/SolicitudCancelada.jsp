<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/solicitudCan.css">
</head>
<body>
		<nav class="navbar sticky-top navbar-expand navbar-light bg-light">
		<a class="navbar-brand" href="FormLoginServlet">
			<img src="Images/logo.jpg" height="60"/>
		</a>
		</nav>

<img src="Images/solCan.jpg" height="250" style="margin-left:32%;margin-right:15%;display:block;margin-top:3px;margin-bottom:0%">


<div style="margin-left:35%;margin-right:15%;display:block;margin-top:14px;margin-bottom:0%">
<h2>Solicitud cancelada con exito.</h2>
</div>

<div style="margin-left:35%;margin-right:15%;display:block;margin-top:20px;margin-bottom:0%">
<h4>Su solicitud ha sido cancelada con exito, no recibirá el servicio.<br>Si desea contratar otro servicio, por favor vuelva a la página de solicitud. </h4>
</div>

<div class="atras">
<%@ include file = "FormBack.jsp" %>
</div>
</body>
</html>