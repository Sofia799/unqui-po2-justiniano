package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	
	Counter counter;
	
	@BeforeEach
	public void setUp() {
		counter = new Counter();
		counter.agregarNumero(1);
		counter.agregarNumero(2);
		counter.agregarNumero(10);
		counter.agregarNumero(9);
		counter.agregarNumero(7);
		counter.agregarNumero(1);
		
	}

	@Test
	void testObtenerNumerosPares() {
		Integer numerosPares = counter.contarPares();
		
		assertEquals(numerosPares, 2);
	}
	
	@Test
	void testObtenerNumerosImpares() {
		Integer numerosImpares = counter.contarImpares();
		
		assertEquals(numerosImpares, 4);
	}
	
	@Test
	void testObtenerMultiplos() {
		Integer multiplos = counter.contarMultiplo(1);
		
		assertEquals(multiplos, 6);
	}
	
	@Test
	void testObtenerElMayorMultiploEntre0Y1000Entre2Numeros() {
		Integer mayorMultiplo = counter.obtenerMultiploMasAltoDel0Al1000Entre(3, 9);
		
		assertEquals(mayorMultiplo, 999);
	}
	
	@Test
	void testObtenerMenosUnoAlBuscarElMayorMultiploEntre0Y1000Entre2Numeros() {
		Integer mayorMultiplo = counter.obtenerMultiploMasAltoDel0Al1000Entre(500, 287);
		
		assertEquals(mayorMultiplo, -1);
	}

}
