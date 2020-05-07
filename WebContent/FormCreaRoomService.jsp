<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<div class="registro">
<form action="Form1RoomServiceServlet">
	<select name="nReserva" style="visibility:hidden" >
		<option>${fn:length(roomService) + 1}</option>
	</select>
 	<select name="forClient" style="visibility:hidden"><option value="${cliente.dni}"> DNI </option></select>
	<input type="text" class="habitacion" name="forRoom" placeholder="Habitacion destino">
	<select name="type">
		<option value="Seleccionar">Selecciona una opción</option> 
   		<option value="Compra de flores">Compra de flores</option> 
   		<option value="Cockteleria de autor">Cockteleria de autor</option>
   		<option value="Servicio de tintoreria">Servicio de tintoreria</option>
   		<option value="Compra de jamon">Compra de jamon</option>
   		<option value="Servicio de peluqueria y barberia">Servicio de peluqueria y barberia</option> 
	</select>
	<input type="text" class="descripcion" name="description" placeholder="Realice una descripcion de su pedido">
	<input type="date" class="fecha" name="date" placeholder="¿Para cuándo desea el servicio?">
	<input type="text" class="comentarios" name="addComents" placeholder="Comentarios adicionales">
	<button class="botonRegistro">Registrar servicio de habitación</button>
	<select name="status" style="display:none"><option value="1"></option></select>
	<select name="estado" style="display:none"><option value="Solicitado"></option></select>
</form>
</div>