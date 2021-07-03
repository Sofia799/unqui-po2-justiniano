package ar.edu.unq.po2tpComposite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeShifteTestCase {

	ShapeShifterPrueba shapeShift1;
	ShapeShifterPrueba shapeShift2;
	ShapeShifterPrueba shapeShift3;
	
	@BeforeEach
	void setUp() throws Exception {
		
		shapeShift1 = new ShapeShifterPrueba();
		shapeShift2 = new ShapeShifterPrueba();
		shapeShift3 = new ShapeShifterPrueba();

		
	}

	@Test
	void testShapeShiftCompose1Y2Retorna3() {
		
		IShapeShifte shapeShiftRetornado = shapeShift1.compose(shapeShift2);
		
		assertEquals(shapeShiftRetornado, shapeShift3);
	}

}
