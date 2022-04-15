package ar.edu.unq.po2.tp4;

public class IngresoPercibido {
	private String mesPercepcion;
	private String concepto;
	private Double montoPercibido;

	public IngresoPercibido(String mesPercepcion, String concepto, Double monto) {
		setMesPercepcion(mesPercepcion);
		setConcepto(concepto); 
		setMontoPercibido(monto);
	}

	public void setMesPercepcion(String mesPercepcion) {
		this.mesPercepcion = mesPercepcion;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public void setMontoPercibido(Double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}

	public Double getMontoPercibido() {
		return montoPercibido;
	}

	public Double montoImponible() {
		return getMontoPercibido();
	}

}
