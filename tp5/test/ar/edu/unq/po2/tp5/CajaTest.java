package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	Caja caja;
	ProductoCooperativa producto1;
	ProductoCooperativa producto2;
	ProductoCooperativa producto3;

	@BeforeEach
	void setUp() throws Exception {
		caja = new Caja();
		producto1 = new ProductoCooperativa(200.0);
		producto2 = new ProductoCooperativa(200.0);
		producto3 = new ProductoCooperativa(100.0);
		
		List<ProductoCooperativa> stockDeProducto1 = new ArrayList<ProductoCooperativa>();
		stockDeProducto1.add(producto1);
		stockDeProducto1.add(producto1);
		stockDeProducto1.add(producto1);
		caja.agregar(producto1, stockDeProducto1.size());
		
		List<ProductoCooperativa> stockDeProducto2 = new ArrayList<ProductoCooperativa>();
		stockDeProducto2.add(producto2);
		stockDeProducto2.add(producto2);
		stockDeProducto2.add(producto2);
		stockDeProducto2.add(producto2);
		caja.agregar(producto2, stockDeProducto1.size());
	}

	@Test
	void testRegistrarProductoDeCooperativa() {
		Map<Double, Integer> montoYStock1 = caja.registrarProducto(producto1);
		Map<Double, Integer> montoYStock2 = caja.registrarProducto(producto2);
		
		assertTrue(montoYStock1.containsKey(200.0));
		assertTrue(montoYStock1.containsValue(2));
		
		assertTrue(montoYStock2.containsKey(200.0));
		assertTrue(montoYStock2.containsValue(3));
	}

}
