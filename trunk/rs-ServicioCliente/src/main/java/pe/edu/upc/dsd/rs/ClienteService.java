package pe.edu.upc.dsd.rs;

import java.util.ArrayList;
import java.util.List;
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
		logger.debug("Consulta Clientes: " + nombre + " " + apellido + " " + ciudad + " " + distrito);
		return gson.toJson(cliente); 
	}
	
	@GET 
    @Path("/consulta3/{nombre}/{apellido}/{ciudad}/{distrito}") 
    @Produces("application/json")
	public List<Cliente> getListaClientes (@PathParam("nombre") String nombre, @PathParam("apellido") String apellido, @PathParam("ciudad") String ciudad, @PathParam("distrito") String distrito){
		logger.debug("Consultando...");
		List<Cliente> lista = new ArrayList<Cliente>();
		Cliente cliente = new Cliente();
		cliente.setCodigo("C0001");
		cliente.setNombre("Junior");
		cliente.setApellido("Rufasto");
		cliente.setCiudad("Lima");
		cliente.setDistrito("Brena");
		cliente.setDireccion("Av. Nueva York");
		cliente.setDni("4904994");
		cliente.setTelefono("99441514");
		lista.add(cliente);
		lista.add(new Cliente("C0002", "Elvis", "Campos", "Lima", "comas", "Jr. Ciro Alegria 236", "3456789", "34567890987"));
		lista.add(new Cliente("C0003", "Merlyn", "Enriquez", "Lima", "San Isidro", "Calle veintisiete", "3456789", "34567890987"));
		lista.add(new Cliente("C0004", "Melissa", "Espinoza", "Lima", "Callao", "Bellavista", "3456789", "34567890987"));
		//System.out.println("CLIENTE: C0001 ");
		logger.debug("Consulta Clientes: " + lista.size() + " registros encontrados");
		return lista; 
	}
	
	
	@GET 
    @Path("/registra/{codigo}/{nombre}/{apellido}/{ciudad}/{distrito}/{direccion}/{dni}/{telefono}") 
    @Produces("application/json")//("text/plain") 
	public int getRegistraCliente (@PathParam("codigo") String codigo,@PathParam("nombre") String nombre, @PathParam("apellido") String apellido, @PathParam("ciudad") String ciudad, @PathParam("distrito") String distrito, @PathParam("direccion") String direccion, @PathParam("dni") String dni, @PathParam("telefono") String telefono){
		logger.debug("Guardando...");
		Gson gson = new Gson();
		Cliente cliente = new Cliente();
		cliente.setCodigo(codigo);
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setCiudad(ciudad);
		cliente.setDistrito(distrito);
		cliente.setDireccion(direccion);
		cliente.setDni(dni);
		cliente.setTelefono(telefono);
		
			try{   
				logger.debug("Se guardó con éxito el cliente: " + codigo);
				return 1;  
			  }   
			  catch(NumberFormatException ex){  
				  logger.debug("No se pudo guardar el cliente, llene todos los datos");
				  return 0;
			      
			  }   

	}

		@GET 
		@Path("/listar/{nombre}") 
		@Produces("text/plain") 
		public String listar(@PathParam("nombre") String nombre) { 
			logger.debug("Lista Cliente: " + nombre);
		        return nombre; 
		} 
	
	

	

}
