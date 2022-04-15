package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	IngresoPercibido ingresoPercibido1 = new IngresoPercibido("Febrero", "concepto1", 50d);
	IngregoPercibidoHorasExtras ingresoHorasExtras = new IngregoPercibidoHorasExtras("Junio", "concepto3", 100d, 4);
	IngresoPercibido ingresoPercibido2 = new IngresoPercibido("Marzo", "concepto2", 50d);
	Trabajador trabajador1;

	@BeforeEach
	void setUp() throws Exception {
		List<IngresoPercibido> ingresos = new ArrayList<IngresoPercibido>();
		ingresos.add(ingresoPercibido1);
		ingresos.add(ingresoPercibido2);
		ingresos.add(ingresoHorasExtras);
		trabajador1 = new Trabajador(ingresos);

	}

	@Test
	void testTrabajadorTiene3IngresosPercibidos() {
		assertTrue(trabajador1.getIngresos().contains(ingresoPercibido1));
		assertTrue(trabajador1.getIngresos().contains(ingresoPercibido2));
		assertTrue(trabajador1.getIngresos().contains(ingresoHorasExtras));
	}

	@Test
	void testTrabajadorConoceElMontoTotalPercibido() {
		Double montoTotalPercibido = trabajador1.getTotalPercibido();

		assertEquals(montoTotalPercibido, 200.0);
	}

	@Test
	void testTrabajadorConoceSuMontoImponible() {
		Double montoImponible = trabajador1.getMontoImponible();

		assertEquals(montoImponible, 100.0);
	}

	@Test
	void testTrabajadorConoceElImpuestoAPagar() {
		Double montoAPagar = trabajador1.getImpuestoAPagar();

		assertEquals(montoAPagar, 2);
	}

}
