package ar.edu.unq.po2.tp6;

public abstract class SolicitudCredito {
	private Cliente cliente;
	private Double monto;
	private Integer plazoEnMeses;

	public SolicitudCredito(Cliente cliente, Double monto, Integer plazo) {
		this.setCliente(cliente);
		this.monto = monto;
		this.plazoEnMeses = plazo;
	}
	
	public Double montoCuotaMensual() {
		return this.monto / this.plazoEnMeses;
	}
	
	public Double getMonto() {
		return monto;
	}

	public abstract Boolean esAceptable();

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
