package pe.edu.upc.dsd.rs;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

public class ClienteService {
	
	
	@GET
	@Path ("/cliente/{codigo}")
	@Produces("application/json")
	
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

}
