package ar.edu.unq.po2.tp4Interfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.tpInterfaces.CajaMercadoCentral;
import ar.edu.unq.po2.tp4.tpInterfaces.Producto;
import ar.edu.unq.po2.tp4.tpInterfaces.ProductoCooperativa;
import ar.edu.unq.po2.tp4.tpInterfaces.ProductoEmpresaTradicional;

class CajaMercadoCentralTestCase {

	private CajaMercadoCentral caja = new CajaMercadoCentral();

	@BeforeEach
	public void setUp() throws Exception {

		caja.cargarProductos();
		//caja.cargarFacturas();
	}

	@Test
	public void registarProductoEmpresaTradicional() {
		Producto producto = caja.registrarProducto(new ProductoEmpresaTradicional(2));
		assertEquals(producto.getPrecio(), 10.4);
		assertEquals(producto.getStock(), 2);
	}

	@Test
	public void registrarProductoCooperativa() {
		Producto producto = caja.registrarProducto(new ProductoCooperativa(1));
		assertEquals(Math.round(producto.getPrecio()), 100);
		assertEquals(producto.getStock(), 1);
	}
}