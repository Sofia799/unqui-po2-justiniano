package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {
	EquipoDeTrabajo equipo;
	Persona persona1;
	Persona persona2;
	Persona persona3;
	Persona persona4;
	Persona persona5;
	
	@BeforeEach
	void setUp() throws Exception {
		persona1 = new Persona("Pepe", LocalDate.of(2001, 2, 22));
		persona2 = new Persona("Juana", LocalDate.of(1999, 3, 1));
		persona3 = new Persona("Sergio", LocalDate.of(1990, 3, 9));
		persona4 = new Persona("Leo", LocalDate.of(1995, 1, 30));
		persona5 = new Persona("Mara", LocalDate.of(2000, 7, 10));
		
		List<Persona> integrantes = new ArrayList<Persona>();
		integrantes.add(persona1);
		integrantes.add(persona2);
		integrantes.add(persona3);
		integrantes.add(persona4);
		integrantes.add(persona5);
		
		equipo = new EquipoDeTrabajo("equipo 1", integrantes);
		
	}

	@Test
	void testUnEquipoDeTrabajoConoceSuNombreYElPromedioEdadDeIntegrantes() {
		
		assertEquals(equipo.getNombre(), "equipo 1");
		assertEquals(equipo.promedioEdadIntegrantes(), 25);
		System.out.println(equipo.promedioEdadIntegrantes());
	}

}
