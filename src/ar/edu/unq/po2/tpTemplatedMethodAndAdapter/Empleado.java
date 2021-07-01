package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

public abstract class Empleado {

	private float sueldoBasico;

	public Empleado() {

	}

	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public final Float sueldo() {
		Float sueldoAPagar = calcularSueldoAPagar();
		Float sueldoTotalConDescuento = sueldoAPagar - descuentoDeSueldoPorAportes(sueldoAPagar, 13);
		return sueldoTotalConDescuento;
	}

	protected abstract Float calcularSueldoAPagar();

	private float descuentoDeSueldoPorAportes(float sueldo, int porcentaje) {
		float sueldoDescontado = (sueldo * porcentaje) / 100;
		return sueldoDescontado;
	}

}
