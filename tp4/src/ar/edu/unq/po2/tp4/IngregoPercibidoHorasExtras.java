package ar.edu.unq.po2.tp4;

public class IngregoPercibidoHorasExtras extends IngresoPercibido {
	private Integer cantHorasExtras;

	public IngregoPercibidoHorasExtras(String mesPercepcion, String concepto, Double montoPercibido,
			Integer cantHorasExtras) {
		super(mesPercepcion, concepto, montoPercibido);
		setCantHorasExtras(cantHorasExtras);
	}

	public void setCantHorasExtras(Integer cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}
	
	public Double montoImponible() {
		return 0.0;
	}

}
