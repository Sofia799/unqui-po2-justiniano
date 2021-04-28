package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {

	private Multioperador multioperador;

	@BeforeEach
	public void setUp() throws Exception {

		multioperador = new Multioperador();

		multioperador.addNumber(1);
		multioperador.addNumber(2);
		multioperador.addNumber(1);
		multioperador.addNumber(3);
		multioperador.addNumber(2);
		multioperador.addNumber(2);
		multioperador.addNumber(1);
		multioperador.addNumber(4);
		multioperador.addNumber(2);
	}

	@Test
	public void testSumador() {

		int elementosSumados = multioperador.getSumaElementos();

		assertEquals(elementosSumados, 18);

	}

	@Test
	public void testRestador() {

		int elementosRestados = multioperador.getRestaElementos();

		assertEquals(elementosRestados, -18);
	}

	@Test 
	public void multiplicarNumeros() {
		
		int elementosMultiplicados = multioperador.getMultiplicacionElementos();
		
		assertEquals(elementosMultiplicados, 192);
	}

}
