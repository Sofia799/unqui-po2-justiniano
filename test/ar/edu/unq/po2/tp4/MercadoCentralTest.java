package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MercadoCentralTest {
	
	private MercadoCentral mercado = new MercadoCentral();
	
	@Test
	public void elMercadoCentralNoTieneProductos() {
		assertTrue(mercado.getProductos().isEmpty());
	}
	
	@Test
	public void elMercadoCentralTieneProductos() {
		mercado.cargarProductos();
		assertTrue(!(mercado.getProductos().isEmpty()));
	}
	
	
}
