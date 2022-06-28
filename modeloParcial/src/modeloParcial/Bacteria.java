package modeloParcial;

public abstract class Bacteria implements Consumidor{
	
	private int edad;
	
	public Bacteria(int edad) {
		this.edad = edad;
	}
	
	public boolean esInmediata() {
		return true;
	}

	protected int getEdad() {
		return edad;
	}

}
