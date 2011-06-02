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
															$("#ciudad")
																	.html(
																	data.ciudad);
															$("#distrito")
																	.html(
																	data.distrito);
															$("#direccion")
																	.html(
																	data.direccion);
															$("#dni")
																	.html(
																	data.dni);
															$("#telefono")
																	.html(
																	data.telefono);
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
		<button>Consultar</button>
	
		Nombre: <span id="nombre"></span><br /> Apellido: <span id="apellido"></span><br />
	
		ciudad: <span id="ciudad"></span><br /> distrito: <span id="distrito"></span><br />
	
		direccion: <span id="direccion"></span><br /> 
	
		dni: <span id="dni"></span><br /> telefono: <span id="telefono"></span><br />
	</p>
</body>
</html>
