package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

public class LlamadaDescuento extends LlamadaTelefonica{

	public LlamadaDescuento(int tiempo, int horaDelDia) {
		super(tiempo, horaDelDia);
	}

	@Override
	public boolean esHoraPico() {
		
		return false;
	}
	
	public float costoNeto() {
		return this.getTiempo() * 0.95f;
	}

}
