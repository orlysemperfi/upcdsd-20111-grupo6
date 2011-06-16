<html>
<head>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(document)
			.ready(
					function() {
						$("button").click( function() {						
									$.ajax({		
										url : 'http://localhost:8080/rs-ServicioCliente/rest/cliente/consulta/' + $("#codigo").val(),
										type : 'GET',
										dataType: "json",
										success : function(data) {				
											
											$("#nombre").html(data.nombre);
											$("#apellido").html(data.apellido);
											 
										},
										error : function(data) {
											alert("Error "+ data ) ;
										}
									});
								});
					});
</script>
</head>
<body>
	<p>
		Codigo Cliente: <input id="codigo" type="text" />
		<button>Consultar</button><br />
		
		Nombre2:  <span id="nombre"></span><br />
		Apellido2: <span id="apellido"></span><br />
	
	</p>
</body>
</html>
