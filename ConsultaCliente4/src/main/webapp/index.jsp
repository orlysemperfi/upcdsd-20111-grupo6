<html>
<head>
<title>Consulta Ruta por Destino</title>
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
														url : 'http://localhost:8080/rs-ServicioRuta/rest/ruta/consulta3/'+ $("#salida").val()+"/"+ $("#llegada").val()+"/"+ $("#horasalida").val(),
																								
														type : 'GET',
														dataType: "json",
														success : function(data) {
															
															var tam = $('#tbLista >tbody >tr').length;
															for( i = 0 ; i < tam ; i++){
																document.getElementById('tbLista').deleteRow(2);												
															}
															
															var n = $('tr:last td', $("#tbLista")).length;
													 
															$.each(data.Rutas, function(i,item){
															      
															      var tds = '<tr>';
																	for(var i = 0; i < n; i++){
																		
																		switch (i) {
																		    case 0:
																		    	tds += '<td>'+item.codruta+'</td>';
																		       break;
																		    case 1:
																		    	tds += '<td>'+item.fechasalida+'</td>';
																		       break;
																		    case 2:
																		    	tds += '<td>'+item.fechallegada+'</td>';
																		       break;
																		    case 3:
																		    	tds += '<td>'+item.horasalida+'</td>';
																		       break;
																		    case 4:
																		    	tds += '<td>'+item.horallegada+'</td>';
																		       break;
																		    case 5:
																		    	tds += '<td>'+item.conductor+'</td>';
																		       break;
																		    case 6:
																		    	tds += '<td>'+item.codbus+'</td>';
																		       break;
																		    case 7:
																		    	tds += '<td>'+item.costo+'</td>';
																		       break;
																		    case 8:
																		    	tds += '<td>'+item.asientos+'</td>';
																		       break;
																		    case 9:
																		    	tds += '<td>...</td>';
																		       break;
																		    
																		} 
																	
																	}
																	tds += '</tr>';
																	$("#tbLista").append(tds);
															
															});
																														 
													//		alert($("#salida").val());
														//	alert($("#llegada").val());
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
    <td><h1>Consulta Ruta por Destino</h1></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><img src="images/rutas.jpg" alt="" width="197" height="166" id="il_fi" /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td width="843" bgcolor="#CCCCCC" >

  <label>Lugar salida
        <select name="salida" id="salida">
          <option value="Lima">Lima</option>
          <option value="Cuzco">Cuzco</option>
          <option value="Arequipa">Arequipa</option>
        </select>
      </label>
      <label>Lugar Llegada
        <select name="llegada" id="llegada">
          <option value="Lima">Lima</option>
          <option value="Cuzco">Cuzco</option>
          <option value="Arequipa">Arequipa</option>
        </select>
      </label>
        <label>Fecha Salida
        <input type="text"  id="horasalida"/>
      </label>
    </td>
    <td width="76">
      <label>
        <button>Consultar</button>
      </label>
    </td>
  </tr>
  <tr>
    <td colspan="2"><table width="971" border="1" id="tbLista">
    <thead>
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
 </thead>
<tbody>
     </tbody>
     
    </table></td>
  </tr>
</table>
</body>
</html>