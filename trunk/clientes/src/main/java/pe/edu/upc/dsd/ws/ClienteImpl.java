package pe.edu.upc.dsd.ws;
import javax.jws.WebService;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.Cliente") 

public class ClienteImpl implements Cliente{
	public String saludar(String nombre) {
		   return "Hola " + nombre; 

	}

}
