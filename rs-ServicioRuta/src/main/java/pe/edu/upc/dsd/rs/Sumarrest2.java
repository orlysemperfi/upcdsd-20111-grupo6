package pe.edu.upc.dsd.rs;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("/calculadora")


   
   
public class Sumarrest2 {
	
	@GET
	@Path("/sumar/{op1}/{op2}")
   @Produces("plain/text")
      
    public String sumar(@PathParam("op1") int op1,@PathParam("op2") int op2) {

		
		int suma=op1+op2;
		
		String suma2= String.valueOf(suma);
    
    
 
   return suma2;
   
   

	}
	
	}
