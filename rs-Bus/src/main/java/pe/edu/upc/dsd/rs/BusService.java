package pe.edu.upc.dsd.rs;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
public class BusService {
	
	
	@GET
	@Path ("/bus/{codigo}")
	@Produces("application/json")
	
	public String getBus (@PathParam("codigo") String codigo){
		Gson gson = new Gson();
		Bus bus = new Bus();
		bus.setCodigo("B0001");
		bus.setRuta("Lima-Tacna");
		bus.setHoraEntrada("09:00 a.m");
		bus.setHoraSalida("11:00 a.m");
		bus.setCapacidad("50");
		bus.setDisponible("15");
		
		
		
		return gson.toJson(codigo); 
	}

}
