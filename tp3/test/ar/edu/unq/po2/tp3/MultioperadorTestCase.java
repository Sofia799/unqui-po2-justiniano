package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	
	Multioperador multioperador = new Multioperador();

	@BeforeEach
	public void setUp() {
		multioperador.addNumber(10);
		multioperador.addNumber(3);
		multioperador.addNumber(0);
		multioperador.addNumber(1);
	}
	
	@Test
	void testSumarTodosLosNumerosDeLaLista() {
		Integer sumaTotal = multioperador.suma();
		
		assertEquals(sumaTotal, 14);
	}
	
	@Test
	void testRestarTodosLosNumerosDeLaLista() {
		Integer restaTotal = multioperador.resta();
		
		assertEquals(restaTotal, 6);
	}
	
	@Test
	void testMultiplicarTodosLosNumerosDeLaLista() {
		Integer multiplicacionTotal = multioperador.multiplicacion();
		
		assertEquals(multiplicacionTotal, 0);
	}

}
