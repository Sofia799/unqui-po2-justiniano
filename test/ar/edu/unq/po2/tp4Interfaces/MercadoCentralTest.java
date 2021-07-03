package ar.edu.unq.po2.tp4Interfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.tpInterfaces.MercadoCentral;

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
