package ar.edu.unq.po2.tp8;

import java.awt.Point;
import java.util.List;

public class Ingeniero extends Ejercito {

	Integer cantidadLajas;
	Point ubicacion;
	List<CeldasCamino> camino;

	public Point getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Point ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Integer getCantidadLajas() {
		return cantidadLajas;
	}

	public void setCantidadLajas(Integer cantidadLajas) {
		this.cantidadLajas = cantidadLajas;
	}

	public void caminarHacia(Point punto) {
		this.construirCaminoDeLajas();
		this.setUbicacion(punto);
	}

	private void construirCaminoDeLajas() {
		camino.stream().forEach(celda -> this.dejarLajaSiCorresponde(celda));

	}

	private void dejarLajaSiCorresponde(CeldasCamino celda) {
		if (!celda.hayLaja()) {
			this.setCantidadLajas(this.getCantidadLajas() - 1);
		}

	}

}
