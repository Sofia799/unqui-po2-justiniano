package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	List<Integer> numeros = new ArrayList<Integer>();

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void addNumber(int number) {
		getNumeros().add(number);

	}

	public Integer suma() {
		Integer sumaTotal = 0;
		for (int i = 0; i < getNumeros().size(); i++) {
			sumaTotal = sumaTotal + getNumeros().get(i);
		}
		return sumaTotal;
	}
	
	public Integer resta() {
		Integer restaTotal = getNumeros().get(0);
		for (int i = 1; i < getNumeros().size(); i++) {
			restaTotal = restaTotal - getNumeros().get(i);
		}
		return restaTotal;
	}
	
	public Integer multiplicacion() {
		Integer multiplicacionTotal = 1;
		for (int i = 0; i < getNumeros().size(); i++) {
			multiplicacionTotal = multiplicacionTotal * getNumeros().get(i);
		}
		return multiplicacionTotal;
	}

}
