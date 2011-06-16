package pe.edu.upc.dsd.rs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import junit.framework.Assert;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Test;

public class consultarRuta {
	@Test
	public void test() throws Exception {
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(
				"http://localhost:8080/rs-ServicioRuta/rest/ruta/consulta/Arequipa");
		HttpResponse response = httpclient.execute(httpget);
		HttpEntity entity = response.getEntity();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				entity.getContent()));
		Assert.assertEquals("\"B001\"", reader.readLine());


	}
	
	
}
