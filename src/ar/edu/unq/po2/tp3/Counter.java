package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> numeros = new ArrayList<Integer>();

	private ArrayList<Integer> getNumeros() {
		return numeros;
	}

	private void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}

	public void addNumber(int i) {
		// this.numeros.add(i);
		getNumeros().add(i);
	}

	public int getEvenOcurrences() {
		int totalPares = 0;
		for (int i = 0; i < getNumeros().size(); i++) {
			Integer valor = getNumeros().get(i);
			if (valor % 2 == 0) {
				totalPares++;
			}
		}
		return totalPares;
	}

	public int getOddNumbers() {
		int totalImpares = 0;
		for (int i = 0; i < getNumeros().size(); i++) {
			Integer valor = getNumeros().get(i);
			if (valor % 2 == 1) {
				totalImpares++;
			}
		}
		return totalImpares;
	}

	public int getNumerosMultiplosDe(int i) {
		int totalNumerosMultiplos = 0;
		for (int j = 0; j < getNumeros().size(); j++) {
			Integer valor = getNumeros().get(j);
			if (valor % i == 0) {
				totalNumerosMultiplos++;
			}
		}
		return totalNumerosMultiplos;
	}

}
