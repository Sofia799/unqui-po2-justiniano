package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {

	private Counter counter;

	@BeforeEach
	public void setUp() throws Exception {

		// Se crea el contador
		counter = new Counter();

		// Se agregan los numeros. Un solo par y nueve impares

		counter.addNumber(0);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(2);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);

	}

	@Test
	public void testEvenNumbers() {
		int amount = counter.getEvenOcurrences();

		assertEquals(amount, 3);
	}
	
	@Test
	public void testOddNumbers() {
		int numerosImpares = counter.getOddNumbers();
		
		assertEquals(numerosImpares, 7);
	}
	
	@Test
	public void testMultiplosDeNumeros() {
		int numerosMultiplos = counter.getNumerosMultiplosDe(2);
		
		assertEquals(numerosMultiplos, 3);
	}

}
