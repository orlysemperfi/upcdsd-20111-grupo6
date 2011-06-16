<html>
<head>
<title>Registro de Clientes</title>
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
														url : 'http://localhost:8080/rs-ServicioCliente/rest/cliente/registra/'+ $("#codigo").val()+"/"+ $("#nombre").val()+"/"+ $("#apellido").val()+"/"+ $("#ciudad").val()+"/"+ $("#distrito").val()+"/" + $("#direccion").val()+"/"+ $("#dni").val()+"/"+$("#telefono").val(),
														type : 'GET',
														dataType: "json",
														success : function(data) {
															alert("guardo con éxito" + data);														 
															
														},

														error : function(data) {
															alert("Error" + data);
														}
													});
										});
					});
</script>
</head>
<body>

	
	<table width="988" border="0">
    <td width="843"><h1>Registro de Clientes</h1></td>
    <td width="76">&nbsp;</td>
  </tr>
  <tr>
    <td><img src="images/clientes3.jpg" alt="" width="259" height="194" id="rg_hi" data-width="259" data-height="194" /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td colspan="2" bgcolor="#CCCCCC" >&nbsp;</td>
  </tr>
  <tr>
    <td colspan="2" bgcolor="#993300"><table width="635" border="1" align="center" bgcolor="#FFFFFF">
      
        <tr>
          <td width="152" >Codigo:</td>
        <td width="467" ><input id="codigo" type="text" value="C0002" /></td>
        <td width="467" ><button>Guardar</button></td>
        
        </tr>
        <tr>
        <td>Nombre:</td>
        <td><input id="nombre" type="text" /></td>
        <td rowspan="6">&nbsp;</td>
      </tr>
      <tr>
        <td>Apellido:</td>
        <td><input id="apellido" type="text" /></td>
        <td rowspan="6">&nbsp;</td>
      </tr>
      <tr>
        <td>Ciudad:</td>
        <td>
          <select name="ciudad" id="ciudad" >
          <option value="Lima">Lima</option>
          <option value="Cuzco">Cuzco</option>
          <option value="Arequipa">Arequipa</option>
          <option value="Tacna">Tacna</option>
      </select>
        </td>
        </tr>
      <tr>
        <td>Distrito:</td>
        <td><select name="distrito" id="distrito">
        <option value="Brena">Brena</option>
          <option value="San Isidro">San Isidro</option>
      </select>
          
          
        </td>
        </tr>
      <tr>
        <td>Direccion:</td>
        <td><input id="direccion" type="text" /></td>
        </tr>
      <tr>
        <td>Dni:</td>
        <td><input id="dni" type="text" /></td>
        </tr>
      <tr>
        <td>Telefono:</td>
        <td><input id="telefono" type="text" /></td>
        </tr>
 
    </table></td>
  </tr>
</table>
</body>
</html>