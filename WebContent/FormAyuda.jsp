
<form action="FormAyudaServlet">
	<input type="text" name="descripcion" placeholder="Ayuda" class="textAyuda"  style="WIDTH: 500px; HEIGHT:20px">
	<select name="forClient" style="visibility:hidden"><option value="${cliente.dni}"> DNI </option></select>
	<button class="registrar">Registrar</button>
</form>
