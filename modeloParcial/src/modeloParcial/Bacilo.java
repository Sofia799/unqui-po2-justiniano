package modeloParcial;

public class Bacilo extends Bacteria {

	private int longitud;

	public Bacilo(int longitud,int edad) {
		super(edad);
		this.longitud = longitud;
	}

	@Override
	public Integer consumoO2() {
		int resultado = 3 * this.longitud;
		if (super.getEdad() > 2) {
			return resultado / super.getEdad();
		}
		return resultado;
	}

}
