package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

public class EmpleadoDePlanta extends Empleado {

	private int cantidadDeHijos;

	public EmpleadoDePlanta(int cantidadHijos, float sueldoBasico) {
		this.setCantidadDeHijos(cantidadHijos);
		this.setSueldoBasico(sueldoBasico);
	}

	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}

	protected Float calcularSueldoAPagar() {
		return getSueldoBasico() + plusPorHijos();
	}

	private int plusPorHijos() {
		return 150 * getCantidadDeHijos();
	}

}
