package pe.edu.upc.dsd.ws;
import javax.jws.WebService;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.Int_ConsultarCliente") 

public class Impl_ConsultarCliente implements Int_ConsultarCliente{
	public String saludar(String nombre) {
		   return "Hola " + nombre; 

	}

}
