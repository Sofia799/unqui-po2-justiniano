package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

public class CajaDeAhorro extends CuentaBancaria{
	private int limite;

	public CajaDeAhorro(String titular, int limite) {
		super(titular);
		this.limite = limite;
	}

//	@Override
//	public void estraer(int monto) {
//		if (getSaldo() >= monto && getLimite() >= monto) {
//			setSaldo(getSaldo() - monto);
//			agregarMovimientos("Extraccion");
//		}
//		
//	}

	public int getLimite() {
		return limite;
	}

	@Override
	protected boolean validar(int monto) {
		
		return getSaldo() >= monto && getLimite() >= monto;
	}

}
