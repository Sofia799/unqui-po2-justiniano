package ar.edu.unq.po2.tp10;

public class EmpleadoTemporario extends Empleado {

	private Integer cantidadHorasTrabajadas;
	private Boolean tieneHijos;
	private Boolean estaCasadx;

	public EmpleadoTemporario(Integer cantHoras, Boolean tieneHijos, Boolean estaCasadx) {
		this.cantidadHorasTrabajadas = cantHoras;
		this.tieneHijos = tieneHijos;
		this.estaCasadx = estaCasadx;
	}

	protected Double calcularSueldo() {
		return this.plusPorHorasTrabajadas() + this.sueldoBasico() + this.bonoPorFamilia();
	}

	private Double plusPorHorasTrabajadas() {
		return this.cantidadHorasTrabajadas * 5d;
	}

	private Double sueldoBasico() {
		return 1000d;
	}

	private Double bonoPorFamilia() {
		if (this.tieneHijos || this.estaCasadx) {
			return 100d;
		} else {
			return 0d;
		}

	}

}
