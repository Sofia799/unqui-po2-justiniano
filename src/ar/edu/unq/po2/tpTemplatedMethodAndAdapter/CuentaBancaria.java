package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
	private String titular;
	private int saldo;
	private List<String> movimientos;

	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.setSaldo(0);
		this.movimientos = new ArrayList<String>();
	}

	public int getSaldo() {
		return saldo;
	}

	protected void setSaldo(int monto) {
		this.saldo = monto;
	}

	public String getTitular() {
		return titular;
	}

	public void agregarMovimientos(String movimiento) {
		movimientos.add(movimiento);
	}

	// public abstract void estraer(int monto);

	// se cambió el método extraer como templated method y el mensaje validar como
	// método
	// abstracto para q cada subclase la implemente, ya que era lo único que tenían
	// diferente
	// entre ambas

	public final void extraer(int monto) {
		if (validar(monto)) {
			setSaldo(getSaldo() - monto);
			agregarMovimientos("Extraccion");
		}
	}

	protected abstract boolean validar(int monto);

}
