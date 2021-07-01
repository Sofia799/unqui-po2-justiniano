package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

public class CuentaCorriente extends CuentaBancaria {
	private int descubierto;

	public CuentaCorriente(String titular, int descubierto) {
		super(titular);
		this.descubierto = descubierto;
	}

//	@Override
//	public void estraer(int monto) {
//		if (getSaldo() + getDescubierto() >= monto) {
//			setSaldo(getSaldo() - monto);
//			agregarMovimientos("Extraccion");
//		}
//
//	}

	public int getDescubierto() {
		return descubierto;
	}

	@Override
	protected boolean validar(int monto) {
		
		return getSaldo() + getDescubierto() >= monto;
	}

}
