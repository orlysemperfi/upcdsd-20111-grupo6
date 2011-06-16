package pe.edu.upc.dsd.rs;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.google.gson.Gson;
import org.apache.log4j.Logger;



@Path ("/ruta")
public class RutaService {
	
	private static final Logger logger = Logger
	.getLogger(RutaService.class);
	/*@GET
	@Path ("/cliente/{codigo}")
	@Produces("application/json")*/
	
	
	@GET 
	    @Path("/consulta/{destino}") 
	    @Produces("application/json")//("text/plain") 
		public String getCliente (@PathParam("destino") String destino){
			Gson gson = new Gson();
			Ruta ruta = new Ruta();
ruta.setCodbus("B001");
ruta.setCodruta("R001");
ruta.setSalida("Arequipa");
ruta.setLlegada("Lima");
ruta.setCodruta("R001");
ruta.setFechasalida("19/04/2010");
ruta.setFechallegada("19/04/2010");
ruta.setHorasalida("18:00:00");
ruta.setHorallegada("06:00:00");
ruta.setConductor("Mario Perez");
ruta.setCosto("13 Soles");
ruta.setAsientos("29");

			//System.out.println("CLIENTE: C0001 ");
			logger.debug("Destino: " + destino);
			return gson.toJson(ruta); 
		}
	
	
	@GET 
    @Path("/consulta2/{destino}/{llegada}/{horasalida}") 
    @Produces("application/json")
	public String getClientes (@PathParam("destino") String destino, @PathParam("llegada") String llegada, @PathParam("horasalida") String horasalida) {
		Gson gson = new Gson();
		Ruta ruta = new Ruta();
		ruta.setCodbus("B001");
		ruta.setCodruta("R001");
		ruta.setSalida("Arequipa");
		ruta.setLlegada("Lima");
		ruta.setFechasalida("19/04/2010");
		ruta.setFechallegada("19/04/2010");
		ruta.setHorasalida("18:00:00");
		ruta.setHorallegada("06:00:00");
		ruta.setConductor("Mario Perez");
		ruta.setCosto("13 Soles");
		ruta.setAsientos("29");

		//System.out.println("CLIENTE: C0001 ");
		logger.debug("Consulta Rutas: " + destino + " " + llegada + " " + horasalida );
		return gson.toJson(ruta); 
	}
	
	@GET 
    @Path("/consulta3/{destino}/{llegada}/{horasalida}") 
    @Produces("application/json")
	public List<Ruta> getListaClientes (@PathParam("destino") String destino, @PathParam("llegada") String llegada, @PathParam("horasalida") String horasalida){
		logger.debug("Consultando...");
		List<Ruta> lista = new ArrayList<Ruta>();
		Ruta ruta = new Ruta();
		ruta.setCodbus("B001");
		ruta.setCodruta("R001");
		ruta.setSalida("Arequipa");
		ruta.setLlegada("Lima");
		ruta.setFechasalida("19/04/2010");
		ruta.setFechallegada("19/04/2010");
		ruta.setHorasalida("18:00:00");
		ruta.setHorallegada("06:00:00");
		ruta.setConductor("Mario Perez");
		ruta.setCosto("13 Soles");
		ruta.setAsientos("29");
		lista.add(ruta);
		lista.add(new Ruta("B002", "R002", "Arequipa", "Lima", "19/04/2010", "19/04/2010", "19:00:00", "22:00:00" ,"Mario Perez", "19 Soles", "26"));
		lista.add(new Ruta("B003", "R003", "Lima", "Arequipa", "20/04/2010", "22/04/2010", "21:00:00","06:00:00", "Mario Perez", "18 Soles", "25"));
		//lista.add(new Ruta("B004", "R004", "Cuzco", "Lima", "21/04/2010", "22/04/2010", "22:00:00", "03:00:00","Mario Perez", "16 Soles", "24"));
		//System.out.println("CLIENTE: C0001 ");
		logger.debug("Consulta Rutas: " + lista.size() + " registros encontrados");
		return lista; 
	}
	
	

		@GET 
		@Path("/listar/{destino}") 
		@Produces("text/plain") 
		public String listar(@PathParam("destino") String destino) { 
			logger.debug("Lista Ruta: " + destino);
		        return destino; 
		} 

	 

}
