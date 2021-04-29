package ar.edu.unq.po2.tp3;

import java.util.Date;

public class Persona {
	
	private String nombre;
	private String apellido;
	private Integer edad;
	private Date fechaDeNacimiento;
	

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
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
	public boolean menorQue(Persona persona) {
		return this.edad < persona.edad;
		
	}
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, Date fechaNacimiento) {
		this.setNombre(nombre);
		this.setFechaDeNacimiento(fechaNacimiento);
	}
}
