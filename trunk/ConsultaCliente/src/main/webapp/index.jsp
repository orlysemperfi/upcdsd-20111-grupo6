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
														url : 'http://localhost:8086/rs-ServicioCliente/rest/cliente/consulta3/'+ $("#nombre").val()+"/"+ $("#apellido").val()+"/"+ $("#ciudad").val()+"/"+ $("#distrito").val(),
														type : 'GET',
														dataType: "json",
														success : function(data) {
															
															var n = $('tr:last td', $("#tbLista")).length;
													 
															$.each(data.Clientes, function(i,item){
															     // $("<img/>").attr("src", item.media.m).appendTo("#images");
															      
															      var tds = '<tr>';
																	for(var i = 0; i < n; i++){
																		
																		switch (i) {
																		    case 0:
																		    	tds += '<td>'+item.codigo+'</td>';
																		       break;
																		    case 1:
																		    	tds += '<td>'+item.nombre+'</td>';
																		       break;
																		    case 2:
																		    	tds += '<td>'+item.apellido+'</td>';
																		       break;
																		    case 3:
																		    	tds += '<td>'+item.ciudad+'</td>';
																		       break;
																		    case 4:
																		    	tds += '<td>'+item.distrito+'</td>';
																		       break;
																		    case 5:
																		    	tds += '<td>...</td>';
																		       break;
																		    case 6:
																		    	tds += '<td>...</td>';
																		       break;
																		} 
																		
																	}
																	tds += '</tr>';
																	$("#tbLista").append(tds);
																	
															    //  if ( i == 7 ){
															    //	  return false;  
															    //  } 
															});
																														 
															
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
  <tr>
    <td><h1>Consulta de Clientes</h1></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><img src="images/clientes.jpg" alt="" width="197" height="166" id="il_fi" /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td width="843" bgcolor="#CCCCCC" >
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
        <option value="Brena">Brena</option>
          <option value="San Isidro">San Isidro</option>
      </select>
    </label>
    </td>
    <td width="76">
      <label>
        <button>Consultar</button>
      </label>
    </td>
  </tr>
  <tr>
    <td colspan="2">
    
    <table width="1029" border="1" id="tbLista">
      <tr>
        <td colspan="7	">&nbsp;</td>
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
     
    </table>
    
    
    </td>
  </tr>
</table>
	

</body>
</html>