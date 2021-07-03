package ar.edu.unq.po2.tp4.tpInterfaces;

import java.util.Date;

public class Persona extends SerVivo implements ISerVivo{

	String nombre;
	Date fechaDeNacimiento;
	Integer edad;

	public Persona(String nombre, Date fechaDeNacimiento) {
		this.setFechaDeNacimiento(fechaDeNacimiento);
		this.setNombre(nombre);
	}

	public Persona() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fecha) {
		this.fechaDeNacimiento = fecha;
	}

	public boolean esMenorQue(Persona unaPersona) {
		
		return this.getEdad() < unaPersona.getEdad();
	}

	private Integer getEdad() {
		
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
