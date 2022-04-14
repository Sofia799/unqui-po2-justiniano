package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTestCase {
	Point point;
	Cuadrado cuadrado;

	@BeforeEach
	void setUp() throws Exception {
		point = new Point(1, 1);
		cuadrado = new Cuadrado(point, 5);
	}

	@Test
	void testUnCuadradoConoceSuPosicionYSuLado() {
		assertEquals(cuadrado.getLado(), 5);
		assertEquals(cuadrado.getPoint(), point);
	}

	@Test
	void testUnCuadradoConoceSuArea() {
		Integer area = cuadrado.calcularArea();

		assertEquals(area, 25);
	}

	@Test
	void testUnCuadradoConoceSuPerimetro() {
		Integer perimetro = cuadrado.calcularPerimetro();

		assertEquals(perimetro, 20);
	}

	@Test
	void testUnCuadradoNoEsHorizontal() {
		assertFalse(cuadrado.esHorizontal());
	}

	@Test
	void testUnCuadradoNoEsVertical() {
		assertFalse(cuadrado.EsVertical());
	}

}
