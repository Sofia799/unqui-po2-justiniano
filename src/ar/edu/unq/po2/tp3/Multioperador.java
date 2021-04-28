package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {

	private ArrayList<Integer> enteros = new ArrayList<Integer>();

	public ArrayList<Integer> getEnteros() {
		return enteros;
	}

	public void setEnteros(ArrayList<Integer> enteros) {
		this.enteros = enteros;
	}

	public void addNumber(int i) {
		getEnteros().add(i);
	}

	public int getSumaElementos() {
		int totalDeSuma = 0;
		for (int i = 0; i < getEnteros().size(); i++) {
			totalDeSuma = totalDeSuma + enteros.get(i);
		}
		return totalDeSuma;
	}

	public int getRestaElementos() {
		int totalDeResta = 0;
		for (int i = 0; i < getEnteros().size(); i++) {
			totalDeResta = totalDeResta - enteros.get(i);
		}
		return totalDeResta;
	}

	public int getMultiplicacionElementos() {
		int totalDeMultiplicacion = 1;
		for (int i = 0; i < getEnteros().size(); i++) {
			totalDeMultiplicacion = totalDeMultiplicacion * enteros.get(i);
		}
		return totalDeMultiplicacion;
	}

}
