<form action="Form1OcioServlet">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

	<select name="nReserva" style="display:none">
		<option>${fn:length(ocios) + 1}</option>
	</select>
	
	<select name="forClient" style="visibility:hidden"><option value="${cliente.dni}"> DNI </option></select>
	<select name="actividad">
		<option value="Seleccionar">Selecciona una opción</option> 
   		<option value="Entradas para espéctaculo">Entradas para espectaculo</option> 
   		<option value="Entrenador personal">Entrenador personal</option> 
   		<option value="Reserva de restaurante">Reserva de restaurante</option>
   		<option value="Visita a bodega">Visita a bodega</option>
   		<option value="Tirarse en paracaídas">Tirarse en paracaidas</option>
   		<option value="Visita a joyerías">Visita a joyerías</option>
   		
	</select>
	<input type="text" class="fecha" name="fecha" placeholder="¿Para cuándo desea el servicio?">
	<input type="text" class="precio" name="precio" placeholder="Presupuesto estimado">
	<input type="text" class="comentarios" name="addComents" placeholder="Comentarios adicionales,tipo de espectáculo...">
	<select name="status" style="display:none"><option value="1"></option></select>
	<select name="estado" style="display:none"><option value="Solicitado"></option></select>
	
	<button class="botonRegistro">Registrar actividad de ocio</button>
</form>
