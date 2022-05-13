package ar.edu.unq.po2.tp8;

import java.awt.Point;
import java.util.List;

public abstract class Ejercito {

	List<Ejercito> personajes;

	public void caminarHacia(Point punto) {
		personajes.stream().forEach(personaje -> personaje.caminarHacia(punto));

	}
}
