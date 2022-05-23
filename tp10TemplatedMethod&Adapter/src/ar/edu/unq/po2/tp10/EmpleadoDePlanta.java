package ar.edu.unq.po2.tp10;

public class EmpleadoDePlanta extends Empleado {

	private Integer cantidadHijos;

	protected Double calcularSueldo() {
		return this.sueldoBasico() + this.plusPorHijos();
	}

	private Double plusPorHijos() {
		return this.cantidadHijos * 150d;
	}

	private Double sueldoBasico() {
		return 3000d;
	}

}
