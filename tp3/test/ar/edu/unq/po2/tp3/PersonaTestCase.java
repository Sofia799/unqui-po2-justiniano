package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	Persona persona1;
	Persona persona2;

	@BeforeEach
	void setUp() throws Exception {
		persona1 = new Persona("Pepe", LocalDate.of(2001, 2, 22));
		persona2 = new Persona("Juan", LocalDate.of(2004, 9, 12));
	}

	@Test
	void testUnaPersonaPepeConoceSuInformacionBasica() {

		assertEquals(persona1.getNombre(), "Pepe");
		assertEquals(persona1.fechaNacimiento, LocalDate.of(2001, 2, 22));
		assertEquals(persona1.edad(), 21);

	}

	@Test
	void testUnaPersonaJuanConoceSuInformacionBasica() {

		assertEquals(persona2.getNombre(), "Juan");
		assertEquals(persona2.fechaNacimiento, LocalDate.of(2004, 9, 12));
		assertEquals(persona2.edad(), 18);

	}

	@Test
	void testUnaPersonaEsMenorQueOtra() {

		assertTrue(persona2.menorQue(persona1));
	}

}
