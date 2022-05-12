package ar.edu.unq.po2.tp6;

public class SolicitudCreditoHipotecario extends SolicitudCredito {
	
	private PropiedadInmobiliaria propiedad;

	public SolicitudCreditoHipotecario(Cliente cliente, Double monto, Integer plazo, PropiedadInmobiliaria propiedad) {
		super(cliente, monto, plazo);
		this.propiedad = propiedad;

	}

	@Override
	public Boolean esAceptable() {
		return montoCuotaMensual() < cincuentaPorCientoIngresoMensual() &&
				getMonto() < setentaPorCientoValorFiscal();
	}

	private Double setentaPorCientoValorFiscal() {
		return propiedad.getValorFiscal() * 70 / 100;
	}

	private Double cincuentaPorCientoIngresoMensual() {
		return getCliente().getSueldoNetoMensual() * 50 / 100;
	}

}
