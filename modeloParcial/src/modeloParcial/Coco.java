package modeloParcial;

public class Coco extends Bacteria{
	
	private double radio;

	public Coco(double radio, int edad) {
		super(edad);
		this.radio = radio;
	}

	@Override
	public double consumoO2() {
		return 2 * this.radio;
	}

}
