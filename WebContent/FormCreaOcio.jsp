<form action="Form1OcioServlet">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

	<select name="nReserva" style="display:none">
		<option>${fn:length(transports) + 1}</option>
	</select>
	
	<select name="forClient" style="visibility:hidden"><option value="${cliente.dni}"> DNI </option></select>
	<select name="actividad">
		<option value="Seleccionar">Selecciona una opci�n</option> 
   		<option value="Entradas para esp�ctaculo">Entradas para espectaculo</option> 
   		<option value="Entrenador personal">Entrenador personal</option> 
	</select>
	<input type="text" class="fecha" name="fecha" placeholder="�Para cu�ndo desea el servicio?">
	<input type="text" class="precio" name="precio" placeholder="Presupuesto estimado">
	<input type="text" class="comentarios" name="addComents" placeholder="Comentarios adicionales,tipo de espect�culo...">
	<select name="status" style="display:none"><option value="1"></option></select>
	<select name="estado" style="display:none"><option value="Solicitado"></option></select>
	
	<button class="botonRegistro">Registrar actividad de ocio</button>
</form>
