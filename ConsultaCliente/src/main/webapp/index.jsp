<html>
<head>
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
														url : 'http://localhost:8080/rs-ServicioCliente/rest/cliente/consulta/'
																+ $("#codigo")
																		.val(),
														type : 'GET',
														success : function(data) {
															$("#nombre")
																	.html(
																			data.nombre);
															$("#apellido")
																	.html(
																			data.apellido);
															alert("entro"); 
															
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
		Codigo Cliente: <input id="codigo" type="text" />
		<button>Consultar</button><br />
	
		Nombre: <span id="nombre"></span><br /> Apellido: <span id="apellido"></span><br />
	
	</p>
</body>
</html>
