package modeloParcial;

public class Bacilo extends Bacteria {

	private double longitud;

	public Bacilo(double longitud,int edad) {
		super(edad);
		this.longitud = longitud;
	}

	@Override
	public double consumoO2() {
		double resultado = 3 * this.longitud;
		if (super.getEdad() > 2) {
			return resultado / super.getEdad();
		}
		return resultado;
	}

}
