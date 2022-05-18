package ar.edu.unq.po2.tp8;

import java.time.LocalDate;
import java.util.List;

public class Directory implements FyleSystem {

	private String nombre;
	private LocalDate fechaCreacion;
	private List<FyleSystem> contenido;

	public void addContenido(FyleSystem contenido) {
		this.getContenido().add(contenido);
	}

	public void removeContenido(FyleSystem contenido) {
		this.getContenido().remove(contenido);
	}

	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printStructure() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<FyleSystem> lastModified() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FyleSystem> oldestElement() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<FyleSystem> getContenido() {
		return contenido;
	}
}
