package ar.edu.unq.po2tpComposite;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarroDeComprasTestCase {

	CarroDeCompras carrito;
	Product producto1;
	Product producto2;

	@BeforeEach
	void setUp() throws Exception {
		carrito = new CarroDeCompras();
		producto1 = mock(SpecialProduct.class);
		producto2 = mock(SpecialProduct.class);

	}

	@Test
	void testCarritoDeComprasObtieneTotalDePrecioDeProductos() {

		when(producto1.getPrice()).thenReturn(10.1f);
		when(producto2.getPrice()).thenReturn(5.0f);

		List<Product> productos = new ArrayList<Product>();
		productos.add(producto1);
		productos.add(producto2);

		carrito.setElements(productos);

		float total = carrito.total();

		assertEquals(total, 15.1f);
	}

	@Test
	void testCarritoDeComprasObtieneTotalREDONDEADO() {
		when(producto1.getPrice()).thenReturn(10.8f);
		when(producto2.getPrice()).thenReturn(5.0f);

		List<Product> productos = new ArrayList<Product>();
		productos.add(producto1);
		productos.add(producto2);

		carrito.setElements(productos);

		float totalRedondeado = carrito.totalRounded();

		assertEquals(totalRedondeado, 16);
	}

}
