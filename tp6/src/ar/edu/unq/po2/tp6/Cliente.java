package ar.edu.unq.po2.tp6;

public class Cliente {
	private String nYAp;
	private String direccion;
	private Integer edad;
	private Double sueldoNetoMensual;

	public Double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public Double sueldoNetoAnual() {
		return getSueldoNetoMensual() * 12;
	}

	public void recibirCredito(Double monto) {
		
		
	}
}
