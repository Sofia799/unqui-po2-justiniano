package ar.edu.unq.po2.tp10;

public class EmpleadoPasante extends Empleado {

	private Integer cantidadHorasTrabajadasAlMes;

	protected Double calcularSueldo() {
		return this.cantidadHorasTrabajadasAlMes * 40d;
	}

}
