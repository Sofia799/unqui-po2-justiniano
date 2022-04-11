package ar.edu.unq.po2.tp3;

public class Point {
	Integer coordenadaX;
	Integer coordenadaY;

	public Point() {
		setCoordenadaX(0);
		setCoordenadaY(0);
	}

	public Integer getCoordenadaX() {
		return coordenadaX;
	}

	public Integer getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaX(Integer coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public void setCoordenadaY(Integer coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public void moverse(Integer x, Integer y) {
		setCoordenadaX(x);
		setCoordenadaY(y);
		
	}

	public void sumarPoint(Integer x, Integer y) {
		setCoordenadaX(getCoordenadaX() + x);
		setCoordenadaY(getCoordenadaY() + y);
	}

}
