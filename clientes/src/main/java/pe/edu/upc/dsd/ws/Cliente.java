package pe.edu.upc.dsd.ws;
import javax.jws.WebService;

@WebService  
public interface Cliente {
	public String saludar(String nombre);
}
