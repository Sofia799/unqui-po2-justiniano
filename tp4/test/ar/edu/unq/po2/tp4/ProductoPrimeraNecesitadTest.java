package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoPrimeraNecesitadTest {

	private ProductoPrimeraNecesidad leche;

	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testCalcularPrecio() {

		assertEquals(new Double(7.2), leche.getPrecio());
	}

}
