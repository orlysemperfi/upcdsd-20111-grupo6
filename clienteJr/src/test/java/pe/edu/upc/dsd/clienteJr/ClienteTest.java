package pe.edu.upc.dsd.clienteJr;

import org.junit.Assert;
import org.junit.Test;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class ClienteTest {
	private Cliente cliente;            
	public ClienteTest() {                  
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/applicationContext.xml");
		this.cliente = context.getBean("cliente", Cliente.class);          
		}            
	@Test          
	public void testSaludar() {                  
		Assert.assertEquals("Hola Lennon", cliente.saludar("Lennon"));          
		}  

}
