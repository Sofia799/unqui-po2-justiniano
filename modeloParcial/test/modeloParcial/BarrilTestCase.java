package modeloParcial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BarrilTestCase {

	Barril barril;
	Consumidor coco;
	Consumidor basilo1;
	Consumidor basilo2;
	Consumidor basilo3;
	Consumidor poblacion1;
	Consumidor subpoblacion;;

	@BeforeEach
	void setUp() throws Exception {
		barril = new Barril(1, 2020);

		coco = new Coco(2, 3);
		basilo1 = new Bacilo(4, 1);
		basilo2 = new Bacilo(3, 4);
		basilo3 = new Bacilo(3, 3);

		poblacion1 = new Poblacion(2);
		subpoblacion = new Poblacion(1);
		
		// 4.a.i
		//barril.añadir(basilo1);

	}

	@Test
	void testCalcularConsumoOxigenoDelBarril() {
		//4.a.ii
		((Poblacion) poblacion1).addConsumidor(coco);
		((Poblacion) subpoblacion).addConsumidor(basilo2);
		((Poblacion) subpoblacion).addConsumidor(basilo3);
		((Poblacion) poblacion1).addConsumidor(subpoblacion);
		
		barril.añadir(poblacion1);
		
		double oxigenoCalculado = barril.getConsumo();
		
		assertEquals(oxigenoCalculado, 7.25);
	}

}
