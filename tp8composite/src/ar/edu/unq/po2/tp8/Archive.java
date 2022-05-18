package ar.edu.unq.po2.tp8;

import java.time.LocalDate;
import java.util.List;

public class Archive implements FyleSystem {

	private String nombre;
	private Integer espacioEnDisco;
	private LocalDate fechaUltModificacion;

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

}
