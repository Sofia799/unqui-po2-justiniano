package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {

	private Banco banco = new Banco();
	Cliente cliente = new Cliente("Pepe", "Sarmiento 40", 50, 27000f, 240000f, new CreditoPersonal("Pepe", 25000f, 6));
	Cliente cliente2 = new Cliente("Lola", "Martin Fierro 670", 20, 50000f, 600000f,
			new CreditoHipotecario("Lola", 200f, 4, new Inmobiliaria(20f)));
	Cliente cliente3 = new Cliente("Carlos", "Sarmiento 40", 50, 100f, 1200f, new CreditoPersonal("Carlos", 15000f, 6));
	Cliente cliente4 = new Cliente("Sofia", "Las Flores 65", 70, 2.000f, 24.000f,
			new CreditoHipotecario("Sofia", 600f, 6, new Inmobiliaria(20f)));

	@BeforeEach
	public void setUp() throws Exception {
		banco.bancoConClientesRegistrados(); // 2 clientes

		banco.agregarCliente(cliente);
		banco.agregarCliente(cliente2);
		banco.agregarCliente(cliente3);
		banco.agregarCliente(cliente4);

		banco.recibirSolicitudDeCliente(cliente);
		banco.recibirSolicitudDeCliente(cliente2);
		banco.recibirSolicitudDeCliente(cliente4);
	}

	@Test
	public void testUnBancoAgregaNuevosClientes() {
		int cantidadDeClientes = banco.getClientes().size();

		assertEquals(cantidadDeClientes, 6);
	}

	@Test
	public void testCuandoSeAgregaUnaSolicitudDeCreditoAlBanco_IndicaMontoCuotasYClienteDelClienteSolicitante() {
		CreditoPersonal solicitudCliente = (CreditoPersonal) banco.procesarSolicitudDeCliente(cliente);

		String clienteQuePidioSolicitud = solicitudCliente.getNombreCliente();
		float montoSolicitado = solicitudCliente.getMonto();
		Integer cuotasSolicitadas = solicitudCliente.getCuotas();

		assertEquals(clienteQuePidioSolicitud, "Pepe");
		assertEquals(montoSolicitado, 25000f);
		assertEquals(cuotasSolicitadas, 6);
	}

	@Test
	public void testBancoAceptaOtorgarleElCreditoPersonalSolicitadoPorElCliente() {
		Boolean bancoAceptaOtorgarCreditoPersonal = banco.validarOtorgamientoDeCreditoPersonalACliente(cliente);

		assertTrue(bancoAceptaOtorgarCreditoPersonal);
	}

	@Test
	public void testBancoNOAceptaOtorgarleElCreditoPersonalSolicitadoPorElCliente() {
		Boolean bancoAceptaOtorgarCreditoPersonal = banco.validarOtorgamientoDeCreditoPersonalACliente(cliente3);

		assertFalse(bancoAceptaOtorgarCreditoPersonal);
	}

	@Test
	public void testCuandoSeAgregaUnaSolicitudHipotecariaAlBanco_IndicaMontoCuotasClienteYPropiedadInmobiliariaDelClienteSolicitante() {
		CreditoHipotecario solicitudCliente = (CreditoHipotecario) banco.procesarSolicitudDeCliente(cliente4);

		String clienteQuePidioSolicitud = solicitudCliente.getNombreCliente();
		float montoSolicitado = solicitudCliente.getMonto();
		Integer cuotasSolicitadas = solicitudCliente.getCuotas();
		float valorFiscal = solicitudCliente.getInmobiliaria().getValorFiscal();

		assertEquals(clienteQuePidioSolicitud, "Sofia");
		assertEquals(montoSolicitado, 600);
		assertEquals(cuotasSolicitadas, 6);
		assertEquals(valorFiscal, 20f);
	}

	@Test
	public void testBancoAceptaOtorgarCreditoHipotecarioSolicitadoPorUnCliente() {
		Boolean bancoAceptaOtorgarCreditoHipotecario = banco.validarOtorgamientoDeCreditoHipotecarioACliente(cliente2);

		assertTrue(bancoAceptaOtorgarCreditoHipotecario);
	}

	@Test
	public void testBancoNOAceptaOtorgarCreditoHipotecarioSolicitadoPorUnCliente() {
		Boolean bancoAceptaOtorgarCreditoHipotecario = banco.validarOtorgamientoDeCreditoHipotecarioACliente(cliente4);

		assertFalse(bancoAceptaOtorgarCreditoHipotecario);
	}

}
