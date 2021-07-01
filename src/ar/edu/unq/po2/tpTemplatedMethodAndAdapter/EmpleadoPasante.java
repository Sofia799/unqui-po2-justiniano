package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

public class EmpleadoPasante extends Empleado {

	private int horasDeTrabajo;

	public EmpleadoPasante(int horasDeTrabajo) {
		this.setHorasDeTrabajo(horasDeTrabajo);
	}

	public int getHorasDeTrabajo() {
		return horasDeTrabajo;
	}

	public void setHorasDeTrabajo(int horasDeTrabajo) {
		this.horasDeTrabajo = horasDeTrabajo;
	}

	protected Float calcularSueldoAPagar() {
		return 40f * horasTrabajadasAlMes();
	}

	private int horasTrabajadasAlMes() {
		
		return getHorasDeTrabajo() * 30;
	}

}
