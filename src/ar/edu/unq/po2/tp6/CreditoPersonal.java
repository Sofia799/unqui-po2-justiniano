package ar.edu.unq.po2.tp6;

public class CreditoPersonal implements ISolicitud {

	private float monto;
	private int cuotas;
	private String nombreCliente;

	public CreditoPersonal(String nombreCliente ,float monto, int cuotas) {
		this.setMonto(monto);
		this.setCuotas(cuotas);
		this.setNombreCliente(nombreCliente);
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public int getCuotas() {
		return cuotas;
	}

	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

}
