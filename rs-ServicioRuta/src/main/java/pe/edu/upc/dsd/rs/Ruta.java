package pe.edu.upc.dsd.rs;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Ruta")

public class Ruta {
	
	private String codbus;
	private String codruta;
	private String salida;
	private String llegada;
	private String fechasalida;
	private String fechallegada;
	private String horasalida;
	private String horallegada;
	private String conductor;
	private String costo;
	private String asientos;
	
	public Ruta(){}
	
	public Ruta(String codbus, String codruta,String salida,String llegada, String fechasalida,
			String fechallegada, String horasalida, String horallegada, String conductor,
			String costo,String asientos) {
		super();
		this.codbus = codbus;
		this.codruta = codruta;
		this.salida = salida;
		this.llegada = llegada;
		this.fechasalida = fechasalida;
		this.fechallegada = fechallegada;
		this.horasalida = horasalida;
		this.horallegada = horallegada;
		this.conductor = conductor;
		this.costo = costo;
		this.asientos = asientos;
	}

	public String getSalida() {
		return salida;
	}

	public void setSalida(String salida) {
		this.salida = salida;
	}

	public String getLlegada() {
		return llegada;
	}

	public void setLlegada(String llegada) {
		this.llegada = llegada;
	}

	public String getCodbus() {
		return codbus;
	}

	public void setCodbus(String codbus) {
		this.codbus = codbus;
	}

	public String getCodruta() {
		return codruta;
	}

	public void setCodruta(String codruta) {
		this.codruta = codruta;
	}

	public String getFechasalida() {
		return fechasalida;
	}

	public void setFechasalida(String fechasalida) {
		this.fechasalida = fechasalida;
	}

	public String getFechallegada() {
		return fechallegada;
	}

	public void setFechallegada(String fechallegada) {
		this.fechallegada = fechallegada;
	}

	public String getHorasalida() {
		return horasalida;
	}

	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}

	public String getHorallegada() {
		return horallegada;
	}

	public void setHorallegada(String horallegada) {
		this.horallegada = horallegada;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	public String getAsientos() {
		return asientos;
	}

	public void setAsientos(String asientos) {
		this.asientos = asientos;
	}
}

	