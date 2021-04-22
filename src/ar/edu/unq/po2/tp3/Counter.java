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
		// TODO Auto-generated method stub
		
		//this.numeros.add(i);
		getNumeros().add(i);
	}


	public int getEvenOcurrences() {
		int totalPares = 0;
		for (int i = 0; i < getNumeros().size(); i++) {
			Integer valor = getNumeros().get(i);
			if(valor % 2 == 0) {
				totalPares++;
			}
			
		}
		
		
		
		return totalPares;
	}
	
	
}
