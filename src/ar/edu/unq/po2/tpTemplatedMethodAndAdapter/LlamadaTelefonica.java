package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

public abstract class LlamadaTelefonica {

	private int tiempo;
	private int horaDelDia;

	public LlamadaTelefonica(int tiempo, int horaDelDia) {
		this.tiempo = tiempo;
		this.horaDelDia = horaDelDia;
	}

	public int getTiempo() {
		return this.tiempo;
	}

	public int getHoraDelDia() {
		return this.horaDelDia;
	}

	public abstract boolean esHoraPico(); // Operacion primitiva que define la clase abstracta

	public float costoFinal() {

		if (this.esHoraPico()) {
			return this.costoNeto() * 1.2f * this.getTiempo();
		} else {
			return this.costoNeto() * this.getTiempo();
		}
	}

	public float costoNeto() {
		return this.getTiempo() * 1;
	}
	
	/*
	 * No tiene Templated Method ya que los métodos implementados en esta clase abstracta
	 * no tiene metodos que se indique el "final", es decir, que no pueden redefinirse en las
	 * subclases. La mayoría son métodos concretos o pasos
	 * opcionales de la cual las subclases pueden redefinir , como "costoNeto".
	 * Tampoco hay hook method, es decir, no hay implementaciones vacías de métodos.
	 */

}
