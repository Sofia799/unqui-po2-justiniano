package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

public class Persona {
	String nombre;
	String apellido;
	LocalDate fechaNacimiento;

	public Persona(String nombre, LocalDate fechaNacimiento) {
		setNombre(nombre);
		setFechaNacimiento(fechaNacimiento);
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer edad() {
		Integer edad = LocalDate.now().compareTo(fechaNacimiento);

		return edad;
	}

	public Boolean menorQue(Persona persona) {
		return edad() < persona.edad();
	}

}
