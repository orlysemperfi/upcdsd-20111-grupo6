package pe.edu.upc.dsd.ws;
import javax.jws.WebService;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.Cliente") 

public class Impl_Cliente implements Int_Cliente{
	public String saludar(String nombre) {
		   return "Hola " + nombre; 

	}

}
