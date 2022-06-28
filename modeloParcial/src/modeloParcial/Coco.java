package modeloParcial;

public class Coco extends Bacteria{
	
	private int radio;

	public Coco(int radio, int edad) {
		super(edad);
		this.radio = radio;
	}

	@Override
	public Integer consumoO2() {
		return 2 * this.radio;
	}

}
