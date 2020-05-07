<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<form action="FormAyudaServlet">
    <select name="nAyuda" style="display:none">
		<option>${fn:length(ayudas) + 1}</option>
	</select>
	<input type="text" name="descripcion" placeholder="Ayuda" class="textAyuda"  style="WIDTH: 500px; HEIGHT:20px">
	<select name="forClient" style="visibility:hidden"><option value="${cliente.dni}"> DNI </option></select>
	<button class="registrar">Registrar</button>
</form>
