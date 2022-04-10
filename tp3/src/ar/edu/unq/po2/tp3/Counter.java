package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	private List<Integer> numeros = new ArrayList<Integer>();

	public void agregarNumero(int numero) {
		getNumeros().add(numero);

	}

	public int contarPares() {
		int cantidad = 0;
		for (int i = 0; i < getNumeros().size(); i++) {
			if (getNumeros().get(i) % 2 == 0)
				cantidad++;
		}
		return cantidad;
	}

	private List<Integer> getNumeros() {
		return numeros;
	}

	public Integer contarImpares() {
		int cantidad = 0;
		for (int i = 0; i < getNumeros().size(); i++) {
			if (getNumeros().get(i) % 2 != 0) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public Integer contarMultiplo(int x) {
		int multiplos = 0;
		for (int i = 0; i < getNumeros().size(); i++) {
			if (getNumeros().get(i) % x == 0) {
				multiplos++;
			}
		}
		return multiplos;
	}
	
	public Integer obtenerNumeroConMayorCantDigitosPares(List<Integer> listaNumeros) {
		int nroConMayorCant = listaNumeros.get(0);
		for (int i = 1; i < listaNumeros.size(); i++) {
			nroConMayorCant = mayorEntre2Nros(nroConMayorCant, listaNumeros.get(i));
		}
		return nroConMayorCant;
	}

	private int mayorEntre2Nros(int nroConMayorCant, Integer numero) {
		int mayor;
		if (digitosParesEn(nroConMayorCant) > digitosParesEn(numero)) {
			mayor = nroConMayorCant;
		} else {
			mayor = numero;
		}
		return mayor;
	}

	private int digitosParesEn(int numero) {
		int cantPares = 0;
		int digito;
		while(numero > 0) {
			digito = numero % 10;
			if(digito % 2 == 0)
				cantPares++;
				numero = numero / 10;
		}
		return cantPares;
	}
	
	public int obtenerMultiploMasAltoDel0Al1000Entre(int x, int y) {
		Integer mayorMultiplo = -1;
		for (int i = 0; i < 1000; i++) {
			if (sonMultiplosDe(x, y, i)) {
				mayorMultiplo = i;
			}
		}
		return mayorMultiploSiExiste(mayorMultiplo);
	}

	private int mayorMultiploSiExiste(Integer mayorMultiplo) {
		if (mayorMultiplo == 0) {
			return -1;
		} else {
			return mayorMultiplo;
		}
	}

	private boolean sonMultiplosDe(int x, int y, int i) {
		return esMultiploDe(x,i) && esMultiploDe(y, i);
	}

	private boolean esMultiploDe(int x, int i) {
		return i % x == 0;
	}
}









