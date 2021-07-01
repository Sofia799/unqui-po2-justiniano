package ar.edu.unq.po2.tpTemplatedMethodAndAdapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

	Empleado empleadoTemporario;
	Empleado empleadoPasante;
	Empleado empleadoDePlanta;

	@BeforeEach
	void setUp() throws Exception {
		empleadoTemporario = new EmpleadoTemporario(5, 1000f, "casado con hijos", 3);
		empleadoPasante = new EmpleadoPasante(6);
		empleadoDePlanta = new EmpleadoDePlanta(3, 3000f);
	}

	@Test
	void testEmpleadoTemporarioTieneSueldoBasicoDe1000Pesos() {

		assertEquals(empleadoTemporario.getSueldoBasico(), 1000f);
	}

	@Test
	void testEmpleadoTemporarioCalcularElPagoDeHorasExtras() {
		Empleado empleadoTemporario2 = new EmpleadoTemporario(5, 1000f, "", 3);

		Float monto = empleadoTemporario2.calcularSueldoAPagar();

		assertEquals(monto, 1025f);

	}

	@Test
	void testEmpleadoTemporarioCalcularSueldoCompletoConTodosLosRequerimientos() {

		Float sueldoEmpleado = empleadoTemporario.calcularSueldoAPagar();

		assertEquals(sueldoEmpleado, 1325f);
	}
	
	@Test
	void testEmpleadoTemporarioCalcularSueldoConDescuento() {
		
		Float sueldoConDescuento = empleadoTemporario.sueldo();
		
		assertEquals(sueldoConDescuento, 1152.75f);
		
	}

	@Test
	void testSueldoEmpleadoPasanteCalcularHorasTrabajadasAlMes() {
		Float sueldoEmpleado = empleadoPasante.calcularSueldoAPagar();

		assertEquals(sueldoEmpleado, 7200f);
	}
	
	@Test
	void testEmpleadoPasanteCalcularSueldoConDescuento() {
		
		Float sueldoConDescuento = empleadoPasante.sueldo();
		
		assertEquals(sueldoConDescuento, 6264f);
		
	}

	@Test
	void testEmpleadoDePlantaTieneSueldoBasicoDe3000Pesos() {

		assertEquals(empleadoDePlanta.getSueldoBasico(), 3000f);
	}
	
	@Test
	void testEmpleadoDePlantaCalcularSueldoConPlus() {
		
		Float sueldo = empleadoDePlanta.calcularSueldoAPagar();
		
		assertEquals(sueldo, 3450f);
		
	}
	
	@Test
	void testEmpleadoDePlantaCalcularSueldoConDescuento() {
		
		Float sueldoConDescuento = empleadoDePlanta.sueldo();
		
		assertEquals(sueldoConDescuento, 3001.5f);
		
	}

}
