package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private Point point;
	private Integer ancho;
	private Integer alto;

	public Rectangulo(Point point, Integer ancho, Integer alto) {
		setPoint(point);
		setAncho(ancho);
		setAlto(alto);
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Integer getAncho() {
		return ancho;
	}

	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}

	public Integer getAlto() {
		return alto;
	}

	public void setAlto(Integer alto) {
		this.alto = alto;
	}

	public Integer calcularArea() {

		return getAncho() * getAlto();
	}

	public Integer calcularPerimetro() {

		return (getAlto() * 2) + (getAncho() * 2);
	}

	public Boolean esHorizontal() {

		return getAncho() > getAlto();
	}

	public Boolean esVertical() {

		return getAlto() > getAncho();
	}

}
