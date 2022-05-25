package ar.edu.unq.po2.tp10;

public abstract class Empleado {
	
	public final Double sueldo() {
		Double sueldo = calcularSueldo();
		Double descuento = this.descuentoEnAportesYObraSocial(sueldo);
		return sueldo - descuento;
	}

	protected Double descuentoEnAportesYObraSocial(Double sueldo) {
		return sueldo * 13 / 100;
	}

	protected abstract Double calcularSueldo();

}
