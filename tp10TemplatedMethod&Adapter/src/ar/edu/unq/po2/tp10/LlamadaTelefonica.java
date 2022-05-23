package ar.edu.unq.po2.tp10;

public abstract class LlamadaTelefonica {
	private int tiempo;
	private int horaDelDia;

	public LlamadaTelefonica(int tiempo, int horaDelDia) {
		this.tiempo = tiempo;
		this.horaDelDia = horaDelDia;
	}

	public int getTiempo() {
		return this.tiempo;
	} //operacion concreta

	public int getHoraDelDia() {
		return this.horaDelDia;
	} //operacion concreta

	public abstract boolean esHoraPico(); 
	// operacion primitiva

	public float costoFinal() {
		if (this.esHoraPico()) {
			return this.costoNeto() * 1.2f * this.getTiempo();
		} else {
			return this.costoNeto() * this.getTiempo();
		}
	} // templated method

	public float costoNeto() {
		return this.getTiempo() * 1;
	}//operacion concreta
}