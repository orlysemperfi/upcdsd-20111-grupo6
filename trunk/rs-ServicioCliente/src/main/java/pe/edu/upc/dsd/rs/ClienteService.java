package pe.edu.upc.dsd.rs;
import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import org.apache.log4j.Logger;



@Path ("/cliente")
public class ClienteService {
	
	private static final Logger logger = Logger
	.getLogger(ClienteService.class);
	/*@GET
	@Path ("/cliente/{codigo}")
	@Produces("application/json")*/
	
	
	@GET 
	    @Path("/consulta/{codigo}") 
	    @Produces("application/json")//("text/plain") 
		public String getCliente (@PathParam("codigo") String codigo){
			Gson gson = new Gson();
			Cliente cliente = new Cliente();
			cliente.setCodigo("C0001");
			cliente.setNombre("Junior");
			cliente.setApellido("Rufasto");
			cliente.setCiudad("Lima");
			cliente.setDistrito("Breña");
			cliente.setDireccion("Av. Nueva York");
			cliente.setDni("4904994");
			cliente.setTelefono("99441514");
			//System.out.println("CLIENTE: C0001 ");
			logger.debug("Cliente: " + codigo);
			return gson.toJson(cliente); 
		}
	
	@GET 
    @Path("/consulta2/{nombre}/{apellido}/{ciudad}/{distrito}") 
    @Produces("application/json")
	public String getClientes (@PathParam("nombre") String nombre, @PathParam("apellido") String apellido, @PathParam("ciudad") String ciudad, @PathParam("distrito") String distrito){
		Gson gson = new Gson();
		Cliente cliente = new Cliente();
		cliente.setCodigo("C0001");
		cliente.setNombre("Junior");
		cliente.setApellido("Rufasto");
		cliente.setCiudad("Lima");
		cliente.setDistrito("Brena");
		cliente.setDireccion("Av. Nueva York");
		cliente.setDni("4904994");
		cliente.setTelefono("99441514");
		//System.out.println("CLIENTE: C0001 ");
		logger.debug("Consulta Clientes: " + nombre);
		return gson.toJson(cliente); 
	}
	

		@GET 
		@Path("/listar/{nombre}") 
		@Produces("text/plain") 
		public String listar(@PathParam("nombre") String nombre) { 
			logger.debug("Lista Cliente: " + nombre);
		        return nombre; 
		} 
	
	/*@Path("/HelloWorld") 
	public class HelloWorld { 
	 
	        @GET 
	        @Path("/saludar") 
	        @Produces("text/plain") 
	        public String saludar() { 
	                return "Hola mundo!!!"; 
	        } 
	 
	        @GET 
	        @Path("/saludar/{nombre}") 
	        @Produces("text/plain") 
	        public String saludar(@PathParam("nombre") String nombre) { 
	                return "Hola " + nombre; 
	        } 
	 
	} */

	

}
