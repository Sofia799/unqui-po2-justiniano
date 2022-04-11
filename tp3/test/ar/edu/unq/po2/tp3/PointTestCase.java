package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase { 
	Point point;

	@BeforeEach
	void setUp() throws Exception {
		point = new Point();
	}

	@Test
	void testUnPointSeCreaEnLaPosicion00() {
		
		assertEquals(point.getCoordenadaX(), 0);
		assertEquals(point.getCoordenadaY(), 0);
	}
	
	@Test
	void testUnPointSeMueveAOtrasCoordenadas() {
		point.moverse(1,2);
		
		assertEquals(point.getCoordenadaX(), 1);
		assertEquals(point.getCoordenadaY(), 2);
	}
	
	@Test
	void testUnPointSeSumaConOtroPointObteniendoOtroPoint() {
		point.moverse(1, 1);
		point.sumarPoint(2,3);
		
		assertEquals(point.getCoordenadaX(), 3);
		assertEquals(point.getCoordenadaY(), 4);
	}

}
