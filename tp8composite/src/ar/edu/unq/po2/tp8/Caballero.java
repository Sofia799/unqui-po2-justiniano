package ar.edu.unq.po2.tp8;

import java.awt.Point;

public class Caballero extends Ejercito {

	Point puntoUbicacion;

	public Point getPuntoUbicacion() {
		return puntoUbicacion;
	}

	public void setPuntoUbicacion(Point puntoUbicacion) {
		this.puntoUbicacion = puntoUbicacion;
	}

	public void caminarHacia(Point punto) {
		this.caminarZigZagIzq(punto);
		this.caminarZigZagDer(punto);

	}

	private void caminarZigZagDer(Point punto) {
		// camina en diagonal derecha

	}

	private void caminarZigZagIzq(Point punto) {
		//camina en diagonal izquierda
	}

}
