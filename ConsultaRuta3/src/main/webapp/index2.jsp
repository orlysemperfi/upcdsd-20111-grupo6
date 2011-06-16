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
														url : 'http://localhost:8080/rs-ServicioCliente/rest/cliente/consulta2/'
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
	<p>
		
		
	
		
	
	</p>
	<table width="988" border="0">
  <tr>
    <td><h1>Consulta de Clientes</h1></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><img src="images/clientes.jpg" alt="" width="197" height="166" id="il_fi" /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td width="843" bgcolor="#CCCCCC" ><form id="form1" name="form1" method="post" action="">
    Nombre: <input id="nombre" type="text" />
    Apellido: <input id="apellido" type="text" /> 
   <label>Ciudad
        <select name="ciudad" id="ciudad" >
          <option value="Lima">Lima</option>
          <option value="Cuzco">Cuzco</option>
          <option value="Arequipa">Arequipa</option>
          <option value="Tacna">Tacna</option>
      </select>
    </label>
    <label>Distrito
        <select name="distrito" id="distrito">
          <option value="San Isidro">San Isidro</option>
      </select>
    </label>
    </form></td>
    <td width="76">
      <label>
        <button>Consultar</button>
      </label>
    </td>
  </tr>
  <tr>
    <td colspan="2"><table width="1029" border="1">
      <tr>
        <td colspan="10">&nbsp;</td>
        </tr>
      <tr class="he1">
        <td width="46" bgcolor="#993300"><strong>Codigo</strong></td>
        <td width="79" bgcolor="#993300"><strong>Nombre</strong></td>
        <td width="88" bgcolor="#993300"><strong>Apellido</strong></td>
        <td width="68" bgcolor="#993300"><strong>Ciudad</strong></td>
        <td width="80" bgcolor="#993300"><strong>Distrito</strong></td>
        <td width="70" bgcolor="#993300"><strong>Viajes por Mes</strong></td>
        
        <td width="101" bgcolor="#993300"><strong>Detalle</strong></td>
      </tr>
      <tr>
        <td></td>
        <td><span id="nombre"></span></td>
        <td><span id="apellido"></span></td>
        <td><span id="ciudad"></span></td>
        <td><span id="distrito"></span></td>
        <td>4</td>
       
        <td><
          <input type="submit" name="button2" id="button2" value="Ver" />
        </td>
      </tr>
    </table></td>
  </tr>
</table>
	
</body>
</html>