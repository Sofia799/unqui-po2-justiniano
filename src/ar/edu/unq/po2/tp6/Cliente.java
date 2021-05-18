package ar.edu.unq.po2.tp6;

public class Cliente {
	
	private String nombre;
	private String direccion;
	private Integer edad;
	private float sueldoNetoMensual;
	private float sueldoNetoAnual;
	private ISolicitud solicitud;
	

	public Cliente(String nombre, String direccion, Integer edad, float sueldoMensual, float sueldoAnual, ISolicitud solicitud) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoMensual;
		this.sueldoNetoAnual = sueldoAnual;
		this.setSolicitud(solicitud);
	}

	public Cliente(String nombre, String direccion, Integer edad, float sueldoMensual, float sueldoAnual) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoMensual;
		this.sueldoNetoAnual = sueldoAnual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public float getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(float sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public float getSueldoNetoAnual() {
		return sueldoNetoAnual;
	}

	public void setSueldoNetoAnual(float sueldoNetoAnual) {
		this.sueldoNetoAnual = sueldoNetoAnual;
	}

	public ISolicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(ISolicitud solicitud) {
		this.solicitud = solicitud;
	}

}
