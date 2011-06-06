package pe.edu.upc.dsd.rs;
import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

@Path ("/cliente")
public class ClienteService {
	
	
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
		return gson.toJson(codigo); 
	}


		@GET 
		@Path("/listar/{nombre}") 
		@Produces("text/plain") 
		public String listar(@PathParam("nombre") String nombre) { 
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
