package ar.edu.unq.po2.tp3;

import java.util.List;

public class EquipoDeTrabajo {
	String nombre;
	List<Persona> integrantes;

	public EquipoDeTrabajo(String nombre, List<Persona> integrantes) {
		setIntegrantes(integrantes);
		setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Persona> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(List<Persona> integrantes) {
		this.integrantes = integrantes;
	}

	public Double promedioEdadIntegrantes() {
		Double promedio = 0.0;
		for (int i = 0; i < getIntegrantes().size(); i++) {
			promedio = promedio + getIntegrantes().get(i).edad();
		}
		return promedio / getIntegrantes().size();
	}

}
