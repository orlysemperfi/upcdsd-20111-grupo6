<html>
<head>
<title>Consulta de Clientes</title>
<style type="text/css">
body,td,th {
	font-family: Verdana, Geneva, sans-serif;
	font-weight: bold;
	text-align: center;
	font-size: 14px;
}
.he1 {
	color: #FFF;
}
</style>

<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(document)
			.ready(
					function() {
						$("button")
								.click(
										function() {
											$
													.ajax({		
														url : 'http://localhost:8080/rs-ServicioCliente/rest/ruta/consulta/'
																+ $("#nombre")+"/"+ $("#apellido")+"/"+ $("#ciudad")+"/"+ $("#distrito")
																		.val(),
														type : 'GET',
														success : function(data) {
															$("#nombre").html(data.nombre);
															$("#apellido").html(data.apellido);
															$("#ciudad").html(data.apellido);
															$("#distrito").html(data.apellido);
															
															 alert("ha retornado a " + data.nombre + " / " + data.apellido);
															
														},
														error : function(data) {
															alert("Error");
														}
													});
										});
					});
</script>
</head>
<body>
<table width="988" border="0">
  <tr>
    <td><h1>Consulta Ruta por Destino</h1></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><img src="images/rutas.jpg" alt="" width="197" height="166" id="il_fi" /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td width="843" bgcolor="#CCCCCC" ><form id="form1" name="form1" method="post" action="">
      <label>Fecha Salida
        <input type="text"  value="01/01/2011" name="textfield" id="textfield" />
      </label>
      <label>Fecha Llegada
        <input type="text" value="01/01/2011" name="textfield2" id="textfield2" />
      </label>
      <label>Lugar salida
        <select name="select" id="select">
          <option value="Lima">Lima</option>
        </select>
      </label>
      <label>Lugar llegada
        <select name="select2" id="select2">
          <option value="Cuzco">Cuzco</option>
        </select>
      </label>
    </form></td>
    <td width="76"><form id="form2" name="form2" method="post" action="">
      <label>
        <input type="submit" name="button" id="button" value="Consultar" />
      </label>
    </form></td>
  </tr>
  <tr>
    <td colspan="2"><table width="971" border="1">
      <tr>
        <td colspan="10">&nbsp;</td>
        </tr>
      <tr class="he1">
        <td width="46" bgcolor="#993300"><strong>Codigo</strong></td>
        <td width="79" bgcolor="#993300"><strong>Fecha Salida</strong></td>
        <td width="88" bgcolor="#993300"><strong>Fecha Llegada</strong></td>
        <td width="68" bgcolor="#993300"><strong>Hora Salida</strong></td>
        <td width="80" bgcolor="#993300"><strong>Hora Llegada</strong></td>
        <td width="70" bgcolor="#993300"><strong>Conductor</strong></td>
        <td width="69" bgcolor="#993300"><strong>Codigo Bus</strong></td>
        <td width="92" bgcolor="#993300"><strong>Costo</strong></td>
        <td width="87" bgcolor="#993300"><strong>Asientos Disponibles</strong></td>
        <td width="101" bgcolor="#993300"><strong>Detalle</strong></td>
      </tr>
      <tr>
        <td>R0001</td>
        <td>01/01/2011</td>
        <td>02/01/2011</td>
        <td>08:00 a.m</td>
        <td>01:00 p.m</td>
        <td>Luis Murga</td>
        <td>B0001</td>
        <td>S/. 14.00</td>
        <td>29</td>
        <td><form id="form3" name="form3" method="post" action="">
          <input type="submit" name="button2" id="button2" value="Ver" />
        </form></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>