package ar.edu.unq.po2.tp3;

public class Cuadrado {
	private Point point;
	private Integer lado;

	public Cuadrado(Point point, Integer lado) {
		setPoint(point);
		setLado(lado);
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Integer getLado() {
		return lado;
	}

	public void setLado(Integer lado) {
		this.lado = lado;
	}

	public Integer calcularArea() {
		return getLado() * getLado();
	}

	public Integer calcularPerimetro() {
		return getLado() * 4;
	}

	public Boolean esHorizontal() {
		return false;
	}

	public Boolean EsVertical() {
		return false;
	}

}
