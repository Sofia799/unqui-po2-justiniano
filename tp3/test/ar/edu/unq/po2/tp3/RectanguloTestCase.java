package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	Point point1;
	Rectangulo rectangulo1;
	Point point2;
	Rectangulo rectangulo2;

	@BeforeEach
	void setUp() throws Exception {
		point1 = new Point(1, 1);
		rectangulo1 = new Rectangulo(point1, 2, 3);// ancho, alto
		point2 = new Point(2, 2);
		rectangulo2 = new Rectangulo(point2, 10, 5);// ancho, alto
	}

	@Test
	void testRectangulo1ConoceSuPosicionSuAnchoYSuAlto() {

		assertEquals(rectangulo1.getPoint(), point1);
		assertEquals(rectangulo1.getAlto(), 3);
		assertEquals(rectangulo1.getAncho(), 2);
	}

	@Test
	void testRectangulo2ConoceSuPosicionSuAnchoYSuAlto() {
		assertEquals(rectangulo2.getPoint(), point2);
		assertEquals(rectangulo2.getAlto(), 5);
		assertEquals(rectangulo2.getAncho(), 10);
	}

	@Test
	void testRectangulo1ConoceSuArea() {
		Integer area = rectangulo1.calcularArea();

		assertEquals(area, 6);
	}

	@Test
	void testRectangulo2ConoceSuArea() {
		Integer area = rectangulo2.calcularArea();

		assertEquals(area, 50);
	}

	@Test
	void testRectangulo1ConoceSuPerimetro() {
		Integer perimetro = rectangulo1.calcularPerimetro();

		assertEquals(perimetro, 10);
	}

	@Test
	void testRectangulo2ConoceSuPerimetro() {
		Integer perimetro = rectangulo2.calcularPerimetro();

		assertEquals(perimetro, 30);
	}

	@Test
	void testRectangulo2EsHorizontal() {

		assertTrue(rectangulo2.esHorizontal());
	}

	@Test
	void testRectangulo1EsVertical() {

		assertTrue(rectangulo1.esVertical());
	}

}
