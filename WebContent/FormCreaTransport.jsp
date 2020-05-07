<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<form action="Form1TransportServlet">

	<select name="nReserva" style="display:none">
		<option>${fn:length(transports) + 1}</option>
	</select>

 	<select name="dni" style="display:none"><option value="${cliente.dni}"> DNI </option></select>
	<select name="type">
		<option value="Seleccionar">Selecciona una opción</option> 
   		<option value="Taxi">Taxi</option> 
   		<option value="VTC">VTC</option> 
   		<option value="Avion">Avion</option> 
   		<option value="Helicoptero">Helicoptero</option> 
	</select>
 	<input type="date" class="fecha" name="date" placeholder="Fecha" >
 	<input type="text" class="destino" name="destination" placeholder="¿A donde?">
	<input type="text" class="comentario" name="addComments" placeholder="Comentarios adicionales" style="WIDTH: 350px; HEIGHT:15px">
	<select name="status" style="display:none"><option value="1"></option></select>
	<select name="estado" style="display:none"><option value="Solicitado"></option></select>
	
	<button class="botonSolicitud">Hacer solicitud</button>

</form>