package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

public class EmpleadoTemporario extends Empleado {

	private int horasDeTrabajo;
	private String situacionSentimental;
	private int integrantes;

	public EmpleadoTemporario(int horasDeTrabajo, float sueldoBasico, String situacionPersonal, int integrantes) {
		this.setHorasDeTrabajo(horasDeTrabajo);
		this.setSueldoBasico(sueldoBasico);
		this.setSituacionSentimental(situacionPersonal);
		this.setIntegrantes(integrantes);
	}

	public int getHorasDeTrabajo() {
		return horasDeTrabajo;
	}

	public void setHorasDeTrabajo(int horasDeTrabajo) {
		this.horasDeTrabajo = horasDeTrabajo;
	}

	public String getSituacionSentimental() {
		return situacionSentimental;
	}

	public void setSituacionSentimental(String situacionSentimental) {
		this.situacionSentimental = situacionSentimental;
	}

	public int getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(int integrantes) {
		this.integrantes = integrantes;
	}

	protected Float calcularSueldoAPagar() {

		return getSueldoBasico() + plusPorSituacionPersonal() + pagoHorasExtras();
	}

	private float plusPorSituacionPersonal() {
		float plusAPagar = 0;
		if (esCasadoYOTieneHijos()) {
			plusAPagar = 100 * getIntegrantes();
		}
		return plusAPagar;
	}

	private Boolean esCasadoYOTieneHijos() {
		Boolean esCasado = getSituacionSentimental().equals("casado");
		Boolean tieneHijos = getSituacionSentimental().equals("con hijos");
		Boolean esCasadoConHijos = getSituacionSentimental().equals("casado con hijos");
		return esCasado || tieneHijos || esCasadoConHijos;
	}

	private Integer pagoHorasExtras() {
		return 5 * getHorasDeTrabajo();
	}

}
