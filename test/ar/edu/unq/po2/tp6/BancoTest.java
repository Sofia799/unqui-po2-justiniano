package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {

	private Banco banco = new Banco();
	Cliente cliente = new Cliente("Pepe", "Sarmiento 40", 50, 27000f, 240000f, new CreditoPersonal(150f, 6));

	@BeforeEach
	public void setUp() throws Exception {
		banco.bancoConClientesRegistrados();
		banco.agregarCliente(cliente);
		
		banco.recibirSolicitudDeCliente(cliente);
	}

	@Test
	public void agregarNuevosClientesAlBancoTest() {
		int cantidadDeClientes = banco.getClientes().size();

		assertEquals(cantidadDeClientes, 3);
	}

	@Test
	 public void calcularSolicitudesDeCreditoAlBancoTest() {
		float creditoCalculado = banco.calcularCreditoDeSolicitudDe(cliente);
		
		assertEquals(creditoCalculado, 30f);		
	}
	
	@Test
	public void validarAceptacionDeSolicitudCreditoPersonalTest() {
		
	}
}
