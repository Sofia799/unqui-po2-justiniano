package ar.edu.unq.po2.tp6;

public class CreditoHipotecario implements ISolicitud {
	private float monto;
	private int cuotas;
	private String nombreCliente;
	private Inmobiliaria inmobiliaria;

	public CreditoHipotecario(String nombreCliente, float monto, int cuotas, Inmobiliaria inmobiliaria) {
		this.setNombreCliente(nombreCliente);
		this.setMonto(monto);
		this.setCuotas(cuotas);
		this.setInmobiliaria(inmobiliaria);
	}

	private void setInmobiliaria(Inmobiliaria inmobiliaria) {
		this.inmobiliaria = inmobiliaria;

	}

	@Override
	public int getCuotas() {

		return cuotas;
	}

	@Override
	public float getMonto() {

		return monto;
	}

	@Override
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public Inmobiliaria getInmobiliaria() {
		return inmobiliaria;
	}

}
