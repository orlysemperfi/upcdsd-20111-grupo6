package pe.edu.upc.dsd.rs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Cliente")
public class Cliente {
	
	private String codigo;
	private String nombre;
	private String apellido;
	private String ciudad;
	private String distrito;
	private String direccion;
	private String dni;
	private String telefono;
	
	public Cliente(){}
	
	public Cliente(String codigo, String nombre, String apellido,
			String ciudad, String distrito, String direccion, String dni,
			String telefono) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
		this.distrito = distrito;
		this.direccion = direccion;
		this.dni = dni;
		this.telefono = telefono;
	}

	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
		
	

}

