package ar.edu.unq.po2.tp6;

public class SolicitudCreditoPersonal extends SolicitudCredito{

	public SolicitudCreditoPersonal(Cliente cliente, Double monto, Integer plazo) {
		super(cliente, monto, plazo);
	}

	@Override
	public Boolean esAceptable() {
		return getCliente().sueldoNetoAnual() >= 1500 && 
				montoCuotaMensual() < setentaPorCientoIngresoMensual();
	}

	private Double setentaPorCientoIngresoMensual() {
		return getCliente().getSueldoNetoMensual() * 70 / 100;
	}
}
