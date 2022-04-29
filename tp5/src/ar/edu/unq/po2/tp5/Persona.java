package ar.edu.unq.po2.tp5;

import java.time.LocalDate;

public class Persona implements SerVivo{

	private String nombre;
	private LocalDate fechaNac;

	public Persona(String nombre, LocalDate fechaNac) {
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public Boolean menorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}

	public Integer getEdad() {
		LocalDate hoy = LocalDate.now();
		return hoy.compareTo(this.getFechaNac());
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

}
